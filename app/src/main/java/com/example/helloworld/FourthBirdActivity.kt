package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloworld.databinding.ActivityFifthBirdBinding
import com.example.helloworld.databinding.ActivityFourthBirdBinding
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding:ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnprev4.setOnClickListener{
            finish()
        }
        binding.btnNext4.setOnClickListener{
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/474x/88/68/a2/8868a2add2266cc81a1da152f72ef6db.jpg")
            .into(binding.imageView9)

    }
}

