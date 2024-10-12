package com.example.noactivity_092

fun nullSafety() {
    //neverNull has string type
    var neverNull: String = "This can't be null"

    //throws a compiler error
    //neverNull = null

    var nullable: String? = "You can keep a null here"
    //this is OK
    nullable = null

}

fun main() {
    nullSafety()
}