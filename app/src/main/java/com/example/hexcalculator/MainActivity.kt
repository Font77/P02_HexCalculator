package com.example.hexcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cu = ComputeUnit(0)

        var clearbutton: Button = findViewById<Button>(R.id.clearButton)
        var textview1: TextView = findViewById(R.id.textview1)
        var editText1: EditText = findViewById(R.id.edit1)

        var incButton: Button = findViewById(R.id.incbutton)
        var decButton: Button = findViewById(R.id.decbutton)
        var num1Button: Button = findViewById(R.id.num1button)
        var num2Button: Button = findViewById(R.id.num2button)

        var num3Button: Button = findViewById(R.id.num3button)
        var num4Button: Button = findViewById(R.id.num4button)
        var num5Button: Button = findViewById(R.id.num5button)
        var num6Button: Button = findViewById(R.id.num6button)
        var num7Button: Button = findViewById(R.id.num7button)
        var num8Button: Button = findViewById(R.id.num8button)
        var num9Button: Button = findViewById(R.id.num9button)
        var num0Button: Button = findViewById(R.id.num0button)

        var delbutton: Button = findViewById(R.id.delbutton)
        val limitlength: Int = 12

        delbutton.setOnClickListener {
            cu.del_tail_char()
            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num1Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength) s += '1'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num2Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength) s += '2'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }


        num3Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength) s += '3'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }


        num4Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength ) s += '4'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num5Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength ) s += '5'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num6Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength ) s += '6'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num7Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength ) s += '7'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num8Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength ) s += '8'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num9Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength ) s += '9'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        num0Button.setOnClickListener {
            var s = cu.num.toString()
            if (s.length < limitlength ) s += '0'
            cu.num = s.toLong()

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        incButton.setOnClickListener {
            var num = cu.num + 1
            cu.num = num

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }

        decButton.setOnClickListener {
            var num = cu.num - 1
            cu.num = num

            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())
        }


        clearbutton.setOnClickListener {
            cu.num = 0
            textview1.setText(cu.get_hex())
            editText1.setText(cu.num.toString())

            /*val toast = Toast.makeText(this, cu.get_hex(), Toast.LENGTH_SHORT)
            toast.show()
             */

        }


    }
    fun update(){
    }
}


