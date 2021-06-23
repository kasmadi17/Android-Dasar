package com.cx.app.kelasandroid1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private var id:TextView? =null
    private var name:TextView? = null

    private val TAG = "MainActivity2"

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        id = findViewById(R.id.tvId)
        name = findViewById(R.id.tvName)
        Log.i(TAG, "onCreate: ")

        val textId = intent.getIntExtra("id", 0)
        val textName = intent.getStringExtra("name")

        id?.text = textId.toString()
        name?.text = textName

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }
}