package com.example.noactivity_092

fun nullSafety() {
    //neverNull has string type
    var neverNull: String = "This can't be null"

    //throws a compiler error
    //neverNull = null

    var nullable: String? = "You can keep a null here"
    //this is OK
    nullable = null

    //check for null in conditions
    if (neverNull == null){
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    //safe call operator
    println(neverNull.length)
    println(nullable?.length)

}

fun main() {
    nullSafety()
}