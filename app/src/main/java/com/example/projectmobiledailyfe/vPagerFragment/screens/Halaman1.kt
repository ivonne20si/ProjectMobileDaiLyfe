package com.example.projectmobiledailyfe.vPagerFragment.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.projectmobiledailyfe.R
import com.example.projectmobiledailyfe.databinding.FragmentHalaman1Binding


class Halaman1 : Fragment() {
    private lateinit var binding: FragmentHalaman1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_halaman1,
            container, false)
        binding = FragmentHalaman1Binding.bind(view)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.txtHalNext.setOnClickListener{
            viewPager?.currentItem = 1
        }
        return view
    }
}