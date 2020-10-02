package com.conkermobile.to_do_list

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
    }

    private fun clickButton() {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}