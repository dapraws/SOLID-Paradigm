// Kelas dasar
open class Shape {
    open fun draw() {
        println("Menggambar bentuk umum.")
    }
}

// Subkelas yang mewarisi kelas dasar
class Circle : Shape() {
    override fun draw() {
        println("Menggambar lingkaran.")
    }
}

// Subkelas lain yang juga mewarisi kelas dasar
class Rectangle : Shape() {
    override fun draw() {
        println("Menggambar persegi panjang.")
    }
}

fun main() {
    // Membuat array objek Shape
    val shapes = arrayOf(Shape(), Circle(), Rectangle())

    // Memanggil metode draw() untuk setiap objek
    for (shape in shapes) {
        shape.draw()
    }
}
