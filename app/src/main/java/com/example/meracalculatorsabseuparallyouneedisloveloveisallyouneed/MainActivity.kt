package com.example.meracalculatorsabseuparallyouneedisloveloveisallyouneed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text



class MainActivity : AppCompatActivity() {
    private var tvInput:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {

        //var answer_box: TextView
        super.onCreate(savedInstanceState)
        tvInput = findViewById(R.id.answer_box)
        setContentView(R.layout.activity_main)
    }

    fun on_digit(view: View) {
        Toast.makeText(this,"${(view as Button).text}dabaaaaaaaa, haay dabaaa", Toast.LENGTH_SHORT).show()
        tvInput?.append((view).text)
    }

    fun on_clear(view: View){
        tvInput?.text="";
        Toast.makeText(this, "All clear, all lite", Toast.LENGTH_SHORT).show()
    }
}