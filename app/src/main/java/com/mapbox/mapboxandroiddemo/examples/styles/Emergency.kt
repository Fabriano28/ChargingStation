package com.mapbox.mapboxandroiddemo.examples.styles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener;
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.ImageButton

class Emergency : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)

        val home1 = findViewById(R.id.Home1) as ImageButton
        home1.setOnClickListener{
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        val workshop1 = findViewById(R.id.Workshop1) as ImageButton
        home1.setOnClickListener{
            val intent2 = Intent(this, Workshop::class.java)
            startActivity(intent2)
        }
    }

    fun call(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "123456789")
        startActivity(dialIntent)
    }


}