package com.example.androidengineerexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    val editTxtEmail: EditText = findViewById<EditText>(R.id.emailInput)
    val editTxtPassword: EditText = findViewById<EditText>(R.id.enterPassword)
    val editTxtConfirmPassword: EditText = findViewById<EditText>(R.id.confirmPassword)

    val nextButton: ImageButton = findViewById<ImageButton>(R.id.imageButton)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailAddress = editTxtEmail.text.toString()
        val password = editTxtPassword.text.toString()
        val confirmPassword = editTxtConfirmPassword.text.toString()

        nextButton.setOnClickListener() {
            setEmailAddress(emailAddress)
            setPassword(password)
            confirmPassword(confirmPassword)
        }
    }

    fun createAccount(view: View) {
        setContentView(R.layout.second_activity)
    }

    fun setEmailAddress(view: String) {

    }

    fun setPassword(view: String) {

    }

    fun confirmPassword(view: String) {

    }

    fun goBack(view: View) {
        setContentView(R.layout.activity_main)
    }


}