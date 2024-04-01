package com.dicoding.kotlin

class Engines {
    fun start() {
        println("Mesin dinyalakan")
    }
}

class Cars(private val engine: Engines) {
    fun startCar() {
        engine.start()
        println("Mobil dinyalakan")
    }
}

fun main() {
    val engine = Engines()
    val car = Cars(engine)
    car.startCar()
}

