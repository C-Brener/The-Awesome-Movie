package com.caiquebrener.theawesomemovie.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.caiquebrener.theawesomemovie.R
import com.caiquebrener.theawesomemovie.data.model.Movies
import com.caiquebrener.theawesomemovie.ui.DataState
import com.caiquebrener.theawesomemovie.ui.utils.ScreenStateEnum

class MoviesViewModel : ViewModel() {

    private val _listMovies: MutableLiveData<List<Movies>> = MutableLiveData()
     val listMovies: LiveData<List<Movies>> = _listMovies


    private val _movieDetails: MutableLiveData<Movies> = MutableLiveData()
    val movieDetailsLiveData: LiveData<Movies> = _movieDetails

    private val _stateScreen: MutableLiveData<DataState> =
        MutableLiveData(DataState(state = ScreenStateEnum.LOADING))
    val stateScreen: LiveData<DataState> = _stateScreen


    fun selectedMovie(movies: Movies) {
        _movieDetails.postValue(movies)
    }

    private fun getItens() {
        _listMovies.postValue(setupMockList())
        _stateScreen.postValue(DataState(ScreenStateEnum.SUCCESS))
    }

    private fun setupMockList() = listOf(
        Movies("Boa noite", image = R.drawable.ic_launcher_background, "Teste"),
        Movies(
            "Boa noite", image = R.drawable.ic_baseline_menu_24, "Teste"
        ),
        Movies("Boa noite", image = R.drawable.ic_launcher_background, "Teste"),
    )

    init {
        getItens()
    }
}