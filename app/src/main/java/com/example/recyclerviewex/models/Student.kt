package com.example.recyclerviewex.models

data class Student(
    var name: String,
    var username: String,
    var password: String
) {

    override fun toString(): String {
        return "$name | $username | $password"
    }
}