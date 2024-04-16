package com.standard.multiviewtyperecyclerview.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.standard.multiviewtyperecyclerview.data.Card
import com.standard.multiviewtyperecyclerview.databinding.CardItem1Binding

class CardAdapter(val cardList: List<Card>) : RecyclerView.Adapter<CardAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.Holder {
        val binding = CardItem1Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: CardAdapter.Holder, position: Int) {
        holder.name.text = cardList[position].name
        holder.number.text = cardList[position].number
        holder.period.text = cardList[position].period
        holder.balance.text = cardList[position].balance
    }

    override fun getItemCount(): Int {
        return cardList.size
    }



    inner class Holder(val binding: CardItem1Binding) : RecyclerView.ViewHolder(binding.root) {
        val name = binding.name
        val number = binding.cardNumber
        val period = binding.period
        val balance = binding.balance
    }
}