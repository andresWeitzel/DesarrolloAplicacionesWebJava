# Desarrollo de Aplicaciones Web con Java

*Material de las prácticas y proyectos acerca de Desarrollo de Aplicaciones Web con Java*


</br>

#### Diagrama Entidad Relación Mysql `db_indumentaria`

![Index app](https://github.com/andresWeitzel/GestionDB_Mysql_PostgreSQL/blob/master/db_indumentaria_DER.png)



</br>

<hr>

| **Tecnologías** | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| Java |   12.0.2 | JDK |
| Eclipse IDE |  4.20 | Entorno de Desarrollo Integrado |
| Cygwin | 3.1.6-1  | Colección de Herramientas / Terminal en Windows integrada al IDE Eclipse |
| Git | 2.29.1.windows.1  | Control de Versiones |
| XAMPP | 3.2.2  | Paquete de Servidores |
| DBeaver | 21.1  | Diseño de Base de Datos | 

</br>

| **Dependencia Maven** | **Finalidad** |               
| ------------- | ------------- |
| mysql-connector 8.0.25|  Conexion e implementación de queries a la db con mysql |
| Java Servlet Api 4.0.1|  Conexion y configuración de los Servlets |
| Json Libraries 2.8.7|  Manejo de Objetos en Formato Json  |

* Repositorio dependencia Java Servlet Api : https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/4.0.1

* Repositorio dependencia mysql-connector : https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.25

* Repositorio dependencia Json Libraries : https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.7




</br>

 ## Patrones de Diseño
 * **Singleton** 
 * **Dao** 
 
 ## Java8
* **Streams**
* **Lambdas**
* **Filters**
* **Collections**
* **Etc..**

</br>

## Descarga y documentacion de las Tecnologías empleadas:
#### Java-JDK 12:                     https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html
#### Maven Repositories:              https://mvnrepository.com/
#### Eclipse:                        https://www.eclipse.org/
#### Cygwin:                           https://cygwin.com/install.html
#### Git:                              https://git-scm.com/docs
#### XAMPP:                            https://www.apachefriends.org/download.html
#### DBeaver:                         https://dbeaver.io/


</br>

<hr>

## Más Información

## Creación de Proyecto Maven en Eclipse

#### 1) Vas a la pestaña File->New->Maven Proyect
#### 2) Dentro de Maven Proyect, Seteamos el WorkSpace...
#### 3) Dentro de Maven Proyect, Seteamos el Archetype, en catalogs-> all catalogs, en filter->Escribimos webApp y seleccionamos ORG.APACHE.MAVEN.ARCHETYPES
#### 4) Dentro de Maven Proyect, Escribimos en GroupId-> com.jee.maven, en Artifact Id->'nombre de nuestro proyecto sin comillas'
#### 5) Agregamos las dependencias necesarias dentro del pom.xml
#### 6) Dentro del pom.xml cambiamos la versión de Java de 1.7 a 1.8 en <maven.compiler.source> y <maven.compiler.target>
#### 7) Configuramos el build path, clickDerecho sobre el proyecto->Build Path->Configure Build path->SELECCIONAMOS  MAVEN DEPENDENCIES->Apply and Close


</br>

## Consideraciones Personales y Posibles Errores dentro de Eclipse

### Servlets 

#### 1) Si se crea un proyecto Maven y no un Dinamic Web Proyect, cuando se mueve los servlets de paquete en paquete no 
#### se actualiza el web.xml, en donde esta la información de despliegue de los servlets, empiezan los errores, hay que configurar
#### de forma manual el servlet y el servlet-mapping dentro de web.xml ( si conoces otro metodo, informar).

</br>

#### 2)Caso hipotetico de caer en el inciso anterior, luego de las configuraciones manuales(PARA CADA UNO DE LOS SERVLETS), borrar 
#### configuraciones y servidor, crear nuevo, asignar configuraciones y volver a correr el proyecto, probar cada servlet.

</br>

#### 3)Si el paso anteriror no funciona, reinicar el IDE o probar actualizar el proyecto, clean, build, etc.



</br>

## Uso de Cygwin

#### 1)Descargar la herramienta en https://cygwin.com/install.html dependiendo la arquitectura que se tenga (32-64 bits), como toda aplicacion siguiente.... siguiente....```(IMPORTANTE:NO TENER ABIERTO EL IDE DURANTE LA INSTALACION, SINO NO RECONOCE EL PATH)```
#### 2)Abrir Eclipse IDE, seguidamente seleccionar el proyecto para implementar git, ir a la pestaña y clickear ```Tools->Open in terminal```
#### 3)Te debería aparecer algo parecido a esto(Ruta Absoluta de tu proyecto)...
```andre@DESKTOP-7BN69K1/cygdrive/c/Users/andre/OneDrive/Escritorio/LenguajesProgramacion/JAVASE/Proyectos/GestorGastos_app```
#### 4)Crear un nuevo repositorio y comenzar con git
```Debajo de esta sección, explico como usar git de forma detallada.```
#### 5) Más Información https://ourcodeworld.com/articles/read/680/how-to-configure-an-integrated-terminal-command-prompt-in-netbeans-for-windows

</br>

## Subir el proyecto al repositorio con la terminal a traves de Cygwin en Eclipse

#### 1)Creamos un nuevo repositorio en GitHub.

#### 2)Inicializamos nuestro repositorio local .git desde la terminal.
* git init

#### 3)Agregamos lo desarrollado a nuestro repo local desde la terminal.
* git add *

#### 4)Agregamos lo que tenemos en nuestro repo local al área de Trabajo desde la terminal.
* git commit -m "agrega un comentario entre comillas"

#### 5)Le indicamos a git donde se va a almacenar nuestro proyecto(fijate en tu repositorio de github cual es el enlace de tu proyecto(esta en code)).
* git remote add origin https://github.com/andresWeitzel/DesarrolloAplicacionesWebJava

#### 6)Subimos nuestro proyecto.
* git push -u origin master


</br>


## Actualización de el proyecto al repositorio con la terminal a traves de Cygwin en Netbeans

#### 1)Visualizamos las modificaciones realizadas en local
* git status

#### 2)Agregamos lo modificado al area de trabajo
* git add *

#### 3)Confirmamos las modificaciones realizadas
* git commit -m "tu commit entre comillas"

#### 4)Sincronizamos y traemos todos los cambios del repositorio remoto a la rama en la que estemos trabajando actualmente.
##### (SOLO SI SE REALIZARON CAMBIOS DESDE OTRA LADO, ej: en github u/o/y un equipo de trabajo)
* git pull https://github.com/andresWeitzel/DesarrolloAplicacionesWebJava

#### 5)Enviamos todos los cambios locales al repo en github
* git push https://github.com/andresWeitzel/DesarrolloAplicacionesWebJava

</br>

