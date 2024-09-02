package com.example.myrelativelayout

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myrelativelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKatalog.setOnClickListener {
            val namaButton = binding.btnKatalog.text.toString()
            Toast.makeText(this, namaButton, Toast.LENGTH_SHORT).show()
        }

        binding.btnTersimpan.setOnClickListener {
            val namaButton = binding.btnTersimpan.text.toString()
            Toast.makeText(this, namaButton, Toast.LENGTH_SHORT).show()
        }

        binding.btnLaporan.setOnClickListener {
            val namaButton = binding.btnLaporan.text.toString()
            Toast.makeText(this, namaButton, Toast.LENGTH_SHORT).show()
        }

        binding.btnSetting.setOnClickListener {
            val namaButton = binding.btnSetting.text.toString()
            Toast.makeText(this, namaButton, Toast.LENGTH_SHORT).show()
        }

    }
}
