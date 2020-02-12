-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-02-2020 a las 15:29:21
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemaderiego`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL,
  `cedula` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `departameto` varchar(45) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `rol` varchar(45) DEFAULT NULL,
  `contracenia` varchar(45) DEFAULT NULL,
  `correo` varchar(150) NOT NULL,
  `cambiar` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idPersona`, `cedula`, `nombre`, `apellido`, `departameto`, `peso`, `celular`, `rol`, `contracenia`, `correo`, `cambiar`) VALUES
(1, '0105452171', 'Ricardo', 'Jara ', 'adas', 123, '02522', 'ADMIN', '1004', '', 1),
(2, '0105452172', 'AA', 'SA', 'GG', 9, '000', 'USER', '1004', '', 0),
(3, '0105452173', 'USER', 'USER', 'USER', 12, '123123', 'USER', '1004', '', 1),
(4, '0105452179', 'Ricardo ', 'asdasdasd', 'asd', 1, '123123', 'USER', '2163512531', '', 0),
(5, '010545217111', 'q', 'q', 'q', 1, '1', 'ADMIN', '1004', 'vinirj79@gmail.com', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `riego`
--

CREATE TABLE `riego` (
  `idRiego` int(11) NOT NULL,
  `temperatura` varchar(45) DEFAULT NULL,
  `humedad` varchar(45) DEFAULT NULL,
  `regadera` varchar(45) DEFAULT NULL,
  `lluvia` varchar(45) DEFAULT NULL,
  `fecha` varchar(45) DEFAULT NULL,
  `Persona` int(11) NOT NULL,
  `hora` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `riego`
--

INSERT INTO `riego` (`idRiego`, `temperatura`, `humedad`, `regadera`, `lluvia`, `fecha`, `Persona`, `hora`) VALUES
(890, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:51:12'),
(891, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:51:28'),
(892, '17.58', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:51:43'),
(893, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:51:58'),
(894, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:52:14'),
(895, '18.07', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:52:29'),
(896, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:52:44'),
(897, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:53:0'),
(898, '19.53', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:53:15'),
(899, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:53:31'),
(900, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:53:46'),
(901, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:54:1'),
(902, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:54:16'),
(903, '19.53', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:54:32'),
(904, '18.07', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:54:47'),
(905, '17.58', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:55:2'),
(906, '18.07', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:55:18'),
(907, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:55:33'),
(908, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:55:48'),
(909, '20.02', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:56:25'),
(910, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:56:40'),
(911, '20.02', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:57:31'),
(912, '18.07', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:57:46'),
(913, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 2, '16:58:1'),
(914, '17.58', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '16:59:53'),
(915, '18.07', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '17:0:8'),
(916, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '17:0:24'),
(917, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '17:0:39'),
(918, '18.55', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '17:0:54'),
(919, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '17:1:9'),
(920, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '17:1:25'),
(921, '19.04', 'SI', 'INACTIVA', 'NO', '120/1/2', 1, '17:56:39'),
(922, '19.53', 'SI', 'INACTIVA', 'NO', '120/1/2', 1, '17:56:55'),
(923, '20.02', 'SI', 'INACTIVA', 'NO', '120/1/2', 1, '17:57:10'),
(924, '22.95', 'SI', 'INACTIVA', 'NO', '120/1/2', 1, '17:57:25'),
(925, '19.53', 'SI', 'INACTIVA', 'NO', '120/1/2', 1, '17:57:41'),
(926, '21.48', 'SI', 'ACTIVO', 'NO', '120/1/2', 1, '17:57:56'),
(927, '20.02', 'SI', 'INACTIVA', 'NO', '120/1/2', 1, '17:58:11'),
(928, '18.07', 'SI', 'INACTIVA', 'NO', '120/1/2', 1, '17:58:26'),
(929, '21.48', 'NO', 'ACTIVO', 'NO', '120/1/2', 1, '17:58:41'),
(930, '21.48', 'NO', 'ACTIVO', 'NO', '120/1/2', 1, '17:58:56'),
(931, '20.51', 'NO', 'ACTIVO', 'NO', '120/1/2', 1, '17:59:11'),
(932, '21.48', 'NO', 'ACTIVO', 'NO', '120/1/2', 1, '17:59:27'),
(933, '21.48', 'NO', 'ACTIVO', 'NO', '120/1/2', 1, '17:59:42'),
(934, '21.97', 'NO', 'ACTIVO', 'NO', '120/1/2', 1, '17:59:57'),
(935, '21.97', 'NO', 'ACTIVO', 'NO', '120/1/2', 1, '18:0:12'),
(936, '21.97', 'NO', 'ACTIVO', 'SI', '120/1/2', 1, '18:0:27'),
(937, '21.97', 'NO', 'ACTIVO', 'SI', '120/1/2', 1, '18:0:42'),
(938, '21.48', 'NO', 'ACTIVO', 'SI', '120/1/2', 1, '18:0:57'),
(939, '21.48', 'NO', 'ACTIVO', 'SI', '120/1/2', 1, '18:1:13'),
(940, '21.48', 'NO', 'ACTIVO', 'SI', '120/1/2', 1, '18:1:28'),
(941, '18.55', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:1:43'),
(942, '20.02', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:1:58'),
(943, '19.04', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:2:14'),
(944, '19.53', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:2:29'),
(945, '18.55', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:2:44'),
(946, '18.07', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:2:59'),
(947, '20.02', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:3:15'),
(948, '18.55', 'NO', 'INACTIVA', 'SI', '120/1/2', 1, '18:3:30'),
(949, '18.07', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '18:3:46'),
(950, '19.04', 'NO', 'INACTIVA', 'NO', '120/1/2', 1, '18:4:1'),
(951, '18.55', 'SI', 'INACTIVA', 'NO', '2020/2/11', 1, '11:41:25'),
(952, '19.04', 'SI', 'INACTIVA', 'NO', '2020/2/11', 1, '11:41:38'),
(953, '17.09', 'SI', 'INACTIVA', 'NO', '2020/2/11', 1, '11:41:53'),
(954, '19.04', 'SI', 'INACTIVA', 'NO', '2020/2/11', 1, '11:42:9'),
(955, '18.55', 'SI', 'INACTIVA', 'NO', '2020/2/11', 1, '11:42:24'),
(956, '19.53', 'SI', 'INACTIVA', 'NO', '2020/2/11', 1, '11:42:39'),
(957, '19.04', 'SI', 'INACTIVA', 'NO', '2020/2/12', 1, '0:8:26'),
(958, '17.58', 'SI', 'INACTIVA', 'NO', '2020/2/12', 1, '0:9:23'),
(959, '18.55', 'SI', 'INACTIVA', 'NO', '2020/2/12', 1, '0:9:39'),
(960, '17.09', 'SI', 'INACTIVA', 'NO', '2020/2/12', 1, '0:9:54'),
(961, '18.07', 'SI', 'INACTIVA', 'NO', '2020/2/12', 2, '0:10:51'),
(962, '18.55', 'SI', 'INACTIVA', 'NO', '2020/2/12', 2, '0:11:6'),
(963, '19.53', 'SI', 'INACTIVA', 'NO', '2020/2/12', 2, '0:11:22'),
(964, '17.58', 'SI', 'INACTIVA', 'NO', '2020/2/12', 2, '0:11:37'),
(965, '17.58', 'SI', 'INACTIVA', 'NO', '2020/2/12', 2, '0:11:52'),
(966, '18.55', 'SI', 'INACTIVA', 'NO', '2020/2/12', 2, '0:12:8'),
(967, '17.58', 'SI', 'INACTIVA', 'NO', '2020/2/12', 2, '0:12:23'),
(968, '18.55', 'NO', 'INACTIVA', 'NO', '2020/2/12', 2, '0:12:39'),
(969, '18.55', 'NO', 'INACTIVA', 'NO', '2020/2/12', 2, '0:12:54'),
(970, '17.58', 'NO', 'INACTIVA', 'NO', '2020/2/12', 2, '0:13:9'),
(971, '19.04', 'NO', 'INACTIVA', 'NO', '2020/2/12', 2, '0:13:25'),
(972, '18.07', 'NO', 'INACTIVO', 'NO', '2020/2/12', 2, '0:14:10'),
(973, '17.58', 'SI', 'INACTIVO', 'NO', '2020/2/12', 2, '0:14:25'),
(974, '19.53', 'SI', 'ACTIVO', 'NO', '2020/2/12', 2, '0:14:41'),
(975, '20.02', 'SI', 'ACTIVO', 'NO', '2020/2/12', 2, '0:14:56');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPersona`);

--
-- Indices de la tabla `riego`
--
ALTER TABLE `riego`
  ADD PRIMARY KEY (`idRiego`),
  ADD KEY `fk_Riego_Persona_idx` (`Persona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `riego`
--
ALTER TABLE `riego`
  MODIFY `idRiego` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=976;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `riego`
--
ALTER TABLE `riego`
  ADD CONSTRAINT `fk_Riego_Persona` FOREIGN KEY (`Persona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
