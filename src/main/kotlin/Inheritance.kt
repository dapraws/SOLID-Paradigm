// Single Inheritance
open class Car {
    open fun go() {
        println("${javaClass.simpleName} go!")
    }
}
class BMW : Car(){
    override fun go() {
        println("Yeay! ${javaClass.simpleName} go!")
    }
}

// Multilevel Inheritance
open class Animal{
    fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}
open class Carnivore: Animal(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}
class Cat: Carnivore()

// Multiple Inheritance
interface Ovipar
interface Vivipar
interface Ovovivipar: Ovipar, Vivipar
class Snake: Ovovivipar

// Hierarchical Inheritance
open class Creature {
    fun move() {
        println("${javaClass.simpleName} moves!")
    }
}
open class Predator: Creature() {
    fun hunt() {
        println("${javaClass.simpleName} hunts!")
    }
}
class Tiger: Predator()
class Leopard: Predator()



