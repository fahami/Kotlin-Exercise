package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

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

        val rvMovie = findViewById<RecyclerView>(R.id.rv_movie)
        rvMovie.layoutManager = GridLayoutManager(this, 2)
        val rvMovieListAdapter = MovieListAdapter()
        rvMovie.adapter = rvMovieListAdapter
    }
}