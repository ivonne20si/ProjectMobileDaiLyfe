package com.example.projectmobiledailyfe.vPagerFragment.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.projectmobiledailyfe.R
import com.example.projectmobiledailyfe.databinding.FragmentHalaman2Binding

class Halaman2 : Fragment() {
    private lateinit var binding: FragmentHalaman2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_halaman2,
            container, false
        )
        binding = FragmentHalaman2Binding.bind(view)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.txtHalNext.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return view
    }
}