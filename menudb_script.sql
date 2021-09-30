CREATE SCHEMA IF NOT EXISTS `menudb` DEFAULT CHARACTER SET utf8 ;
USE `menudb` ;

CREATE TABLE IF NOT EXISTS `menudb`.`users` (
  `email` VARCHAR(25) NOT NULL,
  `user` VARCHAR(25) NOT NULL,
  `password` VARCHAR(25) NOT NULL,
  `rol_id` INT NOT NULL,
  PRIMARY KEY (`email`));

CREATE TABLE IF NOT EXISTS `menudb`.`rols` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(25) NOT NULL,
  `descripcion` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `menudb`.`permisos` (
  `id` INT(25) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(25) NOT NULL,
  `tabla` INT(25) NOT NULL,
  `rol_id` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `menudb`.`menus` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(25) NOT NULL,
  `descripcion` VARCHAR(25) NOT NULL,
  `user_id` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `menudb`.`secciones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(25) NOT NULL,
  `descripcion` VARCHAR(25) NOT NULL,
  `menu_id` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `menudb`.`platos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(25) NOT NULL,
  `descripcion` VARCHAR(25) NOT NULL,
  `precio` DECIMAL(8,2) NOT NULL,    
  `seccion_id` INT NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `users`
ADD FOREIGN KEY (`rol_id`) REFERENCES `rols`(`id`);

ALTER TABLE `permisos`
ADD FOREIGN KEY (`rol_id`) REFERENCES `rols`(`id`);

ALTER TABLE `menus`
ADD FOREIGN KEY (`user_id`) REFERENCES `users`(`email`);

ALTER TABLE `secciones`
ADD FOREIGN KEY (`menu_id`) REFERENCES `menus`(`id`);

ALTER TABLE `platos`
ADD FOREIGN KEY (`seccion_id`) REFERENCES `secciones`(`id`);

