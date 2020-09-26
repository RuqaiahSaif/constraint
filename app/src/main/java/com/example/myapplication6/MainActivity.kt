package com.example.myapplication6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       var toast = Toast.makeText(this, "hello world", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER_VERTICAL ,90,90 )
                toast.show()

        button.setOnClickListener {
            var toast = Toast.makeText(this, "hello world", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER_VERTICAL ,90,90 )
            toast.show()
        }
    }
}