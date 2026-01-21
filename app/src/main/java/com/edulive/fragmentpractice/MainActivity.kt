package com.edulive.fragmentpractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("ACTIVITY", "onCreate")

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SampleFragment())
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ACTIVITY", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ACTIVITY", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ACTIVITY", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ACTIVITY", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ACTIVITY", "onDestroy")
    }

}