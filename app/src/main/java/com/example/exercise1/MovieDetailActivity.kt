package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)
        title = intent.getStringExtra("title")
        val poster = findViewById<ImageView>(R.id.iv_movie_poster)
        Picasso.get().load("https://image.tmdb.org/t/p/w500" + intent.getStringExtra("poster")).into(poster)
        val title = findViewById<TextView>(R.id.tv_movie_title)
        title.text = intent.getStringExtra("title")
        val description = findViewById<TextView>(R.id.tv_movie_description)
        description.text = intent.getStringExtra("description")
    }
}