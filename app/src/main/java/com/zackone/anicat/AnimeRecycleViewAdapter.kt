package com.zackone.anicat

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zackone.anicat.databinding.ItemAnimeBinding

class AnimeRecycleViewAdapter(private val animes: List<Anime>):
    RecyclerView.Adapter<AnimeRecycleViewAdapter.AnimeViewHolder>() {

    class AnimeViewHolder(private val binding: ItemAnimeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(anime: Anime) {
            binding.itemTvTitle.text = anime.title

            Glide.with(binding.root.context)
                .load(anime.image)
                .into(binding.itemIvCover)

            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val intent = Intent(binding.root.context, DetailActivity::class.java).apply {
                        putExtra("anime", anime)
                    }
                    binding.root.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimeViewHolder {
        val binding = ItemAnimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bind(animes[position])
    }

    override fun getItemCount(): Int {
        return animes.size
    }
}