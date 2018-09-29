/*
Navicat MySQL Data Transfer

Source Server         : 1803
Source Server Version : 50130
Source Host           : localhost:3306
Source Database       : attence

Target Server Type    : MYSQL
Target Server Version : 50130
File Encoding         : 65001

Date: 2018-09-29 16:46:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `flag` int(11) NOT NULL,
  `realname` varchar(255) NOT NULL,
  `stuclass` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '123', '1', '张三', 'java1804');
