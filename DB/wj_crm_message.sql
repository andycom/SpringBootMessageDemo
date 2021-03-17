/*
 Navicat Premium Data Transfer

 Source Server         : DEV-admin-B1
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : 192.168.5.86:3306
 Source Schema         : wk_crm_single

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 16/03/2021 13:49:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wj_crm_message
-- ----------------------------
DROP TABLE IF EXISTS `wj_crm_message`;
CREATE TABLE `wj_crm_message`  (
  `message_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '公告标题',
  `message_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '消息内容',
  `business_id` int(0) NULL DEFAULT NULL COMMENT '业务id',
  `business_type` tinyint(0) NULL DEFAULT NULL COMMENT '业务类型  1：客户详情  2：null  3:null  5：分配客户 6：线索详情',
  `type` tinyint(0) NULL DEFAULT NULL COMMENT '消息类型  公告notice  1  提醒 Remind 2',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '超链接名称',
  `recipient_user_id` int(0) NULL DEFAULT NULL COMMENT '接收消息用户的id 如果 type是  remind 为用户id  否则为0',
  `publish_time` datetime(0) NULL DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`message_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 66 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
