package com.dicoding.kotlin

class School(val name: String)

class Student(val name: String, val school: School)

fun main() {
    val school = School("ABC High School")
    val student = Student("John", school)

    println("${student.name} belajar di ${student.school.name}")
}
