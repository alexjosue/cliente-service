# Backend Developer

_Reto Tech - Intercorp Retail_

## Microservicio desarrollado en Java Spring boot

### API Rest documentada en Swagger
* [Link Swagger-ui](http://ec2-52-47-189-57.eu-west-3.compute.amazonaws.com:8081/swagger-ui.html)
* [Link Api-docs](http://ec2-52-47-189-57.eu-west-3.compute.amazonaws.com:8081/v2/api-docs)

	
### Deployado en AWS(EC2 - RDS Mysql)
	```
    CREATE TABLE `db_corp`.`cliente` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(60) NOT NULL,
    `apellido` VARCHAR(60) NOT NULL,  				
    `edad` INTEGER NOT NULL,
    `fechanacimiento` DATETIME NOT NULL,
    PRIMARY KEY (`id`));
    insert into db_corp.cliente values(null, 'ALEX','FERNANDEZ',31,'1987-11-15');
	```
	
### Endpoint de Entrada POST /creacliente:
* http://ec2-52-47-189-57.eu-west-3.compute.amazonaws.com:8081/creacliente
	```
    {
      "apellido": "Gonzales",
      "edad": 19,
      "fechaNacimiento": "2000-03-20",
      "nombre": "Juan"
    }
	```

### Endpoint de Salida GET /kpideclientes:
* [Link /kpideclientes](http://ec2-52-47-189-57.eu-west-3.compute.amazonaws.com:8081/kpideclientes)

### Endpoint de Salida GET /listclientes:
* [Link /listclientes](http://ec2-52-47-189-57.eu-west-3.compute.amazonaws.com:8081/listclientes)
