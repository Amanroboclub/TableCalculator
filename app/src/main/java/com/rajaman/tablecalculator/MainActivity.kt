package com.rajaman.tablecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val number = editText.text.toString().toInt()

            val intent = Intent(this, TableActivity::class.java)
            intent.putExtra("number", number)
            startActivity(intent)
        }
    }
}
