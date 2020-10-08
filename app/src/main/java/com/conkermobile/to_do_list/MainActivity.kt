package com.conkermobile.to_do_list

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.conkermobile.to_do_list.DATA_ITEMS
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.conkermobile.to_do_list.util.Items

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<FloatingActionButton>(R.id.FloatingActionButton).setOnClickListener { _ ->
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}