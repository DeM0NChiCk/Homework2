package com.example.homework2.dogs

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.databinding.ItemDogBinding

class DogAdapter(
    private val list: List<Dog>,
    private val onItemClick: (Dog) -> Unit,
): RecyclerView.Adapter<DogHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DogHolder = DogHolder(
        ItemDogBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        )
    )


    override fun onBindViewHolder(holder: DogHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
    }

