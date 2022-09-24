package com.example.exercise1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class intent_exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_exercise)
        Log.v("CREATED", "Activity sedang CREATED")

        val btnBrowser = findViewById<Button>(R.id.btn_browser)
        btnBrowser.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
        val btnCamera = findViewById<Button>(R.id.btn_camera)
        btnCamera.setOnClickListener{
            intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        val btnMaps = findViewById<Button>(R.id.btn_maps)
        btnMaps.setOnClickListener{
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-7.293131,112.781037")
            intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            startActivity(intent)
        }
        val btnWhatsApp = findViewById<Button>(R.id.btn_whatsapp)
        val inputTel = findViewById<EditText>(R.id.tf_phone)
        val inputMessage = findViewById<EditText>(R.id.tf_message)
        btnWhatsApp.setOnClickListener {
            val url = "whatsapp://send?phone=${inputTel.text}&text=${inputMessage.text}"
            Log.d("WHATSAPP", url)
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v("START", "Activity sedang START")
    }

    override fun onPause() {
        super.onPause()
        Log.v("PAUSE", "Activity sedang PAUSE")
    }

    override fun onResume() {
        super.onResume()
        Log.v("RESUME", "Activity sedang RESUME")
    }

    override fun onStop() {
        super.onStop()
        Log.v("STOP", "Activity sedang STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("DESTROY", "Activity sedang DESTROY")
    }
}