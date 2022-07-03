package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.homework2.databinding.FragmentAchievementsBinding


class AchievementsFragment: Fragment(R.layout.fragment_achievements) {
    private var _binding: FragmentAchievementsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAchievementsBinding.bind(view)

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}