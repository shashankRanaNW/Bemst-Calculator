package com.example.meracalculatorsabseuparallyouneedisloveloveisallyouneed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text



class MainActivity : AppCompatActivity() {
    private lateinit var answer_box: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        //var answer_box: TextView
        TODO("Ask why  if we intialise answer_box in here without getting score issues when we call answer_box afterwards")

        super.onCreate(savedInstanceState)
        answer_box= findViewById(R.id.answer_box)
        setContentView(R.layout.activity_main)



        var answer:Int = 0;
        var operand1:Int = 0;
        var operand2:Int = 0;

        /*
        val btn9: Button = findViewById(R.id.btn9);
        val btn8: Button = findViewById(R.id.btn8);
        val btn7: Button = findViewById(R.id.btn7);
        val btn6: Button = findViewById(R.id.btn6);
        val btn5: Button = findViewById(R.id.btn5);
        val btn4: Button = findViewById(R.id.btn4);
        val btn3: Button = findViewById(R.id.btn3);
        val btn2: Button = findViewById(R.id.btn2);
        val btn1: Button = findViewById(R.id.btn1);
        val btn0: Button = findViewById(R.id.btn0);
        val btn_minus: Button = findViewById(R.id.btn_minus);
        val btn_plus: Button = findViewById(R.id.btn_plus);
        val btn_divide: Button = findViewById(R.id.btn_divide);
        val btn_clear: Button = findViewById(R.id.btn_clear);
        val btn_multiply: Button = findViewById(R.id.btn_multiply);
        */

        fun on_digit(view: View):Unit{
            Toast.makeText(this,"${(view as Button).text}dabaaaaaaaa, haay dabaaa", Toast.LENGTH_SHORT).show()
            answer_box.text = answer_box.text.toString() + (view as Button).text;
        }

        /*
        btn9.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

        btn8.setOnClickListener(){
            on_digit(btn8.text as String)
            answer_box.text=btn8.text

        }

        btn7.setOnClickListener(){
            on_digit(btn7.text as String)
            answer_box.text=btn7.text
        }

        btn6.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

        btn9.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

        btn9.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

        btn9.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

        btn9.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

        btn9.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

        btn9.setOnClickListener(){
            on_digit(btn9.text as String)
            answer_box.text=btn9.text
        }

         */



        fun on_clear(view: View){
            answer_box.text="";
            Toast.makeText(this, "All clear, all lite", Toast.LENGTH_SHORT).show()
        }

        fun on_decimal(view:View){

        }

    }

    fun on_digit(view: View) {
        Toast.makeText(this,"${(view as Button).text}dabaaaaaaaa, haay dabaaa", Toast.LENGTH_SHORT).show()
        answer_box.text = answer_box.text.toString() + (view as Button).text;
    }
}