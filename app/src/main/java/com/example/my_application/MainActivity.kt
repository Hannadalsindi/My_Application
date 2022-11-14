package com.example.my_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeToast(view: View) {
        var mylabel = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(.this,mylabel.text,Toast.LENGTH_LONG).show()
    }
}







