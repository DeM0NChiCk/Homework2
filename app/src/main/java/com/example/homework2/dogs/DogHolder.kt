package com.example.homework2.dogs

import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.databinding.ItemDogBinding

class DogHolder(
    private val binding: ItemDogBinding,
    private val onItemClick: (Dog) -> Unit,
) :RecyclerView.ViewHolder(binding.root) {

    fun onBind(dog: Dog){
        with(binding){
            itemDog.text = dog.bread
            bread.text = dog.full_dread
            root.setOnClickListener{
                onItemClick(dog)
            }
        }
    }
}