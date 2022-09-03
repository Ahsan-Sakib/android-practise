package com.example.androidboilerplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    private val TAG = "discau"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "onCreate: 2")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: 2")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: 2")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: 2")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: 2")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: 2")
    }
}