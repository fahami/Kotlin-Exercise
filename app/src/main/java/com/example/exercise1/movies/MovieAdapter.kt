package com.example.exercise1.movies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.exercise1.R
import com.example.exercise1.data.Movie

class MovieAdapter(
    private val eventHandling: (Movie) -> Unit
) : Adapter<MovieViewHolder>() {
    private val movies = arrayListOf<Movie>()

    fun setData(movies: ArrayList<Movie>) {
        this.movies.clear()
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false),
            eventHandling
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindView(movies[position])
    }

    override fun getItemCount(): Int = movies.size
}