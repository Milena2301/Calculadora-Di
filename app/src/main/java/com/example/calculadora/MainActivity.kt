package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador:Int = 0
    var result: String ="";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)



        val coma: Button = findViewById(R.id.buttoncoma)
        val plus: Button = findViewById(R.id.buttonplus)
        val rest: Button = findViewById(R.id.buttonRest)
        val div: Button = findViewById(R.id.buttonDiv)
        val multi: Button = findViewById(R.id.buttonMult)
        val equals: Button = findViewById(R.id.buttonEquals)
        val buttonAC: Button = findViewById(R.id.buttonAc)

        //Variables
        var firstNumber = ""
        result = ""
        var operation = ""
        var decimal = false
        val text_number: TextView = findViewById(R.id.txt_number)

        //click number0
        button0.setOnClickListener {
            if (decimal) {
                result += 0
            } else {
                result += 0
            }
            text_number.text = result
        }
        button1.setOnClickListener {
            if (decimal) {
                result += 1
            } else {
                result += 1
            }
            text_number.text = result

        }
        button2.setOnClickListener {
            if (decimal) {
                result += 2
            } else {
                result += 2
            }
            text_number.text = result

        }
        button3.setOnClickListener {
            if (decimal) {
                result += 3
            } else {
                result += 3
            }
            text_number.text = result

        }
        button4.setOnClickListener {
            if (decimal) {
                result += 4
            } else {
                result += 4
            }
            text_number.text = result

        }
        button5.setOnClickListener {
            if (decimal) {
                result += 5
            } else {
                result += 5
            }
            text_number.text = result

        }
        button6.setOnClickListener {
            if (decimal) {
                result += 6
            } else {
                result += 6
            }
            text_number.text = result

        }
        button7.setOnClickListener {
            if (decimal) {
                result += 7
            } else {
                result += 7
            }
            text_number.text = result

        }
        button8.setOnClickListener {
            if (decimal) {
                result += 8
            } else {
                result += 8
            }
            text_number.text = result

        }
        button9.setOnClickListener {
            if (decimal) {
                result += 9
            } else {
                result += 9
            }
            text_number.text = result

        }
        coma.setOnClickListener {
            decimal = true
            result += "."
            text_number.text = result
        }
        plus.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "+"
            decimal = false
        }
        rest.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "-"
            decimal = false
        }
        div.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "/"
            decimal = false
        }
        multi.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "x"
            decimal = false
        }
        buttonAC.setOnClickListener {
            firstNumber = ""
            result = ""
            operation = ""
            decimal = false
            text_number.text = "0"
        }
        equals.setOnClickListener {
            when (operation) {
                "+" -> {
                    result = ((firstNumber).toDouble() + (result).toDouble()).toString()
                }

                "-" -> {
                    result = ((firstNumber).toDouble() - (result).toDouble()).toString()
                }

                "*" -> {
                    result = ((firstNumber).toDouble() * (result).toDouble()).toString()
                }

                "/" -> {
                    result = ((firstNumber).toDouble() / (result).toDouble()).toString()
                }
            }
            text_number.text = result
        }
        savedInstanceState?.let {
            result = it.getString("result", result);
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("result", result)
        super.onSaveInstanceState(outState)

    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        result = savedInstanceState.getString("result",result)
    }

    override fun onResume(){
        super.onResume()
        val text:TextView = findViewById(R.id.txt_number)
        text.text = result
    }

}