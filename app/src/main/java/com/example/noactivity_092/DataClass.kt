package com.example.noactivity_092

data class DataClass(
    val id: Int,
    var email: String
)
 fun main() {
     val data = DataClass(1, "iffa@gmail.com")
     println(data)

     //fungsi equals
     val data2 = DataClass(1, "zahra@gmail.com")
     println(data == data2)  //false


 }