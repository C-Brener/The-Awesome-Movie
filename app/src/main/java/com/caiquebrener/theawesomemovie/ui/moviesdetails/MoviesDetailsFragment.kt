package com.caiquebrener.theawesomemovie.ui.moviesdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.caiquebrener.theawesomemovie.R
import com.caiquebrener.theawesomemovie.databinding.FragmentMoviesDetailsBinding
import com.caiquebrener.theawesomemovie.ui.viewmodel.MoviesViewModel

class MoviesDetailsFragment : Fragment() {
    private var _binding:FragmentMoviesDetailsBinding? = null
    val binding get() = _binding!!
    val viewMovies: MoviesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoviesDetailsBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.titleMovieDetails.text = viewMovies.name.value?.title
        binding.contentHqDetails.text = viewMovies.name.value?.description
        binding.imageMovieDetails.setImageResource(viewMovies.name.value?.image!!)
    }
}