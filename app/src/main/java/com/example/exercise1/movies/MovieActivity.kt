package com.example.exercise1.movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise1.R
import com.example.exercise1.data.Movie
import com.example.exercise1.data.Movies
import com.google.gson.Gson

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_experiment)
        val rvMovie = findViewById<RecyclerView>(R.id.rv_movie)
        val rvMovieAdapter = MovieAdapter {
            intent = Intent(this, MovieDetailActivity::class.java)
            intent.putExtra("title", it.title)
            intent.putExtra("poster", it.posterPath)
            intent.putExtra("description", it.overview)
            intent.putExtra("releaseDate", it.releaseDate)
            intent.putExtra("ratingValue", it.voteAverage)
            intent.putExtra("votingCount", it.voteCount)
            startActivity(intent)
        }
//        Via local JSON
        val json = assets.open("movies.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val movies =  gson.fromJson(json, Movies::class.java)
//        Via API

        rvMovieAdapter.setData(movies?.results!! as ArrayList<Movie>)
        rvMovie.adapter = rvMovieAdapter
    }
}