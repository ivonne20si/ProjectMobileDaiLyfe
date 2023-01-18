package com.example.projectmobiledailyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.projectmobiledailyfe.databinding.ActivityHomeBinding
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnGambarListener()


    }
    private fun btnGambarListener() {
        btn_didik.setOnClickListener {
            startActivity(Intent(this, DidikActivity::class.java))
        }
        btn_hari.setOnClickListener {
            startActivity(Intent(this, HariActivity::class.java))
        }
        btn_kerja.setOnClickListener {
            startActivity(Intent(this, KerjaActivity::class.java))
        }
    }
}