package com.caiquebrener.theawesomemovie.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.caiquebrener.theawesomemovie.data.model.Movies

class MoviesViewModel : ViewModel() {

    val name: MutableLiveData<Movies> = MutableLiveData()
}