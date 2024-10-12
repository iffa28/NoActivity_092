package com.example.noactivity_092

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}
fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

fun withNameArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

