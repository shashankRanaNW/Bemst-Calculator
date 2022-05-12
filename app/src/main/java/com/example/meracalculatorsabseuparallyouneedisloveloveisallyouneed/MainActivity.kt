package com.example.meracalculatorsabseuparallyouneedisloveloveisallyouneed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

var operator_mode :Char = ' '

class MainActivity : AppCompatActivity() {
    private var tvInput:TextView?=null

    //calculator variable inbound
    var answer: Int=0;
    var operand1: Int= 0;
    var operand2: Int=0;
    var operator_entered: Boolean = false
    var ran_first_time: Boolean = true

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

        if(ran_first_time){
            tvInput?.text= ""
            ran_first_time = false
        }


        if(!operator_entered){
            operand1=operand1*10 + Integer.parseInt((view as Button).text as String)
        }
        else{
            operand2 =operand2*10 + Integer.parseInt((view as Button).text as String)
        }

        Toast.makeText(this,"${(view as Button).text} dabaa, hay daabaa", Toast.LENGTH_SHORT).show()
        tvInput?.append((view as Button).text)
    }

    fun on_clear(view: View){
        tvInput?.text="";
        Toast.makeText(this, "All clear, all lite", Toast.LENGTH_SHORT).show()
        operand1 = 0
        operand2 = 0
        operator_entered =false
        operator_mode=' '

    }

    fun on_operator(view: View) {

        when((view as Button).text[0]){
            '+' -> {
                tvInput?.text = tvInput?.text.toString() + '+'
                operator_mode='+'
            }
            '-' -> {
                tvInput?.text = tvInput?.text.toString() + '-'
                operator_mode = '-'
            }
            '*' -> {
                tvInput?.text = tvInput?.text.toString() + '*'
                operator_mode='*'
            }
            '/' -> {
                tvInput?.text = tvInput?.text.toString() + '/'
                operator_mode='/'
            }
        }

        Toast.makeText(this,"${(view as Button).text}", Toast.LENGTH_SHORT).show()

        operator_entered=true;

    }

    fun on_equal(view: View){

        when(operator_mode) {
            '+' -> {
                answer = operand1 + operand2
            }
            '-' -> {
                answer = operand1 - operand2
            }
            '*' -> {
                answer = operand1 * operand2
            }
            '/' -> {
                answer = operand1 / operand2
            }
        }

        tvInput?.text= answer.toString();
        operator_entered = false;
        ran_first_time=true;

        Toast.makeText(this,"$operand1 $operator_mode $operand2 = $answer", Toast.LENGTH_SHORT).show()

        operand1 = 0
        operand2 = 0
        operator_entered =false
        operator_mode=' '
    }


}