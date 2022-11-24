package com.example.cleanarchitectureexample_54

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextview: TextView = findViewById(R.id.textViewInfo)
        val dataEditText: EditText = findViewById(R.id.editTextPutData)
        val getButton: Button = findViewById(R.id.buttonGetData)
        val saveButton: Button = findViewById(R.id.buttonSaveData)

        getButton.setOnClickListener {

        }

        saveButton.setOnClickListener {
            
        }
    }
}