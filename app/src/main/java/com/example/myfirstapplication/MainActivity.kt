package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun setupMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Under construction!", Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun ScanRF(view: View) {
        // Create an Intent to start the second activity
        val ScanRFIntent = Intent(this, RF_scan::class.java)
        // Start the new activity.
        startActivity(ScanRFIntent)
    }
}