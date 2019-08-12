package com.example.modulo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            val myIntent = Intent(this, Class.forName("com.fielopolis.qrpay.pages.login.LoginActivity"))

            startActivity(myIntent)
            //startActivity(myIntent)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }
}
