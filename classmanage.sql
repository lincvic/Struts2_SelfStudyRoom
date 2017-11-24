/*
 Navicat Premium Data Transfer

 Source Server         : Mysql1
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : classmanage

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 11/24/2017 17:39:38 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `blanktime` varchar(255) NOT NULL,
  `classno` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `class`
-- ----------------------------
BEGIN;
INSERT INTO `class` VALUES ('1', '2017/11/11/4', '11408'), ('4', '2017/11/20/4', '6402');
COMMIT;

-- ----------------------------
--  Table structure for `root`
-- ----------------------------
DROP TABLE IF EXISTS `root`;
CREATE TABLE `root` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `root`
-- ----------------------------
BEGIN;
INSERT INTO `root` VALUES ('root', 'root');
COMMIT;

-- ----------------------------
--  Table structure for `stu`
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sno` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 NOT NULL,
  `grade` varchar(255) CHARACTER SET latin1 NOT NULL,
  `email` varchar(255) CHARACTER SET latin1 NOT NULL,
  `phonenum` varchar(11) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `stu`
-- ----------------------------
BEGIN;
INSERT INTO `stu` VALUES ('1', '1514010716', '王一疆', 'Qwerty123', '2', '123@66.com', '13211111111'), ('4', '1111111111', '测试', 'Qwerty123', '1', '123@11.com', '13111111111'), ('5', '1222222222', '测试人员', 'Qwerty123', '1', '123@qq.com', '11111111111');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
