package com.example.homework2

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentCatalogBinding

class CatalogFragment:Fragment(R.layout.fragment_catalog) {
    private var _binding: FragmentCatalogBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCatalogBinding.bind(view)

        with(binding) {
            btnMyFavorites.setOnClickListener{
                val bundle = Bundle()
                val text = "I'm from the catalog"
                bundle.putString(
                    "ARG_TEXT",
                    text
                )


                findNavController().navigate(R.id.action_catalogFragment_to_favoritesFragment,bundle)

            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}