package com.example.kyros.kotlinmultiplatformtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textviewMainDisplay.text = createApplicationScreenMessage()
    }
}
