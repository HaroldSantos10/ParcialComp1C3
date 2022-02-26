package com.example.parcialcomp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

    fun sum(num1 : Int?, num2 : Int?): String{
        var result = ""
        if (num1 != null && num2 != null){

            result = (num1 + num2).toString()
        }else{
            if(num1 != null || num2 != null){
                if (num1 != null) {result = num1.toString()
                }
                if (num2 != null) {result = num2.toString()
                }
            }else{
                result= "Datos erroneos"
            }
        }
        return result
    }

}


