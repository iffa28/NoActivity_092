package com.example.noactivity_092

fun ContohList() {
    println("=== List ===")

    //list Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //list Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambah data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari list Mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //mengubah data didalam list Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapedLocked: List<String> = shape
    println(shapedLocked)
}


fun main(){
    ContohList()
}