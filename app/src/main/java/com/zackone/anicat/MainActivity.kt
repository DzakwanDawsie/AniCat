package com.zackone.anicat

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.zackone.anicat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.mainFrame, HomeFragment())
            .commit()

        binding.mainBnv.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.mainFrame, HomeFragment())
                        .commit()
                    true
                }

                R.id.navigation_about -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.mainFrame, AboutFragment())
                        .commit()
                    true
                }

                else -> false
            }
        }
    }
}