package com.example.presentation.viewmodels.movie

import com.example.presentation.viewmodels.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor():BaseViewModel(){
    val data = 300
}