/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 8.0.30 : Database - petsdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`petsdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `petsdb`;

/*Table structure for table `pt_fuwu` */

DROP TABLE IF EXISTS `pt_fuwu`;

CREATE TABLE `pt_fuwu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pic` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pt_fuwu` */

insert  into `pt_fuwu`(`id`,`pic`,`name`) values (1,'../../image/chongwuyiliao.png','疾病治疗'),(2,'../../image/chongwuxiaodu.png','宠物除虫'),(3,'../../image/chongwuxizao.png','宠物洗浴'),(4,'../../image/red-chongwuxiujian.png','宠物洗剪'),(5,'../../image/chongwuwaichu.png','宠物美容'),(6,'../../image/chongwuyimiao.png','疫苗接种');

/*Table structure for table `pt_fuwu_shop` */

DROP TABLE IF EXISTS `pt_fuwu_shop`;

CREATE TABLE `pt_fuwu_shop` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fid` int DEFAULT NULL,
  `title` varchar(30) DEFAULT NULL,
  `shop_desc` varchar(30) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  `pic` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pt_fuwu_shop` */

insert  into `pt_fuwu_shop`(`id`,`fid`,`title`,`shop_desc`,`price`,`pic`) values (1,1,'宠物外科','宠物外部受伤可以选择预约该项目','125','https://sc.68design.net/photofiles/201603/i8EEHJBYzr.jpg'),(2,1,'宠物皮肤病','宠物皮肤病可以选择预约该项目','80','https://sc.68design.net/photofiles/201603/i8EEHJBYzr.jpg'),(4,1,'宠物骨科','宠物骨科可以选择预约该项目','120','https://sc.68design.net/photofiles/201603/i8EEHJBYzr.jpg');

/*Table structure for table `pt_hosp` */

DROP TABLE IF EXISTS `pt_hosp`;

CREATE TABLE `pt_hosp` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hosp_name` varchar(30) DEFAULT NULL,
  `hosp_local` varchar(30) DEFAULT NULL,
  `pic` varchar(30) DEFAULT NULL,
  `hosp_desc` varchar(30) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pt_hosp` */

insert  into `pt_hosp`(`id`,`hosp_name`,`hosp_local`,`pic`,`hosp_desc`,`price`) values (1,'小美宠物医院','上海市','../../image/chongwu.png','一家专业的宠物医院，服务广泛','125'),(2,'小胖宠物医院','上海市','../../image/chongwu.png','一家专业的宠物医院，服务广泛','114'),(3,'小天宠物医院','上海市','../../image/chongwu.png','一家专业的宠物医院，服务广泛','112');

/*Table structure for table `pt_order` */

DROP TABLE IF EXISTS `pt_order`;

CREATE TABLE `pt_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `order_time` varchar(30) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `fuwu_name` varchar(30) DEFAULT NULL,
  `hosp_name` varchar(30) DEFAULT NULL,
  `state` int DEFAULT NULL,
  `yuyue_time` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pt_order` */

insert  into `pt_order`(`id`,`uid`,`username`,`order_time`,`price`,`phone`,`fuwu_name`,`hosp_name`,`state`,`yuyue_time`) values (9,1,'沉默着忍受','2023-1-27 17时59分20秒',245,'18891636432','宠物外科;宠物骨科;','小美宠物医院',0,'2023/3/16'),(13,1,'沉默着忍受','2023-1-27 19时57分48秒',245,'18891636432','宠物外科;宠物骨科;','小美宠物医院',0,'2023/1/27');

/*Table structure for table `pt_pet` */

DROP TABLE IF EXISTS `pt_pet`;

CREATE TABLE `pt_pet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pet_name` varchar(30) DEFAULT NULL,
  `pet_age` varchar(30) DEFAULT NULL,
  `sex` varchar(30) DEFAULT NULL,
  `pic` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `birth_time` varchar(30) DEFAULT NULL,
  `master_id` int DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pt_pet` */

insert  into `pt_pet`(`id`,`pet_name`,`pet_age`,`sex`,`pic`,`birth_time`,`master_id`,`type`) values (1,'肉肉','12','雄性','https://scpic.chinaz.net/files/pic/pic9/201712/bpic4731.jpg','2023-1-26',1,NULL),(3,'小米','1','雌性','../../image/chongwu.png','2023-1-27 16时27分23秒',5,'猫咪CAT');

/*Table structure for table `pt_user` */

DROP TABLE IF EXISTS `pt_user`;

CREATE TABLE `pt_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `sex` varchar(30) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `birth_time` varchar(30) DEFAULT NULL,
  `root` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pt_user` */

insert  into `pt_user`(`id`,`username`,`password`,`sex`,`phone`,`birth_time`,`root`) values (1,'王小明','12345678','女','18891636432','2022-1-25',1),(4,'cs_1101','123456','男','18891636434','2023-1-26 20时1分37秒',1),(5,'1','1','男','18891636435','2023-1-26 22时15分38秒',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
