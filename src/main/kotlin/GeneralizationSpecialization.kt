package com.dicoding.kotlin

// Generalization
abstract class Shape {
    abstract fun area(): Double
}

// Specialization
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    println("Luas lingkaran: ${circle.area()}")
    println("Luas persegi panjang: ${rectangle.area()}")
}
