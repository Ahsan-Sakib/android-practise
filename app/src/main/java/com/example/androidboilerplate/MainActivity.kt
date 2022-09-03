package com.example.androidboilerplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton


class MainActivity : AppCompatActivity() {
    private val TAG = "discau"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_me = findViewById(R.id.first_button) as AppCompatButton
        // set on-click listener
        Log.d(TAG, "onCreate: 1")

        btn_click_me.setOnClickListener {
            // your code to perform when the user clicks on the button
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: 1")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: 1")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: 1")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: 1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: 1")
    }
}