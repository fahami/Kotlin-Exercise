package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListViewExperiment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_experiment)
        val rvMovie = findViewById<RecyclerView>(R.id.rv_movie)
        val rvMovieAdapter = MovieListAdapter {
            Toast.makeText(this, it.title, Toast.LENGTH_SHORT).show()
        }
        val movies = arrayListOf(
            Movie("Rick And Morty", "/cvhNj9eoRBe5SxjCbQTkh05UP5K.jpg"),
            Movie("She Hulk", "/hJfI6AGrmr4uSHRccfJuSsapvOb.jpg"),
            Movie("Lord of The Ring", "/57qMrgNoh72wF5sVEDrtMlRk7D.jpg"),
            Movie("House of Dragon", "/Aa9TLpNpBMyRkD8sPJ7ACKLjt0l.jpg"),
            Movie("Cobra Kai", "/m7tG5E1EbywuwTsl6hq990So0Bx.jpg"),
            Movie("War of the Worlds", "/yThmbQkxSzW4HHdAaoj8RYHFH3i.jpg"),
            Movie("Grey's Anatomy", "/daSFbrt8QCXV2hSwB0hqYjbj681.jpg"),
        )
        rvMovieAdapter.setData(movies)
        rvMovie.adapter = rvMovieAdapter

//        Spinner
        val movieCategories = findViewById<Spinner>(R.id.sp_categories)
        movieCategories.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            resources.getStringArray(R.array.movie_categories)
        )
    }
}