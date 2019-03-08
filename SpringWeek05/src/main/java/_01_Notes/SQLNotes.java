package main.java._01_Notes;

public class SQLNotes {
}

//	CREATE TABLE `spring-transaction`.`address` (
//		  `ADDRESSID` INT NOT NULL COMMENT '',
//		  `STREET` VARCHAR(20) NULL COMMENT '',
//		  `ZIPCODE` VARCHAR(5) NULL COMMENT '',
//		  `CITY` VARCHAR(10) NULL COMMENT '',
//		  PRIMARY KEY (`ADDRESSID`)  COMMENT '');
//
//		 CREATE TABLE `spring-transaction`.`person` (
//		  `ID` INT NOT NULL COMMENT '',
//		  `NAME` VARCHAR(20) NULL COMMENT '',
//		  `SURNAME` VARCHAR(20) NULL COMMENT '',
//		  `BIRTHYEAR` INT NULL COMMENT '',
//		  `ADDRESSID` INT NULL COMMENT '',
//		  PRIMARY KEY (`ID`)  COMMENT '');
//
//
//		 ALTER TABLE `spring-transaction`.`person`
//		ADD FOREIGN KEY (ADDRESSID)
//		REFERENCES `spring-transaction`.`address`(ADDRESSID)
