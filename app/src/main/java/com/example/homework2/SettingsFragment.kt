package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

import com.example.homework2.databinding.FragmentSettingsBinding

class SettingsFragment: Fragment(R.layout.fragment_settings) {
    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}