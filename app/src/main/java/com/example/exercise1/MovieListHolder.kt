package com.example.exercise1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MovieListHolder(itemView: View) : ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.rv_title)
    val tvDesc = itemView.findViewById<TextView>(R.id.rv_desc)
    val tvImage = itemView.findViewById<ImageView>(R.id.rv_cover)

    fun bindView(movie: Movie) {
        tvTitle.text = movie.title
        tvDesc.text = movie.desc
        tvImage.setImageDrawable(
            ContextCompat.getDrawable(
                itemView.context,
                movie.image
            )
        )
    }
}