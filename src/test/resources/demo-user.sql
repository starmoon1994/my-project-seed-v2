/*
Navicat MySQL Data Transfer

Source Server         : Localhost
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-06-23 14:25:27
*/


-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user`
(
    `id`            int(11)      NOT NULL AUTO_INCREMENT,
    `username`      varchar(255) NOT NULL,
    `password`      varchar(255) NOT NULL,
    `nick_name`     varchar(255) DEFAULT NULL,
    `sex`           int(1)       DEFAULT NULL,
    `register_date` datetime     NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`
VALUES ('1', '89921218@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('2', '2@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-2', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('3', '3@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-3', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('4', '4@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-4', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('5', '5@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-5', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('6', '6@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-6', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('7', '7@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-7', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('8', '8@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-8', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('9', '9@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-9', '1', '2017-06-23 14:24:23');
INSERT INTO `user`
VALUES ('10', '10@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-10', '1', '2017-06-23 14:24:23');


DROP TABLE IF EXISTS `T_ACCOUNT`;
CREATE TABLE IF NOT EXISTS `T_ACCOUNT`
(
    `ID`          bigint auto_increment NOT NULL comment '账户ID',
    `GLOBAL_ID`   varchar(50)           NOT NULL comment '全局id',
    `TOTAL_AMT`   decimal(20, 2)        NOT NULL comment '总金额',
    `FROZEN_AMT`  decimal(20, 2)        NOT NULL comment '冻结金额',
    `HOT_ACCOUNT` tinyint(4)            NOT NULL comment '是否热点账户',
    `CR_DATETIME` datetime              NOT NULL comment '创建时间',
    `LM_DATETIME` datetime              NOT NULL comment '更新时间',
    `VERSION`     int(11)               NOT NULL comment '版本号',
    PRIMARY KEY (`ID`),
    index T_ACCOUNT_LM (LM_DATETIME)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 comment '账户余额表';