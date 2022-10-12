package com.example.exercise1.todos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.exercise1.R
import com.example.exercise1.data.TodosItem

class TodoListAdapter : Adapter<TodoViewHolder>() {
    val todoList: MutableList<TodosItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.todo_item, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.checkbox.text = todoList.get(position).todo
        holder.checkbox.isChecked = todoList.get(position).completed ?: false
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    fun setNewData(item: List<TodosItem>) {
        todoList.clear()
        todoList.addAll(item)
        notifyDataSetChanged()
    }
}