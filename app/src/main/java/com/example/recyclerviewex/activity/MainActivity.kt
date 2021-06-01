package com.example.recyclerviewex.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewex.R
import com.example.recyclerviewex.adapter.StudentAdapter
import com.example.recyclerviewex.datasource.StudentDataSource

class MainActivity : AppCompatActivity() {
    private lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentsRecyclerView: RecyclerView = findViewById(R.id.student_recycler)
        studentsRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            studentAdapter = StudentAdapter()
            adapter = studentAdapter
        }

        val data = StudentDataSource.createDataSet()
        studentAdapter.updateList(data)
    }
}