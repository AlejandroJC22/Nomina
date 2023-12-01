-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 01-12-2023 a las 01:04:11
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_nomina`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datosingreso`
--

CREATE TABLE `datosingreso` (
  `Documento` int(11) NOT NULL,
  `Usuario` varchar(255) NOT NULL,
  `Contraseña` varchar(255) NOT NULL,
  `Privilegio` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `datosingreso`
--

INSERT INTO `datosingreso` (`Documento`, `Usuario`, `Contraseña`, `Privilegio`) VALUES
(123, 'Admin', '321', 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `Nombre` varchar(255) NOT NULL,
  `Documento` int(11) NOT NULL,
  `Salario Base` int(11) NOT NULL,
  `Dias laborados` int(11) NOT NULL,
  `Devengado` int(11) NOT NULL,
  `Deducción` int(11) NOT NULL,
  `Sueldo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `liquidación`
--

CREATE TABLE `liquidación` (
  `Nombre` varchar(255) NOT NULL,
  `Documento` int(11) NOT NULL,
  `Salario base` int(11) NOT NULL,
  `Comisión` int(11) NOT NULL,
  `Horas Extra` int(11) NOT NULL,
  `Liquidación` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datosingreso`
--
ALTER TABLE `datosingreso`
  ADD PRIMARY KEY (`Documento`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`Documento`);

--
-- Indices de la tabla `liquidación`
--
ALTER TABLE `liquidación`
  ADD PRIMARY KEY (`Documento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
