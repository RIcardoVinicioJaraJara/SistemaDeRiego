-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema SistemaDeRiego
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SistemaDeRiego
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SistemaDeRiego` DEFAULT CHARACTER SET utf8 ;
USE `SistemaDeRiego` ;

-- -----------------------------------------------------
-- Table `SistemaDeRiego`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaDeRiego`.`Persona` (
  `idPersona` INT NOT NULL,
  `cedula` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `departameto` VARCHAR(45) NULL,
  `peso` FLOAT NULL,
  `celular` VARCHAR(45) NULL,
  `rol` VARCHAR(45) NULL,
  PRIMARY KEY (`idPersona`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaDeRiego`.`Riego`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaDeRiego`.`Riego` (
  `idRiego` INT NOT NULL,
  `temperatura` VARCHAR(45) NULL,
  `humedad` VARCHAR(45) NULL,
  `tim_inicio` VARCHAR(45) NULL,
  `tim_fin` VARCHAR(45) NULL,
  `tim_dia` VARCHAR(45) NULL,
  `fecha` VARCHAR(45) NULL,
  `Persona` INT NOT NULL,
  PRIMARY KEY (`idRiego`),
  INDEX `fk_Riego_Persona_idx` (`Persona` ASC) ,
  CONSTRAINT `fk_Riego_Persona`
    FOREIGN KEY (`Persona`)
    REFERENCES `SistemaDeRiego`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
