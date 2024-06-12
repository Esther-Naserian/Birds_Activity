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

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
       binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
                binding.btnprev2.setOnClickListener {
                    finish()
                }
          binding.btnNext2.setOnClickListener{
                    val intent = Intent(this,ThirdBirdActivity::class.java)
                    startActivity(intent)
                }
                Picasso
                    .get()
                    .load("https://preview.redd.it/peebmy86wm2b1.jpg?width=640&crop=smart&auto=webp&s=6a668b6a5fabe1cad7cabcbfdba81a5642b30fe7")
                    .into(binding.imageView6)

            }
        }
