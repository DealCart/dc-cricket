package com.example.cricket_testing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cricket_testing.databinding.ActivityMainBinding
import com.example.dc_cricket.CricketGameActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startGame.setOnClickListener {
            CricketGameActivity.start(
                this,
                "2",
                "Saad Sheikh"
            )
        }
    }
}