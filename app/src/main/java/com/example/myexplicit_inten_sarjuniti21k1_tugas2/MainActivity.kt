package com.example.myexplicit_inten_sarjuniti21k1_tugas2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener{

    private lateinit var btnIntent : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btnPIndah)
        btnIntent.setOnClickListener(this)

    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btnPIndah -> run {
                val intentBiasa = Intent (this@MainActivity, NewActivity::class.java)
                startActivity(intentBiasa)

            }

        }

    }


}
