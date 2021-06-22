package com.example.dictionaryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dictionaryapp.databinding.ActivityDefinitionBinding

class DefinitionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDefinitionBinding
    private val KEY = "DEFINITION"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDefinitionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.definitionTextView.text = intent.getStringExtra(KEY)

        binding.backImageView.setOnClickListener{
            finish()
        }
    }
}