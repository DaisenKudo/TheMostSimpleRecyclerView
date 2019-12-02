package io.github.qlain.themostsimplerecyclerview.model

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.qlain.themostsimplerecyclerview.R

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById(R.id.tv_item_model)
}