/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.18 : Database - studywords
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`studywords` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `studywords`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`userId`,`userName`,`password`) values (1,'chun','huang1');

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bookId` int(11) NOT NULL,
  `bookName` char(32) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `book` */

/*Table structure for table `cet4` */

DROP TABLE IF EXISTS `cet4`;

CREATE TABLE `cet4` (
  `wordId` int(11) NOT NULL AUTO_INCREMENT,
  `wordName` varchar(32) NOT NULL,
  `audio` varchar(32) NOT NULL,
  `explanation` varchar(32) NOT NULL,
  `example` varchar(255) DEFAULT NULL,
  `remember` int(11) DEFAULT '0',
  PRIMARY KEY (`wordId`),
  UNIQUE KEY `cet4_wordName_uindex` (`wordName`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `cet4` */

insert  into `cet4`(`wordId`,`wordName`,`audio`,`explanation`,`example`,`remember`) values (1,'spit','[spit]','n. 唾液，口水，小雨 v. 唾吐，吐出，降小雨','The boys were spitting out of the train window ',0),(2,'burst','[bə:st]','n. 破裂，阵，爆发 v. 爆裂，迸发','The police burst through the door',0),(3,'split',' [split]','n. 劈开，裂片，裂口 v. 分离，分开，劈开','Suddenly the box split open and a puppy jumped out',0),(4,'campus',' [kæmpəs]','n. 校园，场地',' The news soon went round the campus',0),(5,'blast',' [blɑ:st]','n. 一阵(强风)，爆炸声，爆破  v. 爆破，摧毁','The bomb blast killed several harmless passers-by',0),(6,'budget',' [bʌdʒit]','n. 预算 vt. 编预算，为...做预算','Next year’s budget will have to be drastically pruned.',0),(7,'bacteria','[bæktiəriə]','n. (复数)细菌',' Bacteria do not have introns.',0),(8,'alter',' [’ɔ:ltə]','v. 改变，更改，阉割，切除','I’ll have to alter the diagram. I’ve made a mistake.',0),(9,'spill',' [spil]','v. 溢出，洒，使...流出，泄漏 n. 溢出，流','Don`studywords`’t jog me, or you’ll make me spill something!',0),(10,'candidate','[’kændidit]','n. 候选人，求职者','  In my estimation, he is a more suitable candidate.',0),(11,'slip ',' [slip]','v.滑倒；滑脱；疏忽；溜走 adj. 滑动的；有活结的；活络的',' The ship slipped into the harbour at night',0),(12,'consume','  [kən’sju:m]','v. 消耗，花费，挥霍','  Consuming or eager to consume great amounts of food; ravenous',0),(13,'breed ',' [bri:d]','v. 繁殖，养育 n. 品种，血统','  I breed some chicks for pets.',0),(14,'slide','  [slaid]','vi. 滑，滑动，滑入，悄悄地溜走',' House values may begin to slide',0),(15,'dispose',' [di’spəuz]','vt. 倾向于，处置','  I must dispose of the trouble',0),(16,'transmit',' [trænz’mit]','vt. 传输，传送，代代相传，传达 ',' This infection is transmitted by mosquitoes',0),(17,'transport',' [træns’pɔ:t]','n.运输；输送；运送；运输机 v.运输，流放，为强烈的情绪所激动',' The goods have been cased up for transport. ',0),(18,'liberal ',' [’libərəl]','adj. 慷慨的，大方的，自由主义的 n. 自由主义者，开明的人',' Her liberal views were soon revealed as mere posturing.',0),(19,'insignificant',' [insig’nifikənt]','adj. 无关紧要的，可忽略的，不重要的，无用的','  It is a waste of time to listen to his insignificant talk.',0),(20,'nuisance',' [’nju:sns]','n. 讨厌的东西，讨厌的人，伤害','  He was a boring nuisance! I’m glad to be rid of him.',0),(21,'swallow',' [’swɔləu]','n. 燕子，吞咽，一次吞咽的量 vi. 咽口水，忍气吞声','  She swallowed her anger and carried on',0),(22,'mild','  [maild]','adj. 温和的，柔和的',' The punishment inflicted on them was too mild.',0),(23,'transform',' [træns’fɔ:m]','vt. 转换，变形 vi. 改变',' His plans were transformed overnight into reality.',0),(24,'vanish','  [’væniʃ] ','vi. 消失，不见了，绝迹',' Many types of animals have now vanished from the earth',0),(25,'suspicion ',' [səs’piʃən]','n. 猜疑，怀疑','  We regard her behaviour with suspicion.',0),(26,'shift ',' [ʃift] ','n. 交换，变化，移动，接班者',' The Left is shifting its ground',0),(27,'vary',' [’vɛəri]','v. 变化，改变，使多样化',' She varied her dress as fashion changes.',0);

/*Table structure for table `cet6` */

DROP TABLE IF EXISTS `cet6`;

CREATE TABLE `cet6` (
  `wordId` int(11) NOT NULL AUTO_INCREMENT,
  `wordName` varchar(32) NOT NULL,
  `audio` varchar(32) NOT NULL,
  `explanation` varchar(32) NOT NULL,
  `example` varchar(255) DEFAULT NULL,
  `remember` int(11) DEFAULT '0',
  PRIMARY KEY (`wordId`),
  UNIQUE KEY `cet6_wordName_uindex` (`wordName`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

/*Data for the table `cet6` */

insert  into `cet6`(`wordId`,`wordName`,`audio`,`explanation`,`example`,`remember`) values (1,'acute ','[ə’kju:t]','adj. 敏锐的，剧烈的','The patient is complaining of acute earache.',0),(2,'acknowledge','[ək’nɔlidʒ]','vt. 承认，公认，告知收到，表示感谢，注意到','He is unwilling to acknowledge defeat.',0),(3,'absurd',' [əb’sə:d]','adj. 荒唐的',' He looked absurd in that get-up',0),(4,'acquaint','[ə’kweint]','vt. 使...熟知','You must acquaint yourself with your new duties.',0),(5,'abrupt','[ə’brʌpt]','adj. 突然的，意外的，唐突的，陡峭的','It’s very unlike him to be so abrupt.',0),(6,'activate','[’æktiveit]','v. 激活，使活动，起动',' A similar device used to release or activate a mechanism',0),(7,'abolish','[ə’bɔliʃ]','vt. 废止，革除','There are many bad customs and laws that ought to be abolished',0),(8,'abundance','[ə’bʌndəns]','n. 丰富，充裕',' The state of being profuse; abundance.',0),(9,'adhere','[əd’hiə]','vi. 坚守于，对...忠贞，紧抓着，遵守 ',' We adhere to the principle that everyone should be treated fairly',0),(10,'academy','[ə’kædəmi]','n. 学院，学术，学会',' Royal Academy of Music',0),(11,'accommodate ','[ə’kɔmədeit]','vi. 使自己适应','The bank is accommodating its customers more than it used to',0),(12,'accessory','[æk’sesəri]','adj. 附属的(副的，辅助的) n. 附件，同谋','He is Tom’s accessory.',0),(13,'abnormal ','[æb’nɔ:məl]','adj. 反常的，不正常的，不规则的 n. 不正常的人','An abnormal fear of high places.',0),(14,'acquisition','[.ækwi’ziʃən]','n. 获得，所获之物','The school has a valuable new acquisition',0),(15,'accord','[ə’kɔ:d]','n. 一致，符合 v. 使一致，调解，给予','The teachers praised him with one accord',0),(16,'aggravate','[’ægrəveit]','vt. 加重；使恶化；激怒',' Don’t aggravate me, child.',0),(17,'advent','[’ædvənt]','n. 出现，到来','The advent of the computer changed people’s life greatly. ',0),(18,'advocate ','[’ædvəkeit,’ædvəkit]','n. 提倡者，拥护者，辩护者，律师 v. 主张，提倡','This judge is a strong advocate of prison reform.',0),(19,'agenda',' [ə’dʒendə]','n. 议事日程','This agenda will form the basis of our next meeting',0),(20,'aerial',' [’ɛəriəl]','adj. 空中的，航空的，空想的','  He was a boring nuisance! I’m glad to be rid of him.',0),(21,'affirm','[ə’fə:m]','vt. 证实，断言，肯定 vi. 断言，申明',' I affirm that what he said is true.',0),(22,'administer','[əd’ministə] ','vt. 管理，执行，给与，用(药)','He administer a large pension fund',0),(23,'adolescent','[.ædə’lesnt]','adj. 青春期的，青少年的 n. 青少年','Many adolescents suffer from/have acne',0),(24,'adjacent','[ə’dʒeisnt]','adj. 毗连的，邻近的，接近的','An edge and the area immediately adjacent to it; a border',0),(25,'afflict ','[ə’flikt]','vt. 使苦恼，折磨',' Of or afflicted with flatfoot.',0),(26,'aesthetic','[i:s’θetik] ','adj. 美学的，审美的，有美感的 n.审美观','The play was an aesthetic success. ',0),(27,'affiliate ','[ə’filieit]','n. 附属机构，分公司 vt. 使隶属于，接纳，追溯','The college is affiliated to (或 with) the university.',0),(28,'adjoin','[ə’dʒɔin]','v. 邻接，毗连，邻接','Property that adjoins ours',0);

/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `noticeId` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(100) DEFAULT NULL,
  `creatTime` date NOT NULL,
  PRIMARY KEY (`noticeId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `notice` */

insert  into `notice`(`noticeId`,`content`,`creatTime`) values (1,'欢迎来到学习英语系统','2020-04-09');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(8) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `userName` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱',
  `activeCode` varchar(100) DEFAULT NULL,
  `activeStatus` int(11) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userId`,`userName`,`password`,`email`,`activeCode`,`activeStatus`) values (1,'weirdchun','123','904859570@qq.com',NULL,1),(2,'Weirdchun','123','18645230407@163.com',NULL,1);

/*Table structure for table `word` */

DROP TABLE IF EXISTS `word`;

CREATE TABLE `word` (
  `wordId` int(11) NOT NULL,
  `wordName` varchar(32) DEFAULT NULL,
  `explanation` varchar(32) DEFAULT NULL,
  `audio` varchar(32) DEFAULT NULL,
  `phonetic` varchar(32) DEFAULT NULL,
  `example` varchar(255) DEFAULT NULL,
  `phrase` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `word` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
