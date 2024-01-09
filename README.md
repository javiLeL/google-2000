## Fase 4 (Extraccion de los links)

Para poder extrarer los links devemos de saber que hay varias etiquetas que permiten guardar links como la etiqueta `a` y la etiqueta `link` pero hay otras como la de `img` que se le permite pasar un link el cual es una imagen, estas no nos interesan por lo que cogemos todas las etiquetas que guarden los links junto con todos sus atributos.

Posteriormente extraeremos el atributo `href` este empieza desde el conjunto de caracteres `href="` hasta el sguiente caracter `"`.

El metodo lo hara con todo el `html` y lo pasara en forma de lista