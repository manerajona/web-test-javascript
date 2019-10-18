# Overview
 
- Backend: Spring Boot, Spring Security, JPA, Hibernate, MySQL, Maven, Java 1.8.
- Frontend: JSP, jslt, Spring Framework, Bootstrap, HTML5, CSS, javascript.

### Crear esquema

Crear una base de datos Mysql, por ejemplo "hoteldb":

```sh
  CREATE DATABASE hoteldb;
```
 
Agregar la usuario y password para hoteldb en resources/aplication.properties. Debería quedar algo así:

```sh
spring.datasource.url=jdbc:mysql://localhost:3306/hoteldb?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false
spring.datasource.username=root
spring.datasource.password=root_pass
```

### Build & run

Verificar que la versión de Apache Maven sea 3.6.+ ```$ mvn -v ```. 

Ejecutar:

```sh
$ cd mvc
$ mvn compile
$ mvn clean spring-boot:run
```


## Modo Admin

Para ingresar en modo admin acceder a http://localhost:8080/login con las siguientes credenciales:

| Username | Password |
| -------- | -------- |
| admin    | admin123 |

