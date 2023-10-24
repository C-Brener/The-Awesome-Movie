package com.caiquebrener.theawesomemovie.ui.listmovies.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.caiquebrener.theawesomemovie.data.model.Movies
import com.caiquebrener.theawesomemovie.databinding.CardItemMovieBinding

class ListMoviesViewHolder(private val binding: CardItemMovieBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bindingHolder(movies: Movies) {
        binding.movies = movies
    }
}