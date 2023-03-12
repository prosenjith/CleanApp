package com.example.cleanapp.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cleanapp.R
import com.example.cleanapp.base.BaseFragment
import com.example.cleanapp.databinding.FragmentMovieListBinding

class MovieListFragment : BaseFragment<FragmentMovieListBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMovieListBinding
        get() = FragmentMovieListBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvTitle.setOnClickListener {
            findNavController().navigate(R.id.action_movieListFragment_to_movieDescriptionFragment)
        }
    }
}