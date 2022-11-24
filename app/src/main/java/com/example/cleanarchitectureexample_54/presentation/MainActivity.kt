package com.example.cleanarchitectureexample_54.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.cleanarchitectureexample_54.R
import com.example.cleanarchitectureexample_54.domain.model.SaveUserNameParam
import com.example.cleanarchitectureexample_54.domain.usecase.GetUserNameUseCase
import com.example.cleanarchitectureexample_54.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextview: TextView = findViewById(R.id.textViewInfo)
        val dataEditText: EditText = findViewById(R.id.editTextPutData)
        val getButton: Button = findViewById(R.id.buttonGetData)
        val saveButton: Button = findViewById(R.id.buttonSaveData)

        getButton.setOnClickListener {
            val userName = getUserNameUseCase.execute()
            dataTextview.text = "${userName.firstName} ${userName.lastName}"
        }

        saveButton.setOnClickListener {
            val text = dataEditText.text.toString()
            val param = SaveUserNameParam(name = text)
            val result = saveUserNameUseCase.execute(param)
            dataTextview.text = "Save result $result"
        }
    }
}