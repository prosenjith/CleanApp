package com.example.cleanapp.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cleanapp.R
import com.example.cleanapp.databinding.FragmentMovieListBinding
import com.example.cleanapp.utils.FragmentViewBindingDelegate

class MovieListFragment : Fragment(R.layout.fragment_movie_list) {

    private val binding by FragmentViewBindingDelegate(this, FragmentMovieListBinding::inflate)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvTitle.setOnClickListener {
            findNavController().navigate(R.id.action_movieListFragment_to_movieDescriptionFragment)
        }
    }
}