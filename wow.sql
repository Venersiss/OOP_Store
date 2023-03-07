-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.18-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema weapon_shop
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ weapon_shop;
USE weapon_shop;

--
-- Table structure for table `weapon_shop`.`weapon_store`
--

DROP TABLE IF EXISTS `weapon_store`;
CREATE TABLE `weapon_store` (
  `weapon_id` int(10) unsigned NOT NULL auto_increment,
  `class` varchar(45) NOT NULL default '',
  `name` varchar(45) NOT NULL default '',
  `type` varchar(45) NOT NULL default '',
  `price` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`weapon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `weapon_shop`.`weapon_store`
--

/*!40000 ALTER TABLE `weapon_store` DISABLE KEYS */;
INSERT INTO `weapon_store` (`weapon_id`,`class`,`name`,`type`,`price`) VALUES 
 (16,'Sword','Beginner Sword','Common','5'),
 (17,'Bow','Beginner Bow','Common','5'),
 (18,'Shield','Beginner Shield','Common','5'),
 (19,'Sword','Basic Sword','Common','10'),
 (20,'Bow','Basic Bow','Common','10'),
 (21,'Shield','Beginner Shield','Common','10'),
 (22,'Sword','Apprentice Sword','Rare','20'),
 (23,'Bow','qwe','qwe','qeqw'),
 (24,'Sword','asdas','asdasd','asdasd'),
 (25,'Shield','qweqwe','qeqwe','qweqwe');
/*!40000 ALTER TABLE `weapon_store` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
