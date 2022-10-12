package com.example.exercise1.movies

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.exercise1.R
import com.example.exercise1.data.Movie
import com.squareup.picasso.Picasso

class MovieViewHolder(itemView: View, val eventHandling: (Movie) -> Unit) : ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.rv_title)
    val tvImage = itemView.findViewById<ImageView>(R.id.rv_cover)

    fun bindView(movie: Movie) {
        tvTitle.text = movie.title
        Picasso.get().load("https://image.tmdb.org/t/p/w500${movie.posterPath}").into(tvImage);
        itemView.setOnClickListener { eventHandling(movie) }
    }
}