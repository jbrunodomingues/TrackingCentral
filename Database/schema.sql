SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `TRACKING_CENTRAL` ;
CREATE SCHEMA IF NOT EXISTS `TRACKING_CENTRAL` DEFAULT CHARACTER SET latin1 ;
USE `TRACKING_CENTRAL` ;

-- -----------------------------------------------------
-- Table `TRACKING_CENTRAL`.`TRACK`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TRACKING_CENTRAL`.`TRACK` ;

CREATE  TABLE IF NOT EXISTS `TRACKING_CENTRAL`.`TRACK` (
  `ID_TRACK` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  PRIMARY KEY (`ID_TRACK`) )
  ENGINE = InnoDB
  AUTO_INCREMENT = 24
  DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `TRACKING_CENTRAL`.`POINT_GPS`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TRACKING_CENTRAL`.`POINT_GPS` ;

CREATE  TABLE IF NOT EXISTS `TRACKING_CENTRAL`.`POINT_GPS` (
  `ID_POINT_GPS` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `LATITUDE` DOUBLE NULL DEFAULT NULL ,
  `LONGITUDE` DOUBLE NULL DEFAULT NULL ,
  `REFID_TRACK` INT(10) UNSIGNED NOT NULL DEFAULT '1' ,
  PRIMARY KEY (`ID_POINT_GPS`) ,
  INDEX `REFID_TRACK_idx` (`REFID_TRACK` ASC) ,
  CONSTRAINT `REFID_TRACK`
  FOREIGN KEY (`REFID_TRACK` )
  REFERENCES `TRACKING_CENTRAL`.`TRACK` (`ID_TRACK` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  AUTO_INCREMENT = 51
  DEFAULT CHARACTER SET = latin1;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
