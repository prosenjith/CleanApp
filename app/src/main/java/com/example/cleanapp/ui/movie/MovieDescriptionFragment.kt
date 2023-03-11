package com.example.cleanapp.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cleanapp.databinding.FragmentMovieDescriptionBinding
import com.example.cleanapp.utils.FragmentViewBindingDelegate

class MovieDescriptionFragment : Fragment() {

    private val binding by FragmentViewBindingDelegate(this, FragmentMovieDescriptionBinding::inflate)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}