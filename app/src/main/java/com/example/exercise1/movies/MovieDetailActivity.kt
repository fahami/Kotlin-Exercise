package com.example.exercise1.movies

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exercise1.R
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat

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
        val releaseDate = findViewById<TextView>(R.id.tv_release_date)
        val parser = SimpleDateFormat("yyyy-MM-dd")
        val formatter = SimpleDateFormat("dd MMMM yyyy")
        val output = formatter.format(parser.parse(intent.getStringExtra("releaseDate")))
        releaseDate.text = output
        val ratingValue = findViewById<TextView>(R.id.tv_rating_value)
        ratingValue.text = intent.getDoubleExtra("ratingValue",0.0).toString()
        val ratingBar = findViewById<RatingBar>(R.id.tv_rating)
        ratingBar.rating = (intent.getDoubleExtra("ratingValue", 0.0) / 2).toFloat()
        val votingCount = findViewById<TextView>(R.id.tv_vote_count)
        votingCount.text = intent.getIntExtra("votingCount", 0).toString()
    }
}