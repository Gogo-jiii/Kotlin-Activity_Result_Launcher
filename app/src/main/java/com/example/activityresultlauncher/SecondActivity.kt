package com.example.activityresultlauncher

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnGoBack.setOnClickListener {
            val intent = Intent()
            intent.putExtra("key", "IT wala")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}