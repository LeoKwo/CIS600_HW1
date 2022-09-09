package com.example.hw1_ruikangguo

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.content.res.Configuration.ORIENTATION_PORTRAIT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.hw1_ruikangguo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var ivMainPic: ImageView
    private lateinit var btMainAction: Button
    private var orientation: Int = ORIENTATION_PORTRAIT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        ivMainPic = binding.ivMainPic
        btMainAction = binding.btMainAction
        orientation = resources.configuration.orientation
        if (orientation == ORIENTATION_LANDSCAPE) {
            ivMainPic.setImageResource(R.drawable.main_landscape)
        } else {
            ivMainPic.setImageResource(R.drawable.main_ruikang_guo)
        }

        btMainAction.setOnClickListener {
            Toast.makeText(this, "Button pressed", Toast.LENGTH_LONG).show()
        }

        setContentView(binding.root)
    }
}