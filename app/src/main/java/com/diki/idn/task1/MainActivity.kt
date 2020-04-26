package com.diki.idn.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val num1: Int by lazy { 469 }
    val num2: Int by lazy { 27 }
    val num3 : Int by lazy { 10000 }
    val substraction: Int by lazy { 469*27 - 10000 }
    val substraction2 :Int by lazy {469*27-10000-1000}

    lateinit var result : String
    lateinit var op: String
    lateinit var oup:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result =((469 * 27).toString())
        op = "$substraction"
        oup ="$substraction2"

        multiple.setText(result)
        subtraction.setText(op)
        abc.setText(oup)
    }
}
