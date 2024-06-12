package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.databinding.ActivitySecondBirdBinding
import com.example.helloworld.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding:ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnprev3.setOnClickListener {
            finish()
        }
       binding.btnNext3.setOnClickListener{
           val intent = Intent(this,FourthBirdActivity::class.java)
           startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.saymedia-content.com/.image/t_share/MTc0NjQ2MDY4MDU4MDcyODQ3/worlds-most-beautiful-birds.jpg")
            .into(binding.imageView7)
    }

}




