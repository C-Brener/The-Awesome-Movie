package com.caiquebrener.theawesomemovie.ui.listmovies.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.caiquebrener.theawesomemovie.data.model.Movies
import com.caiquebrener.theawesomemovie.databinding.CardItemMovieBinding

class ListMoviesViewHolder(private val binding: CardItemMovieBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindingHolder(movies: Movies) {
        binding.titleMovieCard.text = movies.title
        binding.descriptionMovieCard.text = movies.description
        binding.imageMovieCard.setImageResource(movies.image)

    }

    init {
        binding.detailsMovie.setOnClickListener {
            binding.detailsMovie.text = "Bla"
        }
    }


}