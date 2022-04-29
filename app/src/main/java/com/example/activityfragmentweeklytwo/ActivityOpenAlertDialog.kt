package com.example.activityfragmentweeklytwo

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.activityfragmentweeklytwo.dialog.MyAlertDialog

class ActivityOpenAlertDialog:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_dialog)
        val dialog: View = findViewById(R.id.btnDialog)
        Log.d("MyLog","onCreate ActivityOpenAlertDialog")
        dialog.setOnClickListener {
            val myDialogFragment = MyAlertDialog()
            val manager = supportFragmentManager
            myDialogFragment.show(manager, "myDialog")
        }
    }
    override fun onResume() {
        super.onResume()
        Log.d("MyLog","onResume ActivityOpenAlertDialog")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MyLog","onPause ActivityOpenAlertDialog")
    }
    override fun onStart() {
        super.onStart()
        Log.d("MyLog","onStart ActivityOpenAlertDialog")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","onStop ActivityOpenAlertDialog")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","onDestroy ActivityOpenAlertDialog")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog","onRestart ActivityOpenAlertDialog")
    }
}