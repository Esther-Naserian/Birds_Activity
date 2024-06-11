package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloworld.databinding.ActivityMainBinding

class
SecondBirdActivity : AppCompatActivity() {
    lateinit var =binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       binding = ActivityMainBinding.infate(layoutInflater)
        setContentView(binding.root)
                binding.btnNext.setOnClickListener{
                    val intent = Intent(this,SecondBirdActivity::class.java)
                    startActivity(intent)
                }
                picasso
        get().load("https://github.com/Esther-Naserian/Mentor-Connect.git")

            .into(binding.imageView)

            }
        }
    }
}