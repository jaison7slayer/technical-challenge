EN TERMINAL DE POWER SHELL

1. EJECUTAR COMANDO CD PARA IR A LA CARPETA ORIGEN DEL PROYECTO: cd C:\Users\roeju\git\technical-challenge
2. GENERAR JAR DE PROYECTO CON WRAPPER DE MAVEN: .\mvnw clean package 
3. LUEGO EN LA RAIZ DEL PROYECTO SE CREA EL DOCKERFILE
4. GENERAR IMAGEN CON DOCKER, PRIMERO VERIFICAR RUTA RAIZ DEL SERVICIO CON COMANDO: dir
5. ASEGURAR QUE SE TENGA EL DOCKERFILE DENTRO DEL PROYECTO
6. LUEGO EJECUTAR COMANDO PARA CREAR LA IMAGEN: docker build -t technical-challenge:v1 .
7. ASEGURAR QUE SE GENERO CORRECTAMENTE LA IMAGEN CON: docker images
8. A PARTIR DE LA IMAGEN CREADA SE PUBLICA EL CONTENEDOR Y REALIZAR EL DESPLIEGUE DEL SERVICIO
9. CREAR UNA RED O NETWORK PARA QUE EL SERVICIO O SERVICIOS ESTEN DENTRO DE LA MISMA: docker network create challenges
10. AHORA SE EJECUTA LA IMAGEN PARA CREAR EL CONTENEDOR: docker run -p 8888:8888 --name technical-challenge --network challenges technical-challenge:v1
 