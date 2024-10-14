package com.example.androidpractice1to3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidpractice1to3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receivedText = intent.getStringExtra("text")
        binding.textView.text = receivedText
    }
}