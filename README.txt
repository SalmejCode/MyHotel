
El proyecto es un proyecto MAVEN, las dependencias pueden ser encontradas en archivo POM.XML
Este proyecto usa una base de datos embebida H, configuración se encuentra en el archivo src/main/reources/applications.properties.
Para acceder a la console de la base de datos, el proyecto debe de estar levantado y acceder a http://localhost:8080/h2-console. Para acceder 
Driver Class:org.h2.Driver
JDBC URL:jdbc:h2:mem:MyHotel
User Name: sa
Password:

En el archivo src/main/reources/data.sql existen queries que se ejecutan cada vez que la aplicación levanta, estas fueran creadas para tener tablas con data y testear los endpois.
Una leve modificación fue realizada en el literal : v. Salario promedio de todos los departamentos que tengan más de 10 empleados. La actualización fue el cambio de 10 a 2 empleados, esto con el fin de tener una respuesta a esta query y posterior servicio.