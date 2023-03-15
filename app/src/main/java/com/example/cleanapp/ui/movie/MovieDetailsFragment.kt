package com.example.cleanapp.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.cleanapp.base.BaseFragment
import com.example.cleanapp.databinding.FragmentMovieDetailsBinding
import com.example.presentation.viewmodels.movie.MovieDetailsViewModel

class MovieDetailsFragment : BaseFragment<FragmentMovieDetailsBinding, MovieDetailsViewModel>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMovieDetailsBinding
        get() = FragmentMovieDetailsBinding::inflate
    override val viewModel: MovieDetailsViewModel by viewModels()
}