package com.example.calendar

import android.app.Activity
import android.content.Intent
import android.content.res.Resources.Theme
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.calendar.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var databind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(com.example.calendar.Theme.currentTheme)
        databind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(databind.root)



    }
}