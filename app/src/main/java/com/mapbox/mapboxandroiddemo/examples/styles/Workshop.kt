package com.mapbox.mapboxandroiddemo.examples.styles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener;
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.ImageButton

class Workshop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)

        val home2 = findViewById(R.id.Home2) as ImageButton
        home2.setOnClickListener{
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

        val emergency2 = findViewById(R.id.Emergency2) as ImageButton
        emergency2.setOnClickListener{
            val intent2 = Intent(this, Workshop::class.java)
            startActivity(intent2)
        }
    }


}