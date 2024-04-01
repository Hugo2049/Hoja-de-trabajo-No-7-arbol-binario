# Hoja-de-trabajo-No-7-arbol-binario
Árbol Binario de Búsqueda para Traducción de Palabras
Esta hoja de trabajo contiene clases Java para implementar un árbol binario de búsqueda que se utiliza para traducir palabras de inglés a español. También incluye una clase de prueba para demostrar su funcionamiento

Contenido de la hoja de trabajo 7
Main.java: Contiene la clase principal del proyecto que construye el árbol binario a partir de un archivo de asociaciones de palabras y realiza la traducción de oraciones.
BinaryTree.java: Define la clase BinaryTree, que representa un árbol binario de búsqueda y proporciona métodos para insertar y buscar asociaciones de palabras.
Association.java: Define la clase Association, que representa una asociación entre una palabra en inglés y su equivalente en español


Ejecución: Ejecuta el programa Main pasando como argumento el nombre del archivo de asociaciones de palabras (por ejemplo el diccionario.txt)

Formato del Archivo de Asociaciones: El archivo de asociaciones debe contener líneas de la forma palabra_en_inglés, palabra_en_español, donde cada línea representa una asociación de una palabra en inglés con su traducción en español

Salida Esperada: El programa solicitará una oración en inglés que se desea traducir. Después de ingresar la oración, mostrará la traducción correspondiente en español

Nota:
Asegúrate de que el archivo de asociaciones diccionario.txt en la carpeta al correr el código 
por el momento no encontré bugs, y las pruebas unitarias corrieron bien
Hay que ingresar el .txt si es que desea cambiarlo y si no pues ahí está el que le dejé, 
lo que hace es correr el main y ingresar una oración en ingles, el codigo rrecorre el arbol y luego busca las palabras que están y las traduce con la relación y la busqueda 

//NOTA: Fijate que se me olvido hacerlo en maven, y como hoy lo estabamos viendo las revisiones con Michael, entonces no se cómo estaría ahí pero aquí está mi github con maven https://github.com/Hugo2049/Hoja-de-trabajo-7-maven.git es literalmente lo mismo pero en maven