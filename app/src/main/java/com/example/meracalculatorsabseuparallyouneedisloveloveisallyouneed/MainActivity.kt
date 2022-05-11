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

    //calculator variable inbound
    var answer=0.0;
    var operand1= 0.0;
    var operand2=0.0;

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInput = findViewById(R.id.answer_box)
        //zindagi me sada sada R.view.id thingy setContentView ke baad likhni hoti he
        //and private var karke null ki jagah, lateinit bhi kar sakete hain, we do all
        //this stuff cuz things are in class
        //fucntion should be outside and not in onCreate cuz the compiler searches for
        //on_digit inside class, not inside onCreate

    }

    fun on_digit(view: View) {
        Toast.makeText(this,"${(view as Button).text}dabaaaaaaaa, haay dabaaa", Toast.LENGTH_SHORT).show()
        tvInput?.append((view).text)
    }

    fun on_clear(view: View){
        tvInput?.text="";
        Toast.makeText(this, "All clear, all lite", Toast.LENGTH_SHORT).show()
    }

    fun on_operator(view: View) {

        when((view as Button).text[0]){
            '+' -> tvInput?.text = tvInput?.text.toString() + '+'
            '-' -> tvInput?.text = tvInput?.text.toString() + '-'
            '*' -> tvInput?.text = tvInput?.text.toString() + '*'
            '/' -> tvInput?.text = tvInput?.text.toString() + '/'
        }
    }

}