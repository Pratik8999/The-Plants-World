-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: nms
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill_for_rent`
--

DROP TABLE IF EXISTS `bill_for_rent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill_for_rent` (
  `no` varchar(100) DEFAULT NULL,
  `idate` varchar(100) DEFAULT NULL,
  `rdate` varchar(100) DEFAULT NULL,
  `c_no` varchar(100) DEFAULT NULL,
  `c_name` varchar(100) DEFAULT NULL,
  `p_qty` varchar(100) DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
  `p_amt` varchar(100) DEFAULT NULL,
  `late_charges` varchar(100) DEFAULT NULL,
  `p_total` varchar(100) DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_for_rent`
--

LOCK TABLES `bill_for_rent` WRITE;
/*!40000 ALTER TABLE `bill_for_rent` DISABLE KYS */;
/*!40000 ALTER TABLE `bill_for_rent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_for_sale`
--

DROP TABLE IF EXISTS `bill_for_sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill_for_sale` (
  `no` smallint DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  `c_no` smallint DEFAULT NULL,
  `c_name` varchar(100) DEFAULT NULL,
  `p_qty` tinyint DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
  `p_amt` smallint DEFAULT NULL,
  `p_total` smallint DEFAULT NULL
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_for_sale`
--

LOCK TABLES `bill_for_sale` WRITE;
/*!40000 ALTER TABLE `bill_for_sale` DISABLE KEYS */;
INSERT INTO `bill_for_sale` VALUES (123,'2013-01-13 00:00:00',1223,'sdsds',11,'11',0,0),(11,'2013-01-13 00:00:00',123,'arjun',23,'arjuin',1111,2455);
/*!40000 ALTER TABLE `bill_for_sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_issue`
--

DROP TABLE IF EXISTS `customer_issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_issue` (
  `c_no` tinyint DEFAULT NULL,
  `c_name` varchar(100) DEFAULT NULL,
  `c_addr` varchar(100) DEFAULT NULL,
  `c_amt` varchar(100) DEFAULT NULL,
  `IDate` varchar(100) DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_issue`
--

LOCK TABLES `customer_issue` WRITE;
/*!40000 ALTER TABLE `customer_issue` DISABLE KEYS */;
INSERT INTO `customer_issue` VALUES (2,'Mr.Wagh','Pune',650,'2008-01-28 00:00:00'),(3,'Mr.pate','dhule',200,'2008-01-31 00:00:00'),(1,'Mrs.Dalavi','Malrgoan',500,'2008-04-02 00:00:00'),(4,'Mr.Patil','Nashik',300,'2008-04-03 00:00:00'),(5,'Mr.Kale','Pimpalgaon',400,'2008-04-03 00:00:00');
/*!40000 ALTER TABLE `customer_issue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_receive`
--

DROP TABLE IF EXISTS `customer_receive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_receive` (
  `c_no` tinyint DEFAULT NULL,
  `c_name` varchar(100) DEFAULT NULL,
  `c_addr` varchar(100) DEFAULT NULL,
  `c_amt` smallint DEFAULT NULL,
  `RDate` varchar(100) DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_receive`
--

LOCK TABLES `customer_receive` WRITE;
/*!40000 ALTER TABLE `customer_receive` DISABLE KEYS */;
INSERT INTO `customer_receive` VALUES (1,'Mr.Patil','Nashik.',350,'2008-01-02 00:00:00'),(2,'Mr.Wagh','Satara',450,'2008-04-02 00:00:00'),(4,'Mr.Kale','Nashik',300,'2008-04-03 00:00:00');
/*!40000 ALTER TABLE `customer_receive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dstock`
--

DROP TABLE IF EXISTS `dstock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dstock` (
  `p_no` tinyint DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
  `p_categary` varchar(100) DEFAULT NULL,
  `p_stock` tinyint DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dstock`
--

LOCK TABLES `dstock` WRITE;
/*!40000 ALTER TABLE `dstock` DISABLE KEYS */;
INSERT INTO `dstock` VALUES (2,'jasmin','outdoor',57);
/*!40000 ALTER TABLE `dstock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plant`
--

DROP TABLE IF EXISTS `plant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plant` (
  `P_no` tinyint DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
   `p_categary` varchar(100) DEFAULT NULL,
  `p_rate` smallint DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plant`
--

LOCK TABLES `plant` WRITE;
/*!40000 ALTER TABLE `plant` DISABLE KEYS */;
INSERT INTO `plant` VALUES (1,'PETRA','INDOOR',120),(2,'DRESSINA','INDOOR',100),(3,'ESPA GRASS','INDOOR',70),(4,'DYEFERN','INDOOR',90),(5,'CELLUM','INDOOR',400),(6,'STEPLERRA','INDOOR',20),(7,'ELPINA','INDOOR',150),(8,'ZEBRINA','INDOOR',110),(9,'PITONIA','OUTDOOR',15),(10,'SALVIA','OUTDOOR',15),(11,'GAJENIA','OUTDOOR',15),(12,'HIBISCUS','OUTDOOR',20),(13,'ROSE','OUTDOOR',20),(14,'JASVAND','OUTDOOR',30),(15,'PENTAS','OUTDOOR',40),(16,'SONCHAFA','OUTDOOR',300),(17,'SHEVANTI','OUTDOOR',15),(18,'ZENDU','OUTDOOR',15),(19,'PALM','OUTDOOR',300),(20,'JERBERA','SEMISET',120),(21,'DAISY','SEMISET',100),(22,'BALSAM','SEMISET',350),(23,'COLIUS','SEMISET',200),(24,'CHIKKU','FRUITS',40),(25,'ORANGE','FRUITS',60),(26,'TAMRIND','FRUITS',80),(27,'CUSTARD APPLE','FRUITS',35),(28,'ANJIR','FRUITS',40),(29,'MANGO','FRUITS',70),(30,'COCONUT','FRUITS',60),(40,'GUAVA','FRUITS',35),(0,'0','0',0);
/*!40000 ALTER TABLE `plant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase` (
  `o_no` varchar(100) DEFAULT NULL,
  `s_name` varchar(100) DEFAULT NULL,
  `p_categary` varchar(100) DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
  `p_qty` varchar(100) DEFAULT NULL,
  `p_amt` varchar(100) DEFAULT NULL,
  `p_date` varchar(100) DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES ('1','Mr.patil','outdoor','rose','400','20000','1/1/2008'),('2',' S.R.Patil','Indoor','Dressina','80','100','1/1/2008'),('','','','','','',''),('3','mrs.Pawar','Indoor','Petra','40','120','1/1/2008'),('4','Wagh','indoor','espa grass','10','700','1/1/2008'),('5','Raut','indoor','dyeferna','50','90','10/1/2008'),('6','Raut','indoor','cellum','60','400','10/1/2008'),('7','Wagh','indoor','steplera','60','120','11/1/2008'),('8','Wagh','indoor','elpina','50','150','6/1/2008'),('11','Raut','indoor','zebrina','70','110','6/1/2008'),('12','Wagh','outdoor','pitonia','100','15','6/1/2008'),('12','Raut','outdoor','salvia','100','15','7/1/2008'),('13','Patil','outdoor','gajenia','150','15','7/1/2008'),('14','Patil','outdoor','Hibiscus','150','20','9/1/2008'),('15','Pawar','outdoor','Jasvand','150','30','9/1/2008'),('16','Pawar','outdoor','pentas','100','40','10/2/2008'),('17','Pawar','outdoor','sonchafa','100','300','10/2/2008'),('18','Pawar','outdoor','shevanti','200','15','12/2/2008'),('18','Pawar','outdoor','zendu','150','15','11/1/2008'),('19','Pawar','outdoor','kantia palm','80','300','2/3/2008'),('20','Raut','outdoor','ponex palm','100','100','2/3/2008'),('21','Raut','outdoor','arika palm','150','400','11/3/2008'),('22','Raut','outdoor','table palm','200','80','1/1/2008'),('23','Pawar','semiset','jerbera','150','120','9/2/2008'),('24','Raut','semiset','daisy','120','100','9/2/2008'),('25','Pawar','semiset','balsam','120','350','9/2/2008'),('27','Pawar','semiset','colius','120','200','11/1/2008'),('28','Raut','fruit','chiku','60','50','11/1/2008'),('29','Raut','fruit','orange','150','60','11/1/2008'),('30','Pawar','fruit','tarmind','120','75','1/2/2008'),('32','Pawar','fruit','custard apple','100','35','6/2/2008'),('33','Raut','fruit','anjir','80','40','6/2/2008'),('34','Pawar','fruit','hapus','100','50','6/2/2008'),('35','Pawar','fruit','keshar','100','50','9/2/2008'),('36','Pawar','fruit','ratnagiri','100','60','9/2/2008'),('37','Pawar','fruit','baramasi','150','100','9/2/2008'),('38','Pawar','fruit','coconut','100','40','11/2/2008'),('39','Raut','fruit','guava','100','35','11/2/2008'),('40','Raut','lawn grass','--','80','35','12/2/2008'),('41','Pawar','border of road','--','50','40','12/2/2008'),('42','Raut','water lilly','lotus','50','150','12/2/2008'),('43','Raut','water lilly','water lilly','100','250','2/2/2008'),('44','Mr.Patil','outdoor','rose','10','20','4/3/2008'),('1','abhya','outdoor','plam','45','2700','19/2/2009'),('2','NARESH','INDOOR','PETRA','48','5760','19/2/2009'),('7','mr.joshi','fruits','anjir','105','6300','26/2/2009');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale`
--

DROP TABLE IF EXISTS `sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sale` (
  `s_no` smallint DEFAULT NULL,
  `p_categary` varchar(100) DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
  `p_qty` smallint DEFAULT NULL,
  `p_amt` mediumint DEFAULT NULL,
  `s_date` varchar(100) DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale`
--

LOCK TABLES `sale` WRITE;
/*!40000 ALTER TABLE `sale` DISABLE KEYS */;
INSERT INTO `sale` VALUES (1,'outdoor','rose',20,180,'1/1/2008'),(2,'Indoor','Dressina',5,500,'2/1/2008'),(3,'Indoor','Petra',3,360,'3/1/2008'),(4,'Indoor','Espa grass',2,140,'6/1/2008'),(5,'Indoor','Dyefern',5,450,'7/1/2008'),(6,'Indoor','Cellum',8,3200,'9/1/2008'),(7,'Indoor','Steplerra',10,1200,'10/1/2008'),(8,'Indoor','Elpina',8,1200,'11/1/2008'),(9,'Indoor','Zebrina',3,330,'12/1/2008'),(11,'outdoor','pitonia',30,450,'31/1/2008'),(12,'outdoor','salvia',20,300,'1/2/2008'),(13,'outdoor','gajenia',10,150,'1/2/2008'),(14,'outdoor','hibiscus',20,400,'1/2/2008'),(14,'outdoor','jasvand',12,360,'2/2/2008'),(15,'outdoor','pentas',11,440,'4/2/2008'),(16,'outdoor','sonchafa',5,1500,'5/2/2008'),(17,'outdoor','shevanti',20,300,'6/2/2008'),(18,'outdoor','zendu',25,375,'7/2/2008'),(19,'outdoor','kantia palm',3,900,'8/2/2008'),(20,'outdoor','ponex palm',5,500,'9/2/2008'),(21,'outdoor','arika palm',10,400,'10/2/2008'),(22,'outdoor','table palm',20,160,'11/2/2008'),(23,'semiset','jerbera',10,1200,'12/2/2008'),(23,'semiset','daisy',12,1200,'13/2/2008'),(24,'semiset','balsam',10,3500,'14/2/2008'),(25,'semiset','colius',15,3000,'15/2/2008'),(26,'fruit','chiku',10,400,'16/2/2008'),(27,'fruit','orange',10,600,'17/2/2008'),(28,'fruit','tamrind',16,1600,'18/2/2008'),(29,'fruit','custard apple',12,440,'19/2/2008'),(30,'fruit','anjir',10,400,'20/2/2008'),(31,'fruit','hapus',10,400,'21/2/2008'),(32,'fruit','keshar',10,500,'22/2/2008'),(33,'fruit','ratnagiri',12,702,'23/2/2008'),(34,'fruit','baramasi',12,500,'24/2/2008'),(35,'fruit','coconut',20,800,'25/2/2008'),(36,'fruit','guava',10,350,'26/2/2008'),(37,'lawn grass','-',2,100,'27/2/2008'),(38,'border of road','--',3,600,'28/2/2008'),(40,'water lilly','lotus',5,750,'29/2/2008'),(41,'water lilly','water lilly',5,1250,'1/3/2008'),(42,'outdoor','petra',12,200,'4/3/2008'),(43,'outdoor','rose',3,50,'28/5/2008'),(44,'OUTDOOR','ROSE',154,3080,'18/2/2009'),(45,'FRUITS','ANJIR',28,1120,'18/2/2009'),(46,'outdoor','PALM',60,18000,'19/2/2009'),(47,'indoor','PETRA',24,2880,'19/2/2009'),(49,'semiset','daisy',63,6300,'19/2/2009'),(50,'fruits','anjir',28,1120,'19/2/2009'),(56,'fruits','mango',10,600,'26/2/2009'),(51,'fruits','mango',10,600,'26/2/2009'),(12,'as','sas',22,222,'13/1/2013'),(123,'arjun','dada',10,100,'13/1/2013'),(123,'arjun','dada',10,100,'13/1/2013');
/*!40000 ALTER TABLE `sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `ID` int DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
  `p_categary` varchar(100) DEFAULT NULL,
   `p_price` varchar(100) DEFAULT NULL,
  `p_qty` int DEFAULT NULL
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,29,'MANGO','FRUITS','2009-02-18 00:00:00',740),(2,13,'ROSE','OUTDOOR','2009-02-18 00:00:00',840);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-11 17:22:45
