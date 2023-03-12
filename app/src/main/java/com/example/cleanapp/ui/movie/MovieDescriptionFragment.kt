package com.example.cleanapp.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.cleanapp.base.BaseFragment
import com.example.cleanapp.databinding.FragmentMovieDescriptionBinding

class MovieDescriptionFragment : BaseFragment<FragmentMovieDescriptionBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMovieDescriptionBinding
        get() = FragmentMovieDescriptionBinding::inflate
}