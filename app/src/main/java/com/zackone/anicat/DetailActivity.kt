package com.zackone.anicat

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.zackone.anicat.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val anime: Anime? = intent.getParcelableExtra("anime")

        anime?.let {
            binding.detailTvTitle.text = it.title
            binding.detailTvStudio.text = "Studio: ${it.studio}"
            binding.detailTvRelease.text = "Release: ${it.releaseYear} ${it.releaseSeason}"
            binding.detailTvSynopsis.text = it.synopsis
            Glide.with(this).load(it.image).into(binding.detailIvCover)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_share -> {
                shareAnimeDetails()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun shareAnimeDetails() {
        val anime = intent.getParcelableExtra<Anime>("anime")
        if (anime != null) {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Coba deh cek anime ini: ${anime.title}\n\n${anime.synopsis}")
                type = "text/plain"
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }
}