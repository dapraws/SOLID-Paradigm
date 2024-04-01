package com.dicoding.kotlin

class Book(val title: String)

class Library {
    val books: MutableList<Book> = mutableListOf()

    fun addBook(book: Book) {
        books.add(book)
    }
}

fun main() {
    val library = Library()
    val book1 = Book("Harry Potter")
    val book2 = Book("Lord of the Rings")

    library.addBook(book1)
    library.addBook(book2)

    println("Jumlah buku di perpustakaan: ${library.books.size}")
}
