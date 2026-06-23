Sistema que sirve para la gestión, administracion y control de turistas y sus respectivos tours, para poder Guardar clientes y todos su informacion necesaria para despues cargarlos correctamente en una lista y guardandolos en un archivo.txt.

PAQUETES UTILIZADOS Y CLASES IMPLEMENTADAS:

cl.duoc
  java 
     app --- Contiene la Clase Main, para ejecutar el programa.
        Main Clase principal para ejecutar el programa.

     model --- Package con 4 clases diferentes, con sus respectivos atributos y 
        - Cliente.java -----Clase que guarda los datos e informacion mas relevante del cliente, es herencia de la clase Persona.
        - Direccion.java ----- Clase que contiene la informacion sobre las direcciones de los clientes.
        - Persona.java ------ Clase con atributos comunes de una persona.
        - Tour.java ---- Define los datos respecto a los tours y todo el circuito turistico.
     util
       -LectorArchivo ----- Clase encargada de leer y procesar la informacion desde el archivo clientes.txt.
     resources
     clientes.txt ------- Archivo txt que almacena los datos de los clientes mediante un archivo de texto plano.


Abrir el proyecto en tu programa IntelliJ IDEA
Localizar la clase main entrando en cl.duoc/java/app/Main.java.
Entrar en la clase principal Main.java.
Click derecho en el archivo Main.java y seleccione Run, o dirigirse en la esquina superior derecha al lado de Current file y darle play.