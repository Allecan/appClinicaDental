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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.cita: ~10 rows (aproximadamente)
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
	(16, '2021-07-09', '10:10:00', 0, 2);
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.paciente: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
REPLACE INTO `paciente` (`idPaciente`, `dpi`, `nombre`, `apellido`, `fechaNacimiento`, `direccion`, `telefono`, `celular`) VALUES
	(1, '3148239481301', 'Kelvin Alejandro', 'Cano Bolaños', '2000-06-05', 'Huehuetenango', '77648989', '55668989'),
	(2, '3248239481302', 'Ana Juliana', 'Monts Paz', '1994-07-02', 'Xela', '77648595', '66993636'),
	(3, '3248239481303', 'Lilith ', 'Myers', '1981-07-31', 'Los Angeles, USA', '12657989', '11225599'),
	(4, '3248239481355', 'Juan Poncho', 'Ramos Ramos', '2002-03-24', 'Quiche', '77658945', '41256987'),
	(5, '7848239457302', 'Keyla Dominica', 'Pu Tza', '1999-02-28', 'Totonicapan', '', '41256699'),
	(6, '5848239457302', 'Maya Maya', 'Aya Aya', '1999-11-27', 'Huehuetenango', '77646898', '54859878');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla bdclinicadental.servicio
CREATE TABLE IF NOT EXISTS `servicio` (
  `idServicio` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `deshabilitar` int DEFAULT NULL,
  PRIMARY KEY (`idServicio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla bdclinicadental.servicio: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
REPLACE INTO `servicio` (`idServicio`, `nombre`, `precio`, `deshabilitar`) VALUES
	(1, 'aasdasd', 13, 1),
	(2, 'sss', 155, 0),
	(3, 'Amalgama', 46.5, 0);
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
