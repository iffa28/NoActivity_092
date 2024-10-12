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

fun ContohSet() {
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

fun ContohMap() {
    println()
    println("=== Map ===")

    //Map Read-Only
    val readOnlyShape: Map<String,Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)
}



fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}