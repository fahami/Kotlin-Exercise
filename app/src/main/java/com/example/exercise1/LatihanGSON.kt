package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.exercise1.data.Products
import com.example.exercise1.data.Todo
import com.google.gson.Gson

class LatihanGSON : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_gson)
        val json = assets.open("products.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val data =  gson.fromJson(json, Products::class.java)


    }
}