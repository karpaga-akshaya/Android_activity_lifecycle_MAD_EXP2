package com.example.activitylifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate()")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart()")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume()")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause()")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy()")
    }
}
