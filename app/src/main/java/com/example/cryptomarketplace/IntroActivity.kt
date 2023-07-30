package com.example.cryptomarketplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
    }

    fun introButtonClick(view: View) {
        val intent: Intent = Intent(this@IntroActivity,LoginActivity::class.java)
        startActivity(intent)
    }
}