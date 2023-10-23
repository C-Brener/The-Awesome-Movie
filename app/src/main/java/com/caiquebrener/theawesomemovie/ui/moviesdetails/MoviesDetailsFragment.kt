package com.caiquebrener.theawesomemovie.ui.moviesdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.caiquebrener.theawesomemovie.R
import com.caiquebrener.theawesomemovie.databinding.FragmentMoviesDetailsBinding
import com.caiquebrener.theawesomemovie.ui.viewmodel.MoviesViewModel

class MoviesDetailsFragment : Fragment() {
    private lateinit var binding: FragmentMoviesDetailsBinding
    private val viewModel
    : MoviesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_movies_details,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.moviesDetails = viewModel
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}