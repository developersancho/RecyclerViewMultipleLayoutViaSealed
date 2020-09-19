package com.recyclerviewmultiplelayoutviasealed

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import kotlinx.android.synthetic.main.row_movie_category.view.*
import kotlinx.android.synthetic.main.row_movie_content.view.*

class MovieAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var movies: List<Movie> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.row_movie_category -> {
                CategoryViewHolder(parent.inflate(R.layout.row_movie_category))
            }
            R.layout.row_movie_content -> {
                MovieViewHolder(parent.inflate(R.layout.row_movie_content))
            }
            else -> throw IllegalStateException("Unknown view type $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val movie = movies[position]) {
            is MovieCategory -> (holder as CategoryViewHolder).bind(movie)
            is MovieContent -> (holder as MovieViewHolder).bind(movie)
        }
    }

    // get the size of the list
    override fun getItemCount() = movies.size

    override fun getItemViewType(position: Int): Int {
        return when (movies[position]) {
            is MovieCategory -> R.layout.row_movie_category
            is MovieContent -> R.layout.row_movie_content
        }
    }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: MovieCategory) {
            itemView.tvCategoryName.text = item.categoryName
        }
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: MovieContent) {
            itemView.tvTitle.text = item.title
            itemView.ivMovie.load(uri = item.image)
        }
    }

}