package com.example.projectmobiledailyfe
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.projectmobiledailyfe.databinding.FragmentHalamanUtamaBinding


class HalamanUtama : Fragment() {
    private lateinit var binding: FragmentHalamanUtamaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_halaman1,
            container, false
        )
        binding = FragmentHalamanUtamaBinding.bind(view)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.txtUtama.setOnClickListener {
            Toast.makeText(context, "Ini Halaman Home", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}