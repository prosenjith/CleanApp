package com.example.presentation.viewmodels.main

import com.example.presentation.viewmodels.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : BaseViewModel() {
    val data: Int = 100
}