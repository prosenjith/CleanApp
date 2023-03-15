package com.example.cleanapp.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.cleanapp.R
import com.example.cleanapp.base.BaseFragment
import com.example.cleanapp.databinding.FragmentMovieListBinding
import com.example.presentation.viewmodels.main.MainViewModel
import com.example.presentation.viewmodels.movie.MovieListViewModel

class MovieListFragment : BaseFragment<FragmentMovieListBinding, MovieListViewModel>() {

    private val sharedViewModel: MainViewModel by activityViewModels()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMovieListBinding
        get() = FragmentMovieListBinding::inflate

    override val viewModel: MovieListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvTitle.setOnClickListener {
            findNavController().navigate(R.id.action_movieListFragment_to_movieDetailsFragment)
        }
    }
}