package com.example.activityfragmentweeklytwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alert: View = findViewById(R.id.btnAlert)
        Log.d("MyLog","onCreate MainActivity")
        alert.setOnClickListener {
            startActivity(Intent(this, ActivityOpenAlertDialog::class.java))
            finish()
        }
    }
    override fun onResume() {
        super.onResume()
        Log.d("MyLog","onResume MainActivity")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MyLog","onPause MainActivity")
    }
    override fun onStart() {
        super.onStart()
        Log.d("MyLog","onStart MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","onStop MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","onDestroy MainActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog","onRestart MainActivity")
    }
}