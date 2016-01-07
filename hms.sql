/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50173
Source Host           : 127.0.0.1:3306
Source Database       : hms

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2016-01-05 14:44:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bed
-- ----------------------------
DROP TABLE IF EXISTS `bed`;
CREATE TABLE `bed` (
  `b_no` int(20) NOT NULL COMMENT '床号',
  `b_sta` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '病床状态',
  `b_ty` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '病床类型',
  PRIMARY KEY (`b_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for diagnostic_info
-- ----------------------------
DROP TABLE IF EXISTS `diagnostic_info`;
CREATE TABLE `diagnostic_info` (
  `r_id` int(11) NOT NULL COMMENT '挂号单号',
  `d_date` date DEFAULT NULL COMMENT '诊断日期',
  `d_info` varchar(255) DEFAULT NULL COMMENT '诊断记录',
  `d_name` varchar(255) DEFAULT NULL COMMENT '医生姓名',
  `p_name` varchar(255) DEFAULT NULL COMMENT '病人姓名',
  `p_mnos` varchar(255) DEFAULT NULL COMMENT '电子处方',
  `s_name` varchar(255) DEFAULT NULL COMMENT '所属科室',
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dictionary
-- ----------------------------
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `dict_value` varchar(20) NOT NULL COMMENT '字典值，固定，不可变',
  `dict_name` varchar(50) NOT NULL COMMENT '字典名',
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`dict_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dictionary_data
-- ----------------------------
DROP TABLE IF EXISTS `dictionary_data`;
CREATE TABLE `dictionary_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `dict_value` varchar(20) NOT NULL,
  `dictdata_name` varchar(50) NOT NULL,
  `dictdata_value` varchar(20) NOT NULL,
  `is_fixed` char(1) NOT NULL COMMENT ' 0不固定，1固定；固定就不能再去修改了',
  `is_cancel` char(1) DEFAULT NULL,
  `parent_id` char(1) DEFAULT NULL COMMENT '父节点，作为简单的树形结构',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for doctor_info
-- ----------------------------
DROP TABLE IF EXISTS `doctor_info`;
CREATE TABLE `doctor_info` (
  `d_no` int(11) NOT NULL AUTO_INCREMENT COMMENT '医生编号',
  `d_name` varchar(255) DEFAULT NULL COMMENT '医生姓名',
  `d_age` int(11) DEFAULT NULL COMMENT '医生年龄',
  `s_name` varchar(255) DEFAULT NULL COMMENT '科室名称',
  `s_no` int(11) DEFAULT NULL COMMENT '科室编号',
  PRIMARY KEY (`d_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for inhospital_cost
-- ----------------------------
DROP TABLE IF EXISTS `inhospital_cost`;
CREATE TABLE `inhospital_cost` (
  `i_no` int(11) NOT NULL AUTO_INCREMENT,
  `p_no` int(11) DEFAULT NULL,
  `b_no` int(11) DEFAULT NULL,
  `m_no` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL COMMENT '总金额',
  PRIMARY KEY (`i_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for inpatient
-- ----------------------------
DROP TABLE IF EXISTS `inpatient`;
CREATE TABLE `inpatient` (
  `p_no` int(11) NOT NULL,
  `hr_no` int(11) DEFAULT NULL,
  `b_no` int(11) DEFAULT NULL COMMENT '床位号',
  `p_sno` int(11) DEFAULT NULL COMMENT '所在科室',
  `d_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '医生',
  `d_advice` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '医嘱',
  `i_time` date DEFAULT NULL COMMENT '入院时间',
  `o_time` date DEFAULT NULL COMMENT '出院时间',
  `y_change` double DEFAULT NULL COMMENT '预交金额',
  PRIMARY KEY (`p_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for medi_info
-- ----------------------------
DROP TABLE IF EXISTS `medi_info`;
CREATE TABLE `medi_info` (
  `m_no` int(10) NOT NULL COMMENT '药品编号',
  `m_name` varchar(30) DEFAULT NULL COMMENT '药品名称',
  `m_type` varchar(20) DEFAULT NULL COMMENT '药品类型',
  `m_costprice` varchar(20) DEFAULT NULL COMMENT '药品成本价',
  `m_price` varchar(20) DEFAULT NULL COMMENT '药品零售价',
  `m_count` int(20) DEFAULT NULL COMMENT '药品库存',
  `m_produce` varchar(20) DEFAULT NULL COMMENT '药品产地',
  `m_validtime` datetime DEFAULT NULL COMMENT '有效期',
  `m_lotno` varchar(30) DEFAULT NULL COMMENT '药品批号',
  PRIMARY KEY (`m_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for medi_list
-- ----------------------------
DROP TABLE IF EXISTS `medi_list`;
CREATE TABLE `medi_list` (
  `m_no` int(10) NOT NULL AUTO_INCREMENT COMMENT '发药单号',
  `d_name` varchar(20) DEFAULT NULL COMMENT '医生',
  `p_name` varchar(20) DEFAULT NULL COMMENT '病人姓名',
  `m_name` varchar(30) DEFAULT NULL COMMENT '药品名称',
  `m_quantily` int(10) DEFAULT NULL COMMENT '药品数量',
  `m_price` varchar(20) DEFAULT NULL COMMENT '药品单价',
  `sumprice` varchar(20) DEFAULT NULL COMMENT '药单总费用',
  `isin_hos` varchar(255) DEFAULT NULL COMMENT '是否住院',
  PRIMARY KEY (`m_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for operation
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `p_no` int(11) DEFAULT NULL COMMENT '病人号',
  `d_no` int(11) DEFAULT NULL COMMENT '医生号',
  `oper_type` varchar(255) DEFAULT NULL COMMENT '手术类型',
  `oper_time` datetime DEFAULT NULL COMMENT '手术时间',
  `oper_desc` varchar(255) DEFAULT NULL COMMENT '手术描述',
  `oper_result` varchar(255) DEFAULT NULL COMMENT '手术结果',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `p_no` int(40) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `p_sex` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `p_age` int(20) DEFAULT NULL,
  `p_history` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`p_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for register
-- ----------------------------
DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `r_no` int(5) NOT NULL DEFAULT '0',
  `p_name` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `p_id` int(5) DEFAULT NULL,
  `p_cost` double(5,2) DEFAULT NULL,
  `s_name` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`r_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for right
-- ----------------------------
DROP TABLE IF EXISTS `right`;
CREATE TABLE `right` (
  `right_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '权限标识',
  `right_name` varchar(20) DEFAULT NULL COMMENT '权限名',
  `right_pos` int(4) NOT NULL COMMENT '权限位',
  `right_code` bigint(64) NOT NULL COMMENT '权限码',
  `right_URL` varchar(200) NOT NULL COMMENT '权限路径',
  `is_public` char(1) NOT NULL COMMENT '是否公共资源',
  `state` char(2) NOT NULL COMMENT '状态',
  `state_time` datetime DEFAULT NULL COMMENT '状态日期',
  PRIMARY KEY (`right_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '角色标识',
  `role_name` varchar(20) NOT NULL COMMENT '角色名称',
  `role_value` char(5) NOT NULL COMMENT '角色值',
  `create_time` datetime NOT NULL COMMENT '创建日期',
  `state` char(2) NOT NULL COMMENT '状态',
  `state_time` datetime DEFAULT NULL COMMENT '状态日期',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role_right
-- ----------------------------
DROP TABLE IF EXISTS `role_right`;
CREATE TABLE `role_right` (
  `role_id` int(8) NOT NULL COMMENT '角色标识',
  `right_id` int(8) NOT NULL COMMENT '权限标识'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section` (
  `s_no` int(20) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`s_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(5) NOT NULL,
  `user_name` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `user_role` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
