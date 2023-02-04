package org.kimp.kinopoisk.tinkoff.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import org.kimp.kinopoisk.tinkoff.R
import org.kimp.kinopoisk.tinkoff.databinding.FragmentFilmsBinding

@AndroidEntryPoint
class FilmsFragment: Fragment() {
    private lateinit var binding: FragmentFilmsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilmsBinding.inflate(
            layoutInflater, container, false
        )

        updateToolbarTitle()

        return binding.root
    }

    private fun updateToolbarTitle() {
        binding.toolbar.title = getString(R.string.films_fragment_favorite_btn_text)
    }
}