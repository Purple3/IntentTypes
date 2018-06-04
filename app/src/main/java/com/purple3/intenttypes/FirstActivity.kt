package com.purple3.intenttypes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }

    fun nextActivity(view : View) {
        var nextActivityIntent = Intent(Intent.ACTION_SEND)
        //nextActivityIntent.action = "ACTION_SEND"
        nextActivityIntent.type = "text/plain"
        //if(nextActivityIntent.resolveActivity(packageManager) != null)
        startActivity(Intent.createChooser(nextActivityIntent, "Open Activity.."))
    }

    fun viewNextActivityExplicit(view : View) {
        var explicitIntent = Intent("com.purple3.intenttypespractice.MainActivity")
        //explicitIntent.type = "text/plain"
        startActivity(Intent.createChooser(explicitIntent, "Opening Activity.."))

    }
}
