package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textChange=findViewById<TextView>(R.id.textView)
        var timesClicked=0
        val btnClickMe=findViewById<Button>(R.id.mybutton)
//        btnClickMe.text="Clicked me!"
        btnClickMe.setOnClickListener{
//            btnClickMe.text="haha you clicked me!"
            timesClicked++
            textChange.text=timesClicked.toString()
            //for pop up
            Toast.makeText(this, "Clicked "+timesClicked.toString()+" times", Toast.LENGTH_SHORT).show()
        }

    }
}