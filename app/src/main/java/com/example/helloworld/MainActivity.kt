package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


// This Kotlin file is where we are going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // User can tap a button to change the text color of the label
        // 1. Add a button to our layout

        // Get a reference to button
        // 2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button tap
            //2. Change the color of the text
            Log.i("Rudraksh","Tapped on button")

            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor( getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button2).setOnClickListener{
            Log.i("Bablu","Tapped on button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.black))

        }

        findViewById<Button>(R.id.button3).setOnClickListener{
            Log.i("Cat","Tapped on button")
            findViewById<TextView>(R.id.textView).setText("Goodbye \uD83D\uDC4B")
        }

        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener{
            Log.i("Dog","Tapped on button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.CodePathColor))
            findViewById<TextView>(R.id.textView).setText("Hello from Rudraksh")
            findViewById<TextView>(R.id.textView).setTextColor( getResources().getColor(R.color.black))
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<TextView>(R.id.textView).setText(findViewById<EditText>(R.id.editTextName).text)
        }






    }
}