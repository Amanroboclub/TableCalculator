package com.rajaman.tablecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_table.*

class TableActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        val bundle = intent.extras
        val number = bundle!!.getInt("number")
        var table = ""
        for (i in 1..10){
            table += if (i == 10) {
                "$number x $i = ${number * i} \n"
            }else{
                "$number x $i   = ${number * i} \n"
            }
        }
        txv.text = table
    }
}
