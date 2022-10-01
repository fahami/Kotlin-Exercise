package com.example.exercise1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class MovieListAdapter(
    private val eventHandling: (Movie) -> Unit
) : Adapter<MovieListHolder>() {
    private val movies = arrayListOf<Movie>()

    fun setData(movies: ArrayList<Movie>) {
        this.movies.clear()
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListHolder {
        return MovieListHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false),
            eventHandling
        )
    }

    override fun onBindViewHolder(holder: MovieListHolder, position: Int) {
        holder.bindView(movies[position])
    }

    override fun getItemCount(): Int = movies.size
}