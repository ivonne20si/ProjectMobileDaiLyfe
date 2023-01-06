package com.example.projectmobiledailyfe.vPagerFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.projectmobiledailyfe.R
import com.example.projectmobiledailyfe.databinding.FragmentViewPagerBinding
import com.example.projectmobiledailyfe.vPagerFragment.screens.Halaman1
import com.example.projectmobiledailyfe.vPagerFragment.screens.Halaman2
import com.example.projectmobiledailyfe.vPagerFragment.screens.Halaman3


class ViewPagerFragment : Fragment(){
    lateinit var binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_view_pager,
            container,false)
        binding = FragmentViewPagerBinding.bind(view)
        val fragmentlist = arrayListOf(
            Halaman1(),
            Halaman2(),
            Halaman3()
        )

        val adapter = ViewPagerAdapter(fragmentlist,requireActivity().supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        return view
    }
}