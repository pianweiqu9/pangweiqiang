package com.qfedu.web.controller;

import com.qfedu.domain.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.ReVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("userlogin.do")
    public String userlogin(String username, String pwd, HttpSession session){
        User user = service.login(username,pwd);
        if (null != user) {
            session.setAttribute("user",user);
            return "index.html";
        }
        return "login.html";
    }

    @PostMapping("userregister.do")
    public String userlogin(User user){
        if (service.register(user)) {
            return "login.html";
        }
       return "register.html";
    }

    @GetMapping("checkName.do")
    @ResponseBody
    public ReVo checkName(String username){
        if (service.checkName(username)) {
            return new ReVo(0);
        }
        return new ReVo(1);
    }
    
    
    @RequestMapping("stuinfo.do")
    public @ResponseBody User myInfo(HttpSession session){
        User user = (User) session.getAttribute("user");
        User ret = service.login(user.getUsername(), user.getPwd());
          Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ret.setDatestr(sdf.format(date));
        return ret;
    }
}
