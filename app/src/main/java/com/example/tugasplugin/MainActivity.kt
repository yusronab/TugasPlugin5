package com.example.tugasplugin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGithub.setOnClickListener {
            val github = Intent(Intent.ACTION_VIEW)
            github.setData(Uri.parse("https://github.com/yusronab"))
            startActivity(github)
        }
        btnInstagram.setOnClickListener {
            val instagram = Intent(Intent.ACTION_VIEW)
            instagram.setData(Uri.parse("https://instagram.com/yusr0nab"))
            startActivity(instagram)
        }
    }
}