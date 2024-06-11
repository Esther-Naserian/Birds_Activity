package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloworld.databinding.ActivityMainBinding

class
ThirdBirdActivity : AppCompatActivity() {
    lateinit var = binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.infate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext.setOnClickListener{
            val intent = Intent(this,SecondBirdActivity::class.java)
            startActivity(intent)
        }
        picasso
            get.load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStHUOuD00J-lXAP0lyQmOsSdsC8wJu4w2GJg&s")
            .into(binding.imageView)


        }
    }
}