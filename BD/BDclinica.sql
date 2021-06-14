-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.21 - MySQL Community Server - GPL
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.cita: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.consulta: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.detalleconsulta
CREATE TABLE IF NOT EXISTS `detalleconsulta` (
  `idDetalle` int NOT NULL,
  `consulta_idConsulta` int NOT NULL,
  `servicio_idServicio` int NOT NULL,
  PRIMARY KEY (`idDetalle`),
  KEY `fk_consulta_has_servicio_servicio1_idx` (`servicio_idServicio`),
  KEY `fk_consulta_has_servicio_consulta1_idx` (`consulta_idConsulta`),
  CONSTRAINT `fk_consulta_has_servicio_consulta1` FOREIGN KEY (`consulta_idConsulta`) REFERENCES `consulta` (`idConsulta`),
  CONSTRAINT `fk_consulta_has_servicio_servicio1` FOREIGN KEY (`servicio_idServicio`) REFERENCES `servicio` (`idServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.detalleconsulta: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalleconsulta` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.paciente: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
REPLACE INTO `paciente` (`idPaciente`, `dpi`, `nombre`, `apellido`, `fechaNacimiento`, `direccion`, `telefono`, `celular`) VALUES
	(1, '1515256341616', 'Kelvin Alejandro', 'Cano Rodas', '2000-01-05', 'En mi casa', '77648899', '55668899');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.servicio
CREATE TABLE IF NOT EXISTS `servicio` (
  `idServicio` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.servicio: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
