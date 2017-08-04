DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(191) NOT NULL DEFAULT '',
  `password` varchar(191) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `ind_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;

INSERT INTO `users` (`id`, `username`, `password`)
VALUES
	(1,'test','098f6bcd4621d373cade4e832627b4f6');

/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;