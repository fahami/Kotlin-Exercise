package com.example.exercise1.todos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise1.R
import com.example.exercise1.data.ApiService
import com.example.exercise1.data.TodosItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TodosActivity : AppCompatActivity() {
    val todos = listOf<TodosItem>(
        TodosItem(todo = "Buy milk", completed = false),
        TodosItem(todo = "Buy eggs", completed = false),
        TodosItem(todo = "Buy bread", completed = false),
        TodosItem(todo = "Buy butter", completed = true),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todos)

        val rvTodo = findViewById<RecyclerView>(R.id.rv_todos)
        rvTodo.adapter = TodoListAdapter().apply {
            setNewData(todos)
        }
        GlobalScope.launch(Dispatchers.Main) {
            val res = retrofitService().getTodos()
            if (res.isSuccessful) {
                val newTodos = res.body()?.todos
                rvTodo.adapter = TodoListAdapter().apply {
                    setNewData(newTodos.orEmpty())
                }
            }
        }
    }

    fun retrofitService(): ApiService {
        return Retrofit
            .Builder()
            .baseUrl("https://dummyjson.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}