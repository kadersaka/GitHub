package com.ultratic.github

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //first appp with GitHub
        val btn = findViewById<Button>(R.id.btn)
        val text = findViewById<TextView>(R.id.text)
    }
}
