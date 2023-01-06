package com.example.projectmobiledailyfe.vPagerFragment.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projectmobiledailyfe.R

import com.example.projectmobiledailyfe.databinding.FragmentHalaman3Binding

class Halaman3 : Fragment() {
    private lateinit var binding: FragmentHalaman3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_halaman3,container,false
        )
        binding = FragmentHalaman3Binding.bind(view)
        binding.txtSelesai.setOnClickListener{
            findNavController().navigate(
                R.id.action_viewPagerFragment_to_halamanUtama
            )
            onBoardingFinished()
        }
        return view
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity()
            .getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Selesai", true)
        editor.apply()
    }
}