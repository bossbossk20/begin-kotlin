package me.kody_koy.kotlin_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val goBtn = findViewById(R.id.btnBack) as Button
        goBtn.setOnClickListener {
          Log.d("test", "HomeHome")
            finish()
        }
    }
}
