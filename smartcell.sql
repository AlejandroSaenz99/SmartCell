-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 11-10-2022 a las 18:50:04
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `smartcell`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centrocarga`
--

DROP TABLE IF EXISTS `centrocarga`;
CREATE TABLE IF NOT EXISTS `centrocarga` (
  `Tipo` varchar(30) NOT NULL,
  `Precio` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `centrocarga`
--

INSERT INTO `centrocarga` (`Tipo`, `Precio`) VALUES
('V8', 250),
('Tipo C', 350),
('Iphone', 300),
('Otro', 400);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcas`
--

DROP TABLE IF EXISTS `marcas`;
CREATE TABLE IF NOT EXISTS `marcas` (
  `Marca` varchar(50) NOT NULL,
  PRIMARY KEY (`Marca`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `marcas`
--

INSERT INTO `marcas` (`Marca`) VALUES
('Iphone'),
('samsung');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelos`
--

DROP TABLE IF EXISTS `modelos`;
CREATE TABLE IF NOT EXISTS `modelos` (
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  PRIMARY KEY (`marca`,`modelo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `modelos`
--

INSERT INTO `modelos` (`marca`, `modelo`) VALUES
('Iphone', '12 Pro Max'),
('samsung', 'J5 pro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pass`
--

DROP TABLE IF EXISTS `pass`;
CREATE TABLE IF NOT EXISTS `pass` (
  `Id` int(11) NOT NULL,
  `Contraseña` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pass`
--

INSERT INTO `pass` (`Id`, `Contraseña`) VALUES
(0, 'Admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `Id` int(11) NOT NULL,
  `Descripcion` varchar(50) NOT NULL,
  `Precio` double NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`Id`, `Descripcion`, `Precio`) VALUES
(1001, 'cristal templado', 55),
(1002, 'Cargador 1 hora V8', 170);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

DROP TABLE IF EXISTS `registros`;
CREATE TABLE IF NOT EXISTS `registros` (
  `Numero_De_Servicio` int(11) NOT NULL,
  `Fecha` varchar(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Telefono` varchar(30) NOT NULL,
  `Tipo` varchar(100) NOT NULL,
  `Marca` varchar(100) NOT NULL,
  `Modelo` varchar(100) NOT NULL,
  `Estado` varchar(11) NOT NULL,
  `Servicio` varchar(100) NOT NULL,
  `Nota` varchar(500) NOT NULL,
  `Precio` double NOT NULL,
  `Anticipo` double NOT NULL,
  `Total` double NOT NULL,
  `Status` varchar(15) NOT NULL,
  PRIMARY KEY (`Numero_De_Servicio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`Numero_De_Servicio`, `Fecha`, `Nombre`, `Telefono`, `Tipo`, `Marca`, `Modelo`, `Estado`, `Servicio`, `Nota`, `Precio`, `Anticipo`, `Total`, `Status`) VALUES
(10001, '05/10/2022', 'Novio de Dayana', '6393995613', 'Celular', 'samsung', 'J5 pro', 'Encendido', 'Servicio', 'estrellado', 1800, 1000, 800, ''),
(10002, '05/10/2022', 'asdfghjkl', '23456789', 'Celular', 'samsung', 'J5 pro', 'Encendido', 'Centro de carga', 'asdfghjk', 150, 2, 148, ''),
(10003, '05/10/2022', 'Jesus Saenz', '6394731213', 'Celular', 'samsung', 'J5 pro', 'Encendido', 'pantalla oled', 'No se ve', 1800, 100, 1700, ''),
(10004, '05/10/2022', 'Jesus Saenz', '6394731213', 'Celular', 'samsung', 'J5 pro', 'Encendido', 'Servicio', 'No se ve', 1800, 100, 1700, ''),
(10005, '07/10/2022', 'Alejandro Ariceaga Martinez', '6391245304', 'Celular', 'Iphone', '12 Pro Max', 'Encendido', 'Servicio', 'Viene una linea fea', 5000, 3000, 2000, ''),
(10006, '09/10/2022', 'asdsa', '123123', 'Celular', 'sdasdas', 'asdasd', 'Encendido', 'Servicio', 'asdasd', 250, 123, 127, 'Entregado'),
(10007, '11/10/2022', 'Alejandro Arciaga', '123457', 'Celular', 'Iphone', '12 Pro Max', 'Encendido', 'Servicio', 'no hay', 300, 100, 200, 'Entregado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

DROP TABLE IF EXISTS `servicios`;
CREATE TABLE IF NOT EXISTS `servicios` (
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `servicio` varchar(50) NOT NULL,
  `precio` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`marca`, `modelo`, `servicio`, `precio`) VALUES
('samsung', 'J5 pro', 'pantalla oled', 1800),
('Iphone', '12 Pro Max', 'Pantalla', 5000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE IF NOT EXISTS `ventas` (
  `Folio` int(11) NOT NULL,
  `Descripcion` varchar(50) NOT NULL,
  `Precio` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`Folio`, `Descripcion`, `Precio`) VALUES
(1, 'cristal templado', 55),
(1, 'cristal templado', 55),
(1, 'cristal templado', 55),
(1, 'cristal templado', 55),
(2, 'cristal templado', 55),
(2, 'cristal templado', 55),
(2, 'cristal templado', 55),
(2, 'cristal templado', 55),
(3, 'Cargador 1 hora V8', 170),
(3, 'Cargador 1 hora V8', 170),
(3, 'Cargador 1 hora V8', 170),
(3, 'Cargador 1 hora V8', 170),
(3, 'Cargador 1 hora V8', 170),
(4, 'Cargador 1 hora V8', 170),
(4, 'Cargador 1 hora V8', 170),
(4, 'Cargador 1 hora V8', 170),
(4, 'Cargador 1 hora V8', 170),
(4, 'cuadrito', 80);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
