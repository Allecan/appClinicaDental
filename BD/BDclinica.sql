-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.21 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.1.0.6116
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
  `pacientes_idPaciente` varchar(45) NOT NULL,
  PRIMARY KEY (`idCita`),
  KEY `fk_cita_pacientes1_idx` (`pacientes_idPaciente`),
  CONSTRAINT `fk_cita_pacientes1` FOREIGN KEY (`pacientes_idPaciente`) REFERENCES `paciente` (`idPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.cita: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.detallecita
CREATE TABLE IF NOT EXISTS `detallecita` (
  `idCItaHasServicio` int NOT NULL,
  `cita_idCita` int NOT NULL,
  `servicio_idservicio` int NOT NULL,
  `venta_idventa` int NOT NULL,
  PRIMARY KEY (`idCItaHasServicio`),
  KEY `fk_cita_has_servicio_servicio1_idx` (`servicio_idservicio`),
  KEY `fk_cita_has_servicio_cita1_idx` (`cita_idCita`),
  KEY `fk_detalleCita_venta1_idx` (`venta_idventa`),
  CONSTRAINT `fk_cita_has_servicio_cita1` FOREIGN KEY (`cita_idCita`) REFERENCES `cita` (`idCita`),
  CONSTRAINT `fk_cita_has_servicio_servicio1` FOREIGN KEY (`servicio_idservicio`) REFERENCES `servicio` (`idservicio`),
  CONSTRAINT `fk_detalleCita_venta1` FOREIGN KEY (`venta_idventa`) REFERENCES `venta` (`idventa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.detallecita: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detallecita` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallecita` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.paciente
CREATE TABLE IF NOT EXISTS `paciente` (
  `idPaciente` varchar(45) NOT NULL,
  `dpi` int DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `fechaNacimiento` int DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.paciente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.servicio
CREATE TABLE IF NOT EXISTS `servicio` (
  `idservicio` int NOT NULL AUTO_INCREMENT,
  `nombreServicio` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idservicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.servicio: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.venta
CREATE TABLE IF NOT EXISTS `venta` (
  `idventa` int NOT NULL AUTO_INCREMENT,
  `observaciones` varchar(150) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `total` float DEFAULT NULL,
  `pacientes_idPaciente` varchar(45) NOT NULL,
  PRIMARY KEY (`idventa`),
  KEY `fk_venta_pacientes1_idx` (`pacientes_idPaciente`),
  CONSTRAINT `fk_venta_pacientes1` FOREIGN KEY (`pacientes_idPaciente`) REFERENCES `paciente` (`idPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdclinicadental.venta: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
