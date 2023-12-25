# Spider Google año 2000

Este proyecto es un spider diseñado en lengujae `java` este recopila todas las palabras que posee un html en la red y todos los enlaces para poder saber que paginas apuntan a que paginas y cuales apuntan a estas. Esto nos permite hacer busquedas con mayor precisión, es decir buscar las paginas que son verdaderamente mas importantes.

Este proyento constara de varias fases estas son:

## Fase 1 (Creacion de una seed)

Para que el proyecto pueda empezar necesitara de una serie de enlaces por los que empezar, apartir de estos sacaramemos los siguientes enlaces y asi sucesibamente hasta el infinito. 

Para las seeds crearemos varios hilos (en el ejemplo son **3** pero estos pueden variar) los cuales pueden leer un archivo seed de forma *sincronizada* para evitar errores y una vez que hayan leido toda la seed **sin repetirse** terminara el programa. 

Aparte de leer la seed tamien crearan un *log* de los enlaces que han procesando.

## Fase 2 (Descargar un html)

Esto se hace con una libreria que presenta `java` la cual es `net` esta tiene la capacidad de crear `sokets` los cuales se conectan a las paginas web enviandolas un protocolo para que estas le devuelvan el `html` que guardan.

Posteriormente guardan este archivo html en un fichero (para que otro hilo pueda procesarlo).

## Fase 3 (Extaccion de palabras de un html)

Para poder extraer todas las palabras de un html es necesario eliminar todas las etiquetas es decir desde el caracter `<` hasta el caracter `>` no es necesario hacer ningun calculo mas pues `html` no permite guardar estos caracteres dentro del codigo para escribirlo hay que hacerlo de forma diferente:

| Caracter  | Caracter en HTML  |
| --------- | ----------------- |
| `<`       | `&lt`             |
| `>`       | `&gt`             |

Esto con excepcion de algunas etiquetas como *`script`* y como *`style`* ya que esta etiquetas no guardan *palabras* en su interior en su defecto guardan codigo o stilo para solucionar esto el programa al encontrar el inicio de una de estas etiquetas se las salta completamente para evitar problemas.

Se eliminara todos los caracteres inecesarios como `.`, `,`, `;`, `?`, `!` ... ya que estos no aportan nada.

Tambien se eliminaran algunas palabras como conjunciones para que esto pueda se facil se usara el archivo `words-ignore` este tendra todas las palabras que se han de borrar aparte de un *sistema de comentarios* el cual consiste en que no se leera la line que empieze con el caracter `#`. Las palabras que se eliminaran son las que en español no sirven como las preposiciones, atributos, pronombres... 

Tras esto los espacios en blanco se eliminan usando el caracter especial `\\s+` que en `java` es cualquier caracter en blanco o conjuntos de esto. Estos se remplazaran por un unico espacio.

Despues con el metodo `split` el cual se encuentra en la clase `String` guardaremos todas las palabras en un array para poder operar con ellas.

## Fase 4 (Extraccion de los links)

Para poder extrarer los links devemos de saber que hay varias etiquetas que permiten guardar links como la etiqueta `a` y la etiqueta `link` pero hay otras como la de `img` que se le permite pasar un link el cual es una imagen, estas no nos interesan por lo que cogemos todas las etiquetas que guarden los links junto con todos sus atributos.

Posteriormente extraeremos el atributo `href` este empieza desde el conjunto de caracteres `href="` hasta el sguiente caracter `"`.

El metodo lo hara con todo el `html` y lo pasara en forma de lista