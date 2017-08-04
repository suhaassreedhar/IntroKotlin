package com.suhaas.kotlinintro

import java.util.*

class Customer(var id: Int, var name: String = "", val yearOfBirth: Int){
    init {
        name = name.toUpperCase()
    }

    val age: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var adharNum: String = ""
    set(value) {
        if(!value.startsWith("AN")){
            throw IllegalAccessException("Adhar num must start with AN")
        }
        field = value
    }
}

fun main(args: Array<String>) {
    val customer = Customer(5, "Suhaas S", 1994)

    customer.adharNum = "AN12345"
    println(customer.name)
    println(customer.age)
    println(customer.adharNum)

}