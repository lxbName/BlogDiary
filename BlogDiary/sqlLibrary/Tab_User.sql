/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.20.28-3306
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : 192.168.20.28:3306
 Source Schema         : blogDiary

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 12/04/2019 17:48:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Tab_User
-- ----------------------------
DROP TABLE IF EXISTS `Tab_User`;
CREATE TABLE `Tab_User`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `userName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `userPassword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Tab_User
-- ----------------------------
INSERT INTO `Tab_User` VALUES ('123', 'admin', '123');

SET FOREIGN_KEY_CHECKS = 1;
