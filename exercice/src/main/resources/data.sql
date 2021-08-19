DROP TABLE IF EXISTS `empleados`;

CREATE TABLE `empleados` (
  `id` int primary key,
  `nombre` varchar(255) NOT NULL,
  `salario` int
);

INSERT INTO `empleados` (id,nombre,salario)
Values (1,'Alex', 2000);

INSERT INTO `empleados` (id,nombre,salario)
Values (2,'Pedro', 1000);

INSERT INTO `empleados` (id,nombre,salario)
Values (10,'Sandra', 0);

INSERT INTO `empleados` (id,nombre,salario)
Values (34,'Carlos', 200000);