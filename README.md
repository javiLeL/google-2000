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