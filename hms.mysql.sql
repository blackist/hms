/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.1.73-community : Database - hms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hms`;

/*Table structure for table `bed` */

DROP TABLE IF EXISTS `bed`;

CREATE TABLE `bed` (
  `b_no` int(20) NOT NULL COMMENT '床号',
  `b_sta` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '病床状态',
  `b_ty` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '病床类型',
  PRIMARY KEY (`b_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bed` */

insert  into `bed`(`b_no`,`b_sta`,`b_ty`) values (1,'有','单人间'),(2,'无','双人间'),(3,'有','四人间'),(4,'有','六人间'),(5,'有','双人间'),(6,'无','六人间');

/*Table structure for table `diagnostic_info` */

DROP TABLE IF EXISTS `diagnostic_info`;

CREATE TABLE `diagnostic_info` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '挂号单号',
  `d_date` date DEFAULT NULL COMMENT '诊断日期',
  `d_info` varchar(255) DEFAULT NULL COMMENT '诊断记录',
  `d_name` varchar(255) DEFAULT NULL COMMENT '医生姓名',
  `p_name` varchar(255) DEFAULT NULL COMMENT '病人姓名',
  `p_mnos` varchar(255) DEFAULT NULL COMMENT '电子处方',
  `s_name` varchar(255) DEFAULT NULL COMMENT '所属科室',
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `diagnostic_info` */

insert  into `diagnostic_info`(`r_id`,`d_date`,`d_info`,`d_name`,`p_name`,`p_mnos`,`s_name`) values (1,'2016-01-19','感冒','邵熙','梅朔','无','内科'),(2,'2016-01-19','咳嗽','邵熙','万哥','无','内科'),(3,'2016-01-21','感冒','邵熙','梅朔','无','外科'),(4,'2016-01-21','感冒','邵熙','梅朔','无','外科'),(5,'2016-01-21','感冒','邵熙','梅朔','无','外科'),(6,'2016-01-21','感冒','邵熙','梅朔','无','外科'),(11,'2016-01-21','无','邵熙','梅朔','无','外科'),(12,'2016-01-02','感冒','邵熙','梅朔','无','外科');

/*Table structure for table `dictionary` */

DROP TABLE IF EXISTS `dictionary`;

CREATE TABLE `dictionary` (
  `dict_value` varchar(20) NOT NULL COMMENT '字典值，固定，不可变',
  `dict_name` varchar(50) NOT NULL COMMENT '字典名',
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`dict_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dictionary` */

/*Table structure for table `dictionary_data` */

DROP TABLE IF EXISTS `dictionary_data`;

CREATE TABLE `dictionary_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `dict_value` varchar(20) NOT NULL,
  `dictdata_name` varchar(50) NOT NULL,
  `dictdata_value` varchar(20) NOT NULL,
  `is_fixed` char(1) NOT NULL COMMENT ' 0不固定，1固定；固定就不能再去修改了',
  `is_cancel` char(1) DEFAULT NULL,
  `parent_id` char(1) DEFAULT NULL COMMENT '父节点，作为简单的树形结构',
  PRIMARY KEY (`id`),
  KEY `FKE8A125B3F14440AC` (`dict_value`),
  CONSTRAINT `FKE8A125B3F14440AC` FOREIGN KEY (`dict_value`) REFERENCES `dictionary` (`dict_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dictionary_data` */

/*Table structure for table `doctor_info` */

DROP TABLE IF EXISTS `doctor_info`;

CREATE TABLE `doctor_info` (
  `d_no` int(11) NOT NULL AUTO_INCREMENT COMMENT '医生编号',
  `d_name` varchar(255) DEFAULT NULL COMMENT '医生姓名',
  `d_age` int(11) DEFAULT NULL COMMENT '医生年龄',
  `s_name` varchar(255) DEFAULT NULL COMMENT '科室名称',
  `s_no` int(11) DEFAULT NULL COMMENT '科室编号',
  PRIMARY KEY (`d_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `doctor_info` */

insert  into `doctor_info`(`d_no`,`d_name`,`d_age`,`s_name`,`s_no`) values (1,'华佗',55,NULL,NULL),(2,'陶碧华',54,NULL,NULL),(3,'万哥',23,NULL,NULL),(4,'亮亮',34,NULL,NULL),(5,'邵熙',35,NULL,NULL),(6,'黑黑',45,NULL,NULL),(7,'啦啦',45,NULL,NULL);

/*Table structure for table `inhospital_cost` */

DROP TABLE IF EXISTS `inhospital_cost`;

CREATE TABLE `inhospital_cost` (
  `i_no` int(11) NOT NULL AUTO_INCREMENT,
  `p_no` int(11) DEFAULT NULL,
  `b_no` int(11) DEFAULT NULL,
  `m_no` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL COMMENT '总金额',
  PRIMARY KEY (`i_no`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `inhospital_cost` */

insert  into `inhospital_cost`(`i_no`,`p_no`,`b_no`,`m_no`,`total`) values (1,2016011503,1,1,500),(2,2016011503,1,1,200),(3,2016011503,1,1,300),(4,2016011503,1,1,700),(5,2016011503,1,1,600),(6,2016011503,1,1,900),(7,2016011503,1,1,10000),(13,2016011501,2,1,550),(14,2016011502,3,2,2060);

/*Table structure for table `inpatient` */

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

/*Data for the table `inpatient` */

insert  into `inpatient`(`p_no`,`hr_no`,`b_no`,`p_sno`,`d_name`,`d_advice`,`i_time`,`o_time`,`y_change`) values (2016011501,1,2,2,'啦啦','搜索','2016-01-21','2016-01-29',300),(2016011502,1,3,4,'黑黑','取出','2016-01-13','2016-01-28',2000),(2016011503,1,1,1,'万哥','吃翔','2016-01-19','2016-01-21',250),(2016011504,1,3,3,'万哥','没救啦','2016-01-19','2016-01-22',333),(2016011505,2,1,3,'亮亮','玩游戏','2016-01-01','2016-01-23',2333);

/*Table structure for table `medi_info` */

DROP TABLE IF EXISTS `medi_info`;

CREATE TABLE `medi_info` (
  `m_no` int(10) NOT NULL AUTO_INCREMENT COMMENT '药品编号',
  `m_name` varchar(30) DEFAULT NULL COMMENT '药品名称',
  `m_type` varchar(20) DEFAULT NULL COMMENT '药品类型',
  `m_costprice` varchar(20) DEFAULT NULL COMMENT '药品成本价',
  `m_price` varchar(20) DEFAULT NULL COMMENT '药品零售价',
  `m_count` int(20) DEFAULT NULL COMMENT '药品库存',
  `m_produce` varchar(20) DEFAULT NULL COMMENT '药品产地',
  `m_validtime` datetime DEFAULT NULL COMMENT '有效期',
  `m_lotno` varchar(30) DEFAULT NULL COMMENT '药品批号',
  PRIMARY KEY (`m_no`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `medi_info` */

insert  into `medi_info`(`m_no`,`m_name`,`m_type`,`m_costprice`,`m_price`,`m_count`,`m_produce`,`m_validtime`,`m_lotno`) values (1,'阿莫西林','西药','28','45',500,'江苏徐州',NULL,'20160101'),(2,'泻立停','OTC','202','30',1000,'江苏南京',NULL,'20160202'),(3,'快克胶囊','OTC','25','27',200,'江西南昌',NULL,'20160203'),(4,'999感冒灵','OTC','5','12',2000,'江苏徐州',NULL,'20160204'),(6,'海参','中药','200','300',100,'江苏徐州','2016-01-04 00:19:36','20160302'),(7,'田七','中药','12','15',21,'江苏苏州','2016-01-05 00:20:13','20150201'),(8,'盘龙云海','OTC','15','20',100,'江苏南京',NULL,'20160202001'),(9,'止咳糖浆','OTC','20','30',200,'江苏徐州',NULL,'20160101');

/*Table structure for table `medi_list` */

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `medi_list` */

insert  into `medi_list`(`m_no`,`d_name`,`p_name`,`m_name`,`m_quantily`,`m_price`,`sumprice`,`isin_hos`) values (1,'1','2016011501','1',10,'25','250','y'),(2,'1','2016011502','2',2,'30','60','n'),(3,'2','2016011503','3',10,'500','5000','y');

/*Table structure for table `operation` */

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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `operation` */

insert  into `operation`(`id`,`p_no`,`d_no`,`oper_type`,`oper_time`,`oper_desc`,`oper_result`) values (1,2016011501,5,'皮肤科','2016-01-20 12:16:47','皮肤移植',NULL),(2,2016011502,1,'牙科','2016-01-13 12:17:13','牙神经受损',NULL),(3,2016011503,5,'SA','2016-01-23 00:00:00','ASASASASAS',NULL),(4,2016011502,1,'骨科','2016-01-22 00:00:00','不长个儿',NULL),(5,2016011501,1,'皮肤科','2016-01-21 00:00:00','长得。。。',NULL),(6,2016011503,2,'脑科手术','2016-01-23 00:00:00','脑袋有问题，用老干妈泡一泡',NULL),(7,2016011503,1,'妇科','2016-01-30 00:00:00','乳腺增生',NULL),(8,2016011501,3,'脑科','2016-01-07 00:00:00','手术注意事项',NULL),(9,2016011503,4,'骨科','2016-01-15 00:00:00','静脉曲张导致骨头坏死',NULL);

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `p_no` int(40) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `p_sex` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `p_age` int(20) DEFAULT NULL,
  `p_history` varchar(100) CHARACTER SET utf8 NOT NULL,
  `p_room` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`p_no`)
) ENGINE=InnoDB AUTO_INCREMENT=2016011508 DEFAULT CHARSET=latin1;

/*Data for the table `patient` */

insert  into `patient`(`p_no`,`p_name`,`p_sex`,`p_age`,`p_history`,`p_room`) values (2016011501,'万哥','男',40,'皮肤baozha','皮肤科'),(2016011502,'钢炮','男',21,'个子矮','骨科'),(2016011503,'梅翔','男',22,'脑残','脑科'),(2016011504,'shadow','男',33,'游戏','男科'),(2016011505,'亮亮','男',23,'代码','脑科'),(2016011506,'黑黑','女',34,'LOL','精神科');

/*Table structure for table `register` */

DROP TABLE IF EXISTS `register`;

CREATE TABLE `register` (
  `r_no` int(5) NOT NULL DEFAULT '0',
  `p_name` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `p_id` int(5) DEFAULT NULL,
  `p_cost` double(5,2) DEFAULT NULL,
  `s_name` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`r_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `register` */

/*Table structure for table `right` */

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `right` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '角色标识',
  `role_name` varchar(20) NOT NULL COMMENT '角色名称',
  `role_value` char(5) NOT NULL COMMENT '角色值',
  `create_time` datetime NOT NULL COMMENT '创建日期',
  `state` char(2) NOT NULL COMMENT '状态',
  `state_time` datetime DEFAULT NULL COMMENT '状态日期',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`role_id`,`role_name`,`role_value`,`create_time`,`state`,`state_time`) values (1,'超级管理员','sa','2016-01-19 12:34:03','A','2016-01-04 12:33:59'),(2,'普通管理员','ca','2016-01-19 12:34:28','A',NULL),(3,'门诊医生','dd','2016-01-19 12:34:58','A',NULL),(4,'牙科医生','td','2016-01-19 13:18:33','A',NULL),(5,'脑科医生','hd','2016-01-19 13:18:50','A',NULL);

/*Table structure for table `role_right` */

DROP TABLE IF EXISTS `role_right`;

CREATE TABLE `role_right` (
  `role_id` int(8) NOT NULL COMMENT '角色标识',
  `right_id` int(8) NOT NULL COMMENT '权限标识'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_right` */

/*Table structure for table `section` */

DROP TABLE IF EXISTS `section`;

CREATE TABLE `section` (
  `s_no` int(20) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`s_no`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `section` */

insert  into `section`(`s_no`,`s_name`) values (1,'精神科'),(2,'男科'),(3,'皮肤科'),(4,'骨科'),(5,'脑科'),(6,'心理科');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `user_role` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_name`,`password`,`user_role`) values (1,'sa','123','1'),(8,'black','123','3'),(9,'邵熙','123','4'),(10,'秦冲','123','5'),(11,'梅朔','123','4'),(12,'沈亚东','123','4'),(13,'姜俊杰','123','4'),(14,'董亮亮','123','5'),(15,'梅翔','xzit123456','4'),(16,'王凯','xzit123456','4'),(17,'','xzit123456',''),(21,'亲','xzit123456','4'),(22,'李毅','xzit123456','3'),(23,'DDD','xzit123456','3');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
