-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 21-09-2019 a las 00:37:57
-- Versión del servidor: 5.7.23
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gorest`
--
CREATE DATABASE IF NOT EXISTS `gorest` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `gorest`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `album`
--

DROP TABLE IF EXISTS `album`;
CREATE TABLE IF NOT EXISTS `album` (
  `id_Album` int(11) NOT NULL,
  `id_User` int(11) NOT NULL,
  `Title` varchar(100) NOT NULL,
  `Self` varchar(500) NOT NULL,
  `Edit` varchar(500) NOT NULL,
  PRIMARY KEY (`id_Album`),
  KEY `fk_user_album` (`id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coment`
--

DROP TABLE IF EXISTS `coment`;
CREATE TABLE IF NOT EXISTS `coment` (
  `id_Coment` int(11) NOT NULL,
  `id_Post` int(11) NOT NULL,
  `Body` mediumtext NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(500) NOT NULL,
  `Self` varchar(500) NOT NULL,
  `Edit` varchar(500) NOT NULL,
  PRIMARY KEY (`id_Coment`),
  KEY `fk_post_coment` (`id_Post`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `photo`
--

DROP TABLE IF EXISTS `photo`;
CREATE TABLE IF NOT EXISTS `photo` (
  `id_Photo` int(11) NOT NULL,
  `id_Album` int(11) NOT NULL,
  `Title` varchar(100) NOT NULL,
  `Url` varchar(500) NOT NULL,
  `Thumbnail` varchar(500) NOT NULL,
  `Self` varchar(500) NOT NULL,
  `Edit` varchar(500) NOT NULL,
  PRIMARY KEY (`id_Photo`),
  KEY `fk_album_photo` (`id_Album`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `post`
--

DROP TABLE IF EXISTS `post`;
CREATE TABLE IF NOT EXISTS `post` (
  `id_Post` int(11) NOT NULL,
  `id_User` int(11) NOT NULL,
  `Title` varchar(100) NOT NULL,
  `Body` mediumtext NOT NULL,
  `Self` varchar(500) NOT NULL,
  `Edit` varchar(500) NOT NULL,
  PRIMARY KEY (`id_Post`),
  KEY `fk_user_post` (`id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id_User` int(11) NOT NULL,
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Dob` varchar(50) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Phone` varchar(100) NOT NULL,
  `Website` varchar(200) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Status` varchar(100) NOT NULL,
  `Self` varchar(500) NOT NULL,
  `Edit` varchar(500) NOT NULL,
  `Avatar` varchar(500) NOT NULL,
  PRIMARY KEY (`id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`username`, `password`) VALUES
('test', 'test123'),
('angelone', 'angelone21');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `album`
--
ALTER TABLE `album`
  ADD CONSTRAINT `fk_user_album` FOREIGN KEY (`id_User`) REFERENCES `user` (`id_User`);

--
-- Filtros para la tabla `coment`
--
ALTER TABLE `coment`
  ADD CONSTRAINT `fk_post_coment` FOREIGN KEY (`id_Post`) REFERENCES `post` (`id_Post`);

--
-- Filtros para la tabla `photo`
--
ALTER TABLE `photo`
  ADD CONSTRAINT `fk_album_photo` FOREIGN KEY (`id_Album`) REFERENCES `album` (`id_Album`);

--
-- Filtros para la tabla `post`
--
ALTER TABLE `post`
  ADD CONSTRAINT `fk_user_post` FOREIGN KEY (`id_User`) REFERENCES `user` (`id_User`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
