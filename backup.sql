-- MySQL dump 10.17  Distrib 10.3.16-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: userinfo
-- ------------------------------------------------------
-- Server version	10.3.16-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `menu1`
--

DROP TABLE IF EXISTS `menu1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu1` (
  `username` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `dob` varchar(50) NOT NULL,
  `Contact_Info` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Education` varchar(250) DEFAULT NULL,
  `city` varchar(250) DEFAULT NULL,
  `relationship` varchar(250) DEFAULT NULL,
  `occupation` varchar(250) DEFAULT NULL,
  `bio` varchar(200) DEFAULT NULL,
  `ques` int(11) DEFAULT NULL,
  `ans` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu1`
--

LOCK TABLES `menu1` WRITE;
/*!40000 ALTER TABLE `menu1` DISABLE KEYS */;
INSERT INTO `menu1` VALUES ('adminn','Admin','56789:','19/08/2000','1234567890','M',NULL,NULL,NULL,NULL,NULL,2,'kanpur'),('anuragdvd','Anurag Dwivedi','56789:','19/08/1545','135415874','M',NULL,NULL,NULL,NULL,NULL,3,'kumar'),('Root','root','56789:','19/07/1900','9026547124','M',NULL,NULL,NULL,NULL,NULL,2,'kanpur');
/*!40000 ALTER TABLE `menu1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu2`
--

DROP TABLE IF EXISTS `menu2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu2` (
  `user1` varchar(250) NOT NULL,
  `user2` varchar(250) NOT NULL,
  `s1` varchar(250) DEFAULT NULL,
  `s2` varchar(250) DEFAULT NULL,
  `s3` varchar(250) DEFAULT NULL,
  `chat` varchar(50000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu2`
--

LOCK TABLES `menu2` WRITE;
/*!40000 ALTER TABLE `menu2` DISABLE KEYS */;
INSERT INTO `menu2` VALUES ('adminn','anuragdvd','true','true','false',''),('anuragdvd','adminn','true','true','true','anuragdvd____  Hello how are youanuragdvd____  Everything working?adminn____  Yes working');
/*!40000 ALTER TABLE `menu2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-07 17:46:48
