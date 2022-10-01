package com.example.exercise1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class MovieListAdapter() : Adapter<MovieListHolder>() {
    private val movieData = arrayListOf<Movie>(
    Movie("Anak Tiri", "Hambatan", R.drawable.ic_calendar),
    Movie("Anak Kandung", "Hambatan", R.drawable.ic_exit),
    Movie("Anak Cucu", "Hambatan", R.drawable.ic_play),
    Movie("Anak Keponakan", "Hambatan", R.drawable.ic_setting),
    Movie("Anak Oalah", "Hambatan", R.drawable.ic_star),
    Movie("Anak Begitu", "Hambatan", R.drawable.profile_picture),
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListHolder {
        return MovieListHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieListHolder, position: Int) {
        holder.bindView(movieData[position])
    }

    override fun getItemCount(): Int  = movieData.size
}