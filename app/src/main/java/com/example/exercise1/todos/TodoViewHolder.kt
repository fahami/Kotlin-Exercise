package com.example.exercise1.todos

import android.view.View
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.exercise1.R

class TodoViewHolder(view: View):ViewHolder(view) {
    val checkbox = view.findViewById<CheckBox>(R.id.cb_todo)

}