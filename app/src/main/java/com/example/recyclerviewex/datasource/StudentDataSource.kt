package com.example.recyclerviewex.datasource

import com.example.recyclerviewex.models.Student

class StudentDataSource {
    companion object {
        fun createDataSet(): List<Student> {
            val list = mutableListOf<Student>()

            list.add(
                Student("Vinicius", "bleszerd", "senha"),
            )
            list.add(
                Student("Diego", "kerber", "senha"),
            )
            list.add(
                Student("Fernando", "fernn", "senha"),
            )


            return list
        }
    }
}