## Backend Developer
Reto Tech - Intercorp Retail

```
-Microservicio desarrollado en Java Spring boot

-API Rest documentada en Swagger
    http://52.47.189.57:8081/swagger-ui.html
    http://52.47.189.57:8081/v2/api-docs

-Deployado en AWS(EC2 - RDS Mysql) Github: https://github.com/alexjosue/cliente-service
    CREATE TABLE `db_corp`.`cliente` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(60) NOT NULL,
    `apellido` VARCHAR(60) NOT NULL,  				
    `edad` INTEGER NOT NULL,
    `fechanacimiento` DATETIME NOT NULL,
    PRIMARY KEY (`id`));
    insert into db_corp.cliente values(null, 'ALEX','FERNANDEZ',31,'1987-11-15');

-Endpoint de Entrada POST /creacliente:
    http://52.47.189.57:8081/creacliente
    {
      "apellido": "Gonzales",
      "edad": 19,
      "fechaNacimiento": "2000-03-20",
      "nombre": "Juan"
    }

-Endpoint de Salida GET /kpideclientes:
    http://52.47.189.57:8081/kpideclientes

-Endpoint de Salida GET /listclientes:
    http://52.47.189.57:8081/listclientes
```
