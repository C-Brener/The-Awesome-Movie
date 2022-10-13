package com.caiquebrener.theawesomemovie.ui.listmovies.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.caiquebrener.theawesomemovie.data.model.Movies
import com.caiquebrener.theawesomemovie.databinding.CardItemMovieBinding

class ListMoviesAdapter(
    private val listMovies: List<Movies>,
    private val onItemClick: (Movies) -> Unit
) :
    RecyclerView.Adapter<ListMoviesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMoviesViewHolder {
        return ListMoviesViewHolder(
            CardItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListMoviesViewHolder, position: Int) {
        holder.bindingHolder(listMovies[position])
        holder.itemView.setOnClickListener {
            onItemClick(listMovies[position])
        }
    }

    override fun getItemCount() = listMovies.size

}