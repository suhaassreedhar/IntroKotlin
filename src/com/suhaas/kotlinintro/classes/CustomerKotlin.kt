package com.suhaas.kotlinintro.classes

data class CustomerKotlin(var id: Int, var name: String, var email: String){
    override fun toString(): String {
        return "{\"id\" :\"$id\", \"name\" : \"$name\" , \"email\" : \"$email\"}"
    }
}

fun main(args: Array<String>) {

    val customer = CustomerKotlin(1, "Suhaas S", "suhaas@gmail.com")
    val customer1 = CustomerKotlin(1, "Suhaas S", "suhaas@gmail.com")

    if(customer == customer1){
        println("They are the same")
    }
    println(customer)

    val customer2 = customer.copy(email = "suhaas@yahoo.com")
    println(customer2.id)
    println(customer2.name)
    println(customer2.email)
}