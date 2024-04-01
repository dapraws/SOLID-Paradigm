package com.dicoding.kotlin

class Engine {
    fun start() {
        println("Mesin dinyalakan")
    }
}

class Car {
    private val engine = Engine()

    fun startCar() {
        engine.start()
        println("Mobil dinyalakan")
    }
}

fun main() {
    val car = Car()
    car.startCar()
}
