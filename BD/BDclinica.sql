-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.25 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para bdclinicadental
CREATE DATABASE IF NOT EXISTS `bdclinicadental` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdclinicadental`;

-- Volcando estructura para tabla bdclinicadental.cita
CREATE TABLE IF NOT EXISTS `cita` (
  `idCita` int NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `paciente_idPaciente` int NOT NULL,
  PRIMARY KEY (`idCita`),
  KEY `fk_cita_paciente_idx` (`paciente_idPaciente`),
  CONSTRAINT `fk_cita_paciente` FOREIGN KEY (`paciente_idPaciente`) REFERENCES `paciente` (`idPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.cita: ~11 rows (aproximadamente)
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
REPLACE INTO `cita` (`idCita`, `fecha`, `hora`, `status`, `paciente_idPaciente`) VALUES
	(1, '2021-07-03', '17:00:00', 2, 1),
	(2, '2021-07-03', '17:30:00', 2, 3),
	(3, '2021-07-02', '19:00:00', 2, 5),
	(4, '2021-07-04', '08:00:00', 2, 4),
	(5, '2021-07-03', '15:00:00', 1, 2),
	(10, '2021-07-20', '10:45:00', 2, 4),
	(11, '2021-09-01', '15:30:00', 0, 5),
	(12, '2021-10-01', '13:30:00', 2, 6),
	(13, '2021-07-16', '02:06:00', 2, 2),
	(14, '2021-07-07', '08:00:00', 2, 6),
	(15, '2021-07-08', '22:10:00', 2, 1),
	(16, '2021-07-09', '10:10:00', 1, 2),
	(17, '2021-07-10', '16:05:00', 0, 7),
	(18, '2021-12-25', '10:00:00', 0, 8);
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.consulta
CREATE TABLE IF NOT EXISTS `consulta` (
  `idConsulta` int NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `total` float DEFAULT NULL,
  `cita_idCita` int NOT NULL,
  PRIMARY KEY (`idConsulta`),
  KEY `fk_consulta_cita1_idx` (`cita_idCita`),
  CONSTRAINT `fk_consulta_cita1` FOREIGN KEY (`cita_idCita`) REFERENCES `cita` (`idCita`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.consulta: ~73 rows (aproximadamente)
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
REPLACE INTO `consulta` (`idConsulta`, `fecha`, `hora`, `observaciones`, `total`, `cita_idCita`) VALUES
	(1, '2021-07-11', '10:02:58', 'Todo bien', 269.65, 11),
	(2, '2021-07-11', '10:06:00', 'so', 245.95, 16),
	(3, '2020-01-01', '00:00:00', '', 0, 1),
	(4, '2021-07-11', NULL, NULL, NULL, 16),
	(5, '2021-07-11', NULL, NULL, NULL, 16),
	(6, '2021-07-11', NULL, NULL, NULL, 11),
	(7, '2021-07-11', NULL, NULL, NULL, 11),
	(8, '2021-07-11', '10:42:00', 'sAver', 301.25, 17),
	(9, '2021-07-11', NULL, NULL, NULL, 11),
	(10, '2021-07-11', '11:00:00', 'Finalizada', 256.65, 11),
	(11, '2021-07-11', NULL, NULL, NULL, 16),
	(12, '2021-07-11', NULL, NULL, NULL, 11),
	(13, '2021-07-11', NULL, NULL, NULL, 17),
	(14, '2021-07-11', NULL, NULL, NULL, 16),
	(15, '2021-07-11', NULL, NULL, NULL, 11),
	(16, '2021-07-11', NULL, NULL, NULL, 16),
	(17, '2021-07-11', NULL, NULL, NULL, 18),
	(18, '2021-07-11', NULL, NULL, NULL, 11),
	(19, '2021-07-11', NULL, NULL, NULL, 11),
	(20, '2021-07-11', NULL, NULL, NULL, 18),
	(21, '2021-07-11', NULL, NULL, NULL, 11),
	(22, '2021-07-11', NULL, NULL, NULL, 18),
	(23, '2021-07-11', NULL, NULL, NULL, 11),
	(24, '2021-07-11', NULL, NULL, NULL, 17),
	(25, '2021-07-11', NULL, NULL, NULL, 17),
	(26, '2021-07-11', NULL, NULL, NULL, 17),
	(27, '2021-07-11', NULL, NULL, NULL, 17),
	(28, '2021-07-11', NULL, NULL, NULL, 17),
	(29, '2021-07-11', NULL, NULL, NULL, 17),
	(30, '2021-07-11', NULL, NULL, NULL, 17),
	(31, '2021-07-11', NULL, NULL, NULL, 17),
	(32, '2021-07-11', NULL, NULL, NULL, 17),
	(33, '2021-07-11', NULL, NULL, NULL, 17),
	(34, '2021-07-11', NULL, NULL, NULL, 17),
	(35, '2021-07-11', NULL, NULL, NULL, 17),
	(36, '2021-07-11', NULL, NULL, NULL, 17),
	(37, '2021-07-11', NULL, NULL, NULL, 17),
	(38, '2021-07-11', NULL, NULL, NULL, 17),
	(39, '2021-07-11', NULL, NULL, NULL, 17),
	(40, '2021-07-11', NULL, NULL, NULL, 17),
	(41, '2021-07-11', NULL, NULL, NULL, 17),
	(42, '2021-07-11', NULL, NULL, NULL, 17),
	(43, '2021-07-11', NULL, NULL, NULL, 17),
	(44, '2021-07-11', NULL, NULL, NULL, 17),
	(45, '2021-07-11', NULL, NULL, NULL, 17),
	(46, '2021-07-11', NULL, NULL, NULL, 17),
	(47, '2021-07-11', NULL, NULL, NULL, 17),
	(48, '2021-07-11', NULL, NULL, NULL, 17),
	(49, '2021-07-11', NULL, NULL, NULL, 17),
	(50, '2021-07-11', NULL, NULL, NULL, 17),
	(51, '2021-07-11', NULL, NULL, NULL, 17),
	(52, '2021-07-11', NULL, NULL, NULL, 17),
	(53, '2021-07-11', NULL, NULL, NULL, 17),
	(54, '2021-07-11', NULL, NULL, NULL, 17),
	(55, '2021-07-11', NULL, NULL, NULL, 17),
	(56, '2021-07-11', NULL, NULL, NULL, 17),
	(57, '2021-07-11', NULL, NULL, NULL, 17),
	(58, '2021-07-11', NULL, NULL, NULL, 16),
	(59, '2021-07-11', NULL, NULL, NULL, 16),
	(60, '2021-07-11', NULL, NULL, NULL, 16),
	(61, '2021-07-11', NULL, NULL, NULL, 16),
	(62, '2021-07-11', NULL, NULL, NULL, 11),
	(63, '2021-07-11', NULL, NULL, NULL, 11),
	(64, '2021-07-11', NULL, NULL, NULL, 11),
	(65, '2021-07-11', NULL, NULL, NULL, 11),
	(66, '2021-07-11', NULL, NULL, NULL, 11),
	(67, '2021-07-11', NULL, NULL, NULL, 11),
	(68, '2021-07-11', NULL, NULL, NULL, 11),
	(69, '2021-07-11', NULL, NULL, NULL, 11),
	(70, '2021-07-11', NULL, NULL, NULL, 11),
	(71, '2021-07-11', NULL, NULL, NULL, 11),
	(72, '2021-07-11', NULL, NULL, NULL, 11),
	(73, '2021-07-11', NULL, NULL, NULL, 16),
	(74, '2021-07-11', '16:55:00', '', 200.65, 16);
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.detalleconsulta
CREATE TABLE IF NOT EXISTS `detalleconsulta` (
  `idDetalle` int NOT NULL AUTO_INCREMENT,
  `consulta_idConsulta` int NOT NULL,
  `servicio_idServicio` int NOT NULL,
  PRIMARY KEY (`idDetalle`),
  KEY `fk_consulta_has_servicio_servicio1_idx` (`servicio_idServicio`),
  KEY `fk_consulta_has_servicio_consulta1_idx` (`consulta_idConsulta`),
  CONSTRAINT `fk_consulta_has_servicio_consulta1` FOREIGN KEY (`consulta_idConsulta`) REFERENCES `consulta` (`idConsulta`),
  CONSTRAINT `fk_consulta_has_servicio_servicio1` FOREIGN KEY (`servicio_idServicio`) REFERENCES `servicio` (`idServicio`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.detalleconsulta: ~30 rows (aproximadamente)
/*!40000 ALTER TABLE `detalleconsulta` DISABLE KEYS */;
REPLACE INTO `detalleconsulta` (`idDetalle`, `consulta_idConsulta`, `servicio_idServicio`) VALUES
	(1, 10, 5),
	(2, 10, 4),
	(3, 10, 7),
	(4, 11, 6),
	(5, 11, 7),
	(6, 11, 6),
	(7, 11, 6),
	(8, 12, 4),
	(9, 12, 7),
	(10, 13, 7),
	(11, 13, 6),
	(12, 14, 5),
	(13, 15, 5),
	(14, 15, 6),
	(15, 16, 6),
	(16, 16, 6),
	(17, 17, 1),
	(18, 17, 4),
	(19, 17, 5),
	(20, 17, 6),
	(21, 17, 7),
	(22, 18, 1),
	(23, 19, 7),
	(24, 20, 6),
	(25, 20, 7),
	(26, 21, 5),
	(27, 21, 7),
	(28, 22, 6),
	(29, 22, 7),
	(30, 23, 6),
	(31, 74, 7);
/*!40000 ALTER TABLE `detalleconsulta` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.paciente
CREATE TABLE IF NOT EXISTS `paciente` (
  `idPaciente` int NOT NULL AUTO_INCREMENT,
  `dpi` varchar(13) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(8) DEFAULT NULL,
  `celular` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`idPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.paciente: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
REPLACE INTO `paciente` (`idPaciente`, `dpi`, `nombre`, `apellido`, `fechaNacimiento`, `direccion`, `telefono`, `celular`) VALUES
	(1, '3148239481301', 'Kelvin Alejandro', 'Cano Bolaños', '2000-06-05', 'Huehuetenango', '77648989', '55668989'),
	(2, '3248239481302', 'Ana Juliana', 'Monts Paz', '1994-07-02', 'Xela', '77648595', '66993636'),
	(3, '3248239481303', 'Lilith ', 'Myers', '1981-07-31', 'Los Angeles, USA', '12657989', '11225599'),
	(4, '3248239481355', 'Juan Poncho', 'Ramos Ramos', '2002-03-24', 'Quiche', '77658945', '41256987'),
	(5, '7848239457302', 'Keyla Dominica', 'Pu Tza', '1999-02-28', 'Totonicapan', '', '41256699'),
	(6, '5848239457302', 'Maya Maya', 'Aya Aya', '1999-11-27', 'Huehuetenango', '77646898', '54859878'),
	(7, '2222555668899', 'Erick', 'Lima', '1998-03-03', 'Xela', '77645454', '55669988'),
	(8, '1212555667878', 'Pablo Escobar', 'Escobar Escobar', '1961-01-01', 'Colombia', '45458585', '98986969');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.servicio
CREATE TABLE IF NOT EXISTS `servicio` (
  `idServicio` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `deshabilitar` int DEFAULT NULL,
  PRIMARY KEY (`idServicio`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.servicio: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
REPLACE INTO `servicio` (`idServicio`, `nombre`, `precio`, `deshabilitar`) VALUES
	(1, 'Enjuage', 13, 1),
	(2, 'Amalgama', 155, 0),
	(3, 'Ortodoncia', 46.5, 0),
	(4, 'Rellenado', 10.7, 1),
	(5, 'Kiko', 45.3, 1),
	(6, 'Limpieza', 100.6, 1),
	(7, 'Extraccion Muela Juicio', 200.65, 1);
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;

-- Volcando estructura para disparador bdclinicadental.setStatusCita
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `setStatusCita` AFTER INSERT ON `consulta` FOR EACH ROW BEGIN
UPDATE cita
	SET cita.status = 1 WHERE cita.idCita = NEW.cita_idCita;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
