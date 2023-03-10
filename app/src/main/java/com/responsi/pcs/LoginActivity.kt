package com.responsi.pcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var recovery_button : TextView
    private lateinit var register_button : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button = findViewById(R.id.btnlogin)
        recovery_button = findViewById(R.id.btnforgot)
        register_button = findViewById(R.id.btnregister)

        button.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        recovery_button.setOnClickListener {
            val intent = Intent (this,RecoveryActivity::class.java)
            startActivity(intent)
        }
        register_button.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

    }

}