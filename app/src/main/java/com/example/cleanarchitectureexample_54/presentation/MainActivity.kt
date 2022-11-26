package com.example.cleanarchitectureexample_54.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.cleanarchitectureexample_54.R
import com.example.data.data.repository.UserRepositoryImpl
import com.example.data.data.storage.SharedPrefUserStorage
import com.example.domain.domain.model.SaveUserNameParam
import com.example.domain.domain.repository.UserRepository
import com.example.domain.domain.usecase.GetUserNameUseCase
import com.example.domain.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val userRepository by lazy(LazyThreadSafetyMode.NONE) {
        UserRepositoryImpl(userStorage = SharedPrefUserStorage(context = applicationContext))
    }
    private val getUserNameUseCase by lazy(LazyThreadSafetyMode.NONE) {
        GetUserNameUseCase(userRepository = userRepository)
    }
    private val saveUserNameUseCase by lazy(LazyThreadSafetyMode.NONE) {
        SaveUserNameUseCase(userRepository = userRepository)
    }

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
            val param = com.example.domain.domain.model.SaveUserNameParam(name = text)
            val result = saveUserNameUseCase.execute(param)
            dataTextview.text = "Save result $result"
        }
    }
}