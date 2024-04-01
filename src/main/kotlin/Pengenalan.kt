//Class
class Kucing (
    // Property
    var color: String,
    var height: Double,
    var length: Double,
    var weight: Double
) {

    // Function
    fun purring() {
        println("Meow ..")
    }
    fun eat() {
        weight = weight + 1
    }
}

fun main() {
    val persian = Kucing("", 0.0, 0.0, 0.0)
    persian.color = "Putih"
    persian.height = 24.0
    persian.length = 46.0
    persian.weight = 2.0
    val bengal = Kucing("Coklat", 22.0, 39.0, 2.3)
    val anggora = Kucing("Abu-abu", 25.0, 41.0, 2.4)
}