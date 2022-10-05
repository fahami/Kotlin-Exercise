package com.example.exercise1.data

data class Todos(
    val limit: Int,
    val skip: Int,
    val todos: List<Todo>,
    val total: Int
)