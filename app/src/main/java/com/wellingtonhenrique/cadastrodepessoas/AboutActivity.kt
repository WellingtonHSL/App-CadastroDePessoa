package com.wellingtonhenrique.cadastrodepessoas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    private val TAG = "lifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.d(TAG, "onCrate - About")
    }

    override  fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - About")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume - About")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause - About")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - About")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart - About")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - About")
    }
}