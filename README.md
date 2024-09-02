# Calculadora en ANTLR
## Instalación y pruebas de ANTLR


Realizado por:

- Sebastián Cortés Briceño
- Julian Esteban Rincón Rodríguez
- Mariana Ruge Vargas
-  Andres Sebastian Urrego Amaya

## Descripción del proyecto
Este proyecto es una calculadora simple que hace las operaciones aritméticas básicas y tiene entrada por medio de un archivo de texto plano (formato txt). Está implementada en ANTLR (Another Tool For Language Recognition) y Java. En el proyecto se incluye la definición de la gramática, al compilar se generan los archivos necesarios para su ejecución.

## Guía de uso
A continuación se presentan los pasos para poder usar este proyecto en tu máquina local.
### Requisitos
1. Tener Java  y JDK (Java Development Kit) en tu entorno local. Puedes verificar su instalación con el siguiente comando.
`
java -- version
`
En caso de tenerlo instalado te mostrará la version del Open JDK y sus versiones de compilación.
En este proyecto se usaron las siguientes versiones para compilar y ejecutar en Java.
**Importante: Asegurate de tener la misma versión que se especifica en este documento, para evitar diversos problemas de compatibilidad y fallas en la ejecución.**
Se usa el JDK 21
````shell
openjdk 21.0.4 2024-07-16
OpenJDK Runtime Environment (build 21.0.4+7-Ubuntu-1ubuntu222.04)
OpenJDK 64-Bit Server VM (build 21.0.4+7-Ubuntu-1ubuntu222.04, mixed mode, sharing)
````
Si no tienes instalado el JDK, puedes instalarlo de la siguiente forma:
````shell
	sudo apt update
	sudo apt install openjdk-21-jdk
````

2. Debes instalar ANTLR4 en tu máquina local, puedes verficar su instalación con el siguiente comando.
	`
	antlr4 
	`
	Esto deberías mostrarte el manual y la versión de antlr4 instalada en tu máquina local.
	En caso de no tenerlo instalado, sigue estos pasos:
	````shell
		1. `cd 'Directorio local donde vas a instalar' ` 
		2.  `curl -O http://www.antlr.org/download/antlr-4.6-complete.jar` 
	````
`
	También puedes descargarlo directamente desde este  link http://www.antlr.org/download.html, lo añades a algún directorio de fácil acceso.

3. Configura la variable de entorno `ANTLR_JAR` para que apunte al archivo descargado en el paso anterior. Puedes hacerlo de la siguiente forma:
	
			export ANTLR_JAR=~/path_to_antlr/antlr-4.7-complete.jar
	
	**Reemplaza path_to_antlr con la ruta donde descargaste el archivo del paso 2**.

4. Añade ANTLR a tu Path para facilitar su uso.
	
		export PATH=$PATH:~/path_to_antlr
	


## Para ejecutar el proyecto
1. Clona este repositorio a tu máquina local, puedes hacerlo de la siguiente forma.

Ubicate en la carperta del proyecto.

		 cd 'Directorio donde vas a clonar'

Clona el repositorio con el siguiente comando

		 `git clone https://github.com/mariana-ruge/Calculadora-ANTLR.git`

Navega hasta la carpeta que se ha clonado en tus directorios

		 cd 'Calculadora-ANTLR'

Verifica que los archivos que estan subidos en este repositorio sean exactamente los que se han clonado a tu entorno local, para no tener problemas más adelante.

2.  Una vez en la carpeta,  deberás compilar el proyecto, para ello, ejecuta.
		antlr4 -visitor Calculadora.g4

Esto generará los archivos Java necesarios para el análisis de la gramática.

3. **Compila los archivos Java generados**: Compila los archivos generados por ANTLR4 usando javac, para ello, ejecuta el siguiente comando. 

		javac -cp ".:antlr-4.7-complete.jar" *.java

Es importante tener en cuenta  que  (".:antlr-4.7-complete.jar" ) es el archivo.jar que debiste haber descargado anteriormente, y si le cambiaste el nombre debe ser modificado.

4.  **Usa el  comando java -cp** para ejecutar el programa. Aségurate de proporcionar el archivo de entrada con las expresiones a evaluar.

		java -cp ".:antlr-4.7-complete.jar" Calculadora entrada.expr

5. En la consola verás la ejecución de las operaciones establecidas en el archivo entrada .expr,  para hacer más operaciones, deberás modificar estos, añadiendo los operandos (variables) y los operadores, siempre cuando estos cumplan las reglas establecidas en el programa.

#### Errores comunes
**- Error: Invalid or corrupt jarfile**: Asegúrate de que el archivo JAR de ANTLR4 esté correctamente descargado y que la variable ANTLR_JAR apunte al archivo correcto. Revisa que la ruta sea correcta y que el archivo no esté dañado.


**-Error: no se ha encontrado o cargado la clase principal:** Verifica que el archivo .java correspondiente a la clase principal (Calculadora en este caso) esté compilado y que el nombre de la clase en el archivo .java coincida con el nombre que estás utilizando en el comando java

