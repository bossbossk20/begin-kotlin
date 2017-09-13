package me.kody_koy.kotlin_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGo= findViewById(R.id.btnGo) as Button
        btnGo.setOnClickListener {
            val homePage = Intent(this@MainActivity, HomePage::class.java)
            startActivity(homePage)
//            finish()
        }
    }
}
