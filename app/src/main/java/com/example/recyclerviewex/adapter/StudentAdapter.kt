package com.example.recyclerviewex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewex.R
import com.example.recyclerviewex.models.Student

class StudentAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items = listOf<Student>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return StudentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is StudentViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun updateList(students: List<Student>){
        items = students
    }

    class StudentViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val studentNameTextView: TextView = itemView.findViewById(R.id.student_name)
        val studentUsernameTextView: TextView = itemView.findViewById(R.id.student_username)
        val studentPasswordTextView: TextView = itemView.findViewById(R.id.student_password)

        fun bind(student: Student) {
            studentNameTextView.setText(student.name)
            studentUsernameTextView.setText(student.username)
            studentPasswordTextView.setText(student.password)
        }
    }
}