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

 Date: 16/03/2021 13:49:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wj_crm_message_user
-- ----------------------------
DROP TABLE IF EXISTS `wj_crm_message_user`;
CREATE TABLE `wj_crm_message_user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `state` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '是否已读标识  0 未读 1 已读',
  `message_id` bigint(0) NULL DEFAULT NULL COMMENT '消息主键',
  `recipient_user_id` int(0) NULL DEFAULT NULL COMMENT '接收用户id',
  `pull_time` datetime(0) NULL DEFAULT NULL COMMENT '拉取时间',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0' COMMENT '删除标识  1 删除',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `by_userId`(`recipient_user_id`, `state`, `del_flag`) USING BTREE COMMENT '联合索引根据userid 查找消息列表'
) ENGINE = InnoDB AUTO_INCREMENT = 9091 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
