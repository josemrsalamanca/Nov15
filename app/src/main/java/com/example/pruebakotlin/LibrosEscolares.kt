package com.example.pruebakotlin

fun main(){
    nuevoLibro("Psicologia Oscura",2021,400,"Steven Turner","Digital")
    println()
    println("Aca un dato en particular")
    data class  nuevoLibro(var nombre: String,val año: Int,val paginas: Int,val autor: String,val tipo: String){
    }

    val nuevo = nuevoLibro("Psicologia Oscura",2021,400,"Steven Turner","Digital")
    println("Nombre Libro: ${nuevo.nombre}")

    val nom =sealed.nombre("holahola")
    nom.nombre

}

sealed  class sealed {
    class nombre(var nombre: String) : sealed()
    class año(var año: Int) : sealed()
    class paginas(var paginas: Int) : sealed()
    class autor(val autor: String) : sealed()
    class tipo(val tipo: String) : sealed()

}

fun nuevoLibro(nombre: String,año: Int,paginas: Int,autor: String,tipo: String){
    println("Nombre: $nombre")
    println("Año: $año")
    println("Paginas: $paginas")
    println("Autor: $autor")
    println("Tipo: $tipo")
}
