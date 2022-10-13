package com.caiquebrener.theawesomemovie.ui.listmovies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.caiquebrener.theawesomemovie.R
import com.caiquebrener.theawesomemovie.data.model.Movies
import com.caiquebrener.theawesomemovie.databinding.FragmentListMoviesBinding
import com.caiquebrener.theawesomemovie.ui.listmovies.recyclerview.ListMoviesAdapter
import com.caiquebrener.theawesomemovie.ui.viewmodel.MoviesViewModel


class ListMoviesFragment : Fragment() {
    private var _binding: FragmentListMoviesBinding? = null
    val viewModel: MoviesViewModel by activityViewModels()
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val moviesAdapter = ListMoviesAdapter(setupMockList()) { movies ->
            viewModel.name.postValue(movies)
            findNavController().navigate(ListMoviesFragmentDirections.actionListMoviesFragmentToMoviesDetailsFragment())
        }

        binding.recyclerView.adapter = moviesAdapter
    }

    private fun setupMockList() = listOf<Movies>(
        Movies("Boa noite", image = R.drawable.ic_launcher_background, "Teste"),
        Movies(
            "Boa noite", image = R.drawable.ic_baseline_menu_24, "Teste"
        ),
        Movies("Boa noite", image = R.drawable.ic_launcher_background, "Teste"),
    )
}