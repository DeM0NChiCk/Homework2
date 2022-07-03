package com.example.homework2

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment

import com.google.android.material.snackbar.Snackbar

class FavoritesFragment:Fragment(R.layout.fragment_favorites) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val text = arguments?.getString("ARG_TEXT").orEmpty()

        if (text.isNotEmpty()) {
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).show()

        }


    }


}