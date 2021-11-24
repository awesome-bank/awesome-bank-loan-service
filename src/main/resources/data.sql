DROP TABLE IF EXISTS loan;

CREATE TABLE `loan` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `amount` int NOT NULL
);

INSERT INTO `loan` (`id`,`amount`) VALUES (1,100000);
INSERT INTO `loan` (`id`,`amount`) VALUES (2,200000);
INSERT INTO `loan` (`id`,`amount`) VALUES (3,300000);
