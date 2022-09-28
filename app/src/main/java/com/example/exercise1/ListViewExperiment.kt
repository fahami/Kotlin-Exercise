package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewExperiment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_experiment)

        val listFoods = arrayListOf<String>(
            "Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur","Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur", "Hamburger",
            "Nasi Padang",
            "Nasi Goreng",
            "Pecel Lele",
            "Soto Ayam",
            "Rawon",
            "Bubur",
        )

        val lvAdapter =
            ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                listFoods,
            )
        val listViewFood = findViewById<ListView>(R.id.lv_foods)
        listViewFood.adapter = lvAdapter
        listViewFood.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Action ${listFoods[i]}", Toast.LENGTH_SHORT).show()
        }
    }
}