package com.example.androidengineerexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createAccount(view: View) {
        setContentView(R.layout.second_activity)
    }

    fun setEmailAddress(view: View) {
        val editTxt =findViewById<EditText>(R.id.emailInput)
        val emailAddress = editTxt.text.toString()
    }

    fun setPassword(view: View) {
        val editTxt =findViewById<EditText>(R.id.emailInput)
        val emailAddress = editTxt.text.toString()
    }



    fun goBack(view: View) {
        setContentView(R.layout.activity_main)
    }


}