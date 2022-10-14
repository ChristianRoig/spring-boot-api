# Starter SPRING BOOT - Paso a Paso (del comienzo)

FALTA COMPLETAR

## Etapa 1 (creando el proyecto)

### 1.- Instalar Eclipse, VSCode (con maven embebido) o Maven
(ref: https://angular.io/guide/setup-local ) 

`mvn -version`

    ...

### 2.- Crear un proyecto con Spring Initializer y ejecutarlo. 
(ref: Este proyecto fue creado con https://start.spring.io/)

    Project: Maven

    Languaje: Java

    Spring Boot: 2.5.2

    Packaging: War

    Java: 8

`cd starter-back-springboot`

En Starter Application, clic

`Run`

(o ejecutar el comando mvn que corresponda)

### 3.- Instalar GIT, verificar version e initialize

(la instalacion de node a veces ya instala e inicializa git)

`git version`

	git version 2.30.1 (Apple Git-130)

### 4.- Resguardar código de origen en una rama y crear rama starter
`git checkout -b bak-origin`

`git checkout -b starter`

`git branch`

  	bak-origin

  	master

    * starter

### 5.- Instalar VSCode, abrir el proyecto y ejecutarlo. 

Listo! ya estamos en condiciones de empezar a trabajar en nuestra rama starter.

### 6.- Subir a la nuebe (opcional)
Pero antes de empezar podemos crear un repositorio en la nube (por ejemplo en GitHub) y subir nuestro proyecto al repositorio remoto (este paso también lo podemos hacer más adelante)

`git remote add origin https://github.com/Siete-Ideas/starter-back-springboot`

`git branch -M master`

`git push master origin`

`git push --all origin`


## Pasos (Etapa 2, modificando el proyecto)
2.1.- Cambio el README.md

2.2.- Agrego un controller basico que devuelva servicios de info y status

2.3.- Agrego paginas estáticas para la raiz y el API

Listo! ya terminamos los cambios

`git push`

## Pasos (Etapa 3, corriendo el proyecto)

Vamos a desplegar la app en un servidor J2EE (Tomcat) que corra en “/starter-java”

### 3.1.- Ejecuto en “/starter-java”

para ejecutar el proyecto leer README.md 

### Bonus
Se puede agregar el link al repositorio del proyecto.


