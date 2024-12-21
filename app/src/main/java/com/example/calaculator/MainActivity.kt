package com.example.calaculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isnew=true
    fun btnClicked(view:View){
        val show = findViewById<TextView>(R.id.showNumber)
        if (isnew){
            show.text=""
        }
        isnew=false
        var number:String=show.text.toString()
        val btn_Number=view as Button
        when (btn_Number.id){
            R.id.btn_0 ->{
                number+="0"
            }
            R.id.btn_1 ->{
                number+="1"
            }
            R.id.btn_2 ->{
            number+="2"
        }
            R.id.btn_3 ->{
                number+="3"
            }
            R.id.btn_4 ->{
                number+="4"
            }
            R.id.btn_5 ->{
                number+="5"
            }
            R.id.btn_6 ->{
                number+="6"
            }
            R.id.btn_7 ->{
                number+="7"
            }
            R.id.btn_8 ->{
                number+="8"
            }
            R.id.btn_9 ->{
                number+="9"
            }
            R.id.btn_dot ->{
                number+="."
            }
        }
        show.text=number
    }

    var oldNumber=""
    var operation="+"
    fun btnOp(view:View){
        val show = findViewById<TextView>(R.id.showNumber)

        oldNumber=show.text.toString()
        isnew=true
        val op=view as Button

        when(op.id){
            R.id.btn_div->{
                operation="/"
            }
            R.id.btn_mul->{
                operation="*"
            }
            R.id.btn_minus->{
                operation="-"
            }
        }

    }
    fun btnEqual(view: View){
        val show = findViewById<TextView>(R.id.showNumber)

        var newNumber=show.text.toString()
        var Result:Double=0.0
        when(operation){
            "+"->{
                Result=oldNumber.toDouble()+newNumber.toDouble()

            }
            "-"->{
                Result=oldNumber.toDouble()-newNumber.toDouble()

            }
            "*"->{
                Result=oldNumber.toDouble()*newNumber.toDouble()

            }
            "/"->{
                Result=oldNumber.toDouble()/newNumber.toDouble()

            }
        }
        show.text=Result.toString()
        isnew=true
    }

    fun btn_clear(view: View){
        val show = findViewById<TextView>(R.id.showNumber)

        isnew=true
        show.text="0"
    }

}