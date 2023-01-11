package com.example.projectmobiledailyfe

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class OnBoarding1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(
                    R.id.action_onBoarding1_to_halamanLogin)
            } else{
                findNavController().navigate(
                    R.id.action_onBoarding1_to_viewPagerFragment)
            }
        }, 3000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding1, container, false)
    }
    private fun onBoardingFinished(): Boolean {
        val sharePref = requireActivity().getSharedPreferences("Onboarding", Context.MODE_PRIVATE)
        return sharePref.getBoolean("Selesai", false)
    }


}