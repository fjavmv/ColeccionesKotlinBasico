fun main() {
    /*
        Las colecciones en Kotlin son contenedores de objetos
        de tipos similares.
        Hay tres tipos básicos de colecciones List, Set y Map
        Aspectos básicos
     */

    val list = listOf("a","b","c","d") //Colección de tipo List
    val map = mapOf("clave uno" to 12345,
                "clave dos" to "Hola",
                "clave tres" to true)//Colección de tipo Map

    val numeroPositivos = setOf(1, 2, 3, 4) //Colección de tipo Set
    println(numeroPositivos)

    val ciudades = setOf("CDMX", "OAXACA", "PUEBLA", null)
    println(ciudades)

    val data = setOf('A', 1, 2, 3, 'J', 'Q', 'K')
    println(data.contains('A'))
    println("Elemento:  ${data.elementAt(0)}")
    println(data)


  /*
    Podemos acceder a los elementos de una colección
    mediante su índice para listas o su clave para map
   */
    println(list[0])
    println(map["clave tres"])

    //Podemos iterar sobre cualquier colección utilizando for
    for (e in list)
        println(e)
    for(el in map.values)
        println(el)

    //Recorremos el Set
    for (s in ciudades)
        println(s)
}