package com.zahideaksak.marvel.presentation.ui.marvel_character_detail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zahideaksak.marvel.databinding.ComicsCardBinding
import com.zahideaksak.marvel.domain.model.Comics

class ComicsAdapter : RecyclerView.Adapter<ComicsViewHolder>() {
    private var comicsList = emptyList<Comics>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicsViewHolder {
        val binding =
            ComicsCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ComicsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ComicsViewHolder, position: Int) {
        holder.bind(comicsList[position])
    }

    override fun getItemCount() = comicsList.size

    fun setData(newCharacterList: List<Comics>) {
        this.comicsList = newCharacterList
    }
}