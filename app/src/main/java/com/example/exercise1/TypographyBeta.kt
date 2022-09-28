package com.example.exercise1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class TypographyBeta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_typography_beta)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.am_setting -> startActivity(Intent(Settings.ACTION_SETTINGS))
            R.id.am_exit -> startActivity(Intent(this, MainMenu::class.java))
            else -> Toast.makeText(this,"Action Unrecognizeable", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}