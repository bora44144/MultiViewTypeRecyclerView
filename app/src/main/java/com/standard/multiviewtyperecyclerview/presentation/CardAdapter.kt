package com.standard.multiviewtyperecyclerview.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.standard.multiviewtyperecyclerview.data.Card
import com.standard.multiviewtyperecyclerview.databinding.ItemBlueCardBinding
import com.standard.multiviewtyperecyclerview.databinding.ItemLightblueCardBinding
import com.standard.multiviewtyperecyclerview.databinding.ItemOrangeCardBinding

class CardAdapter(private val onClick: (Card) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var cardList = listOf<Card>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            MultiViewEnum.BLUE.viewType -> {
                val binding = ItemBlueCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                BlueTypeViewHolder(binding)
            }

            MultiViewEnum.LIGHTBLUE.viewType -> {
                val binding = ItemLightblueCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                LightblueTypeViewHolder(binding)
            }

            MultiViewEnum.ORANGE.viewType -> {
                val binding = ItemOrangeCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                OrangeTypeViewHolder(binding)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var currentItem = cardList[position]
        when (holder.itemViewType) {
            MultiViewEnum.BLUE.viewType -> {
                val blueHolder = holder as BlueTypeViewHolder
                blueHolder.bind(currentItem)

                holder.itemView.setOnClickListener {
                    onClick(currentItem)
                }
            }

            MultiViewEnum.LIGHTBLUE.viewType -> {
                val blueHolder = holder as LightblueTypeViewHolder
                blueHolder.bind(currentItem)

                holder.itemView.setOnClickListener {
                    onClick(currentItem)
                }
            }

            MultiViewEnum.ORANGE.viewType -> {
                val blueHolder = holder as OrangeTypeViewHolder
                blueHolder.bind(currentItem)

                holder.itemView.setOnClickListener {
                    onClick(currentItem)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> MultiViewEnum.BLUE.viewType
            1 -> MultiViewEnum.LIGHTBLUE.viewType
            2 -> MultiViewEnum.ORANGE.viewType
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    class BlueTypeViewHolder(private val binding: ItemBlueCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: Card) {
            binding.apply {
                tvUserName.text = card.userName
                tvCardNumber.text = card.cardNumber
                tvCardType.text = card.cardType
                tvPeriod.text = card.period
                tvBalance.text = card.balance.toString()
                tvCardManager.text = card.cardManager
            }
        }
    }

    class LightblueTypeViewHolder(private val binding: ItemLightblueCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: Card) {
            binding.apply {
                tvUserName.text = card.userName
                tvCardNumber.text = card.cardNumber
                tvCardType.text = card.cardType
                tvPeriod.text = card.period
                tvBalance.text = card.balance.toString()
                tvCardManager.text = card.cardManager
            }
        }
    }

    class OrangeTypeViewHolder(private val binding: ItemOrangeCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: Card) {
            binding.apply {
                tvUserName.text = card.userName
                tvCardNumber.text = card.cardNumber
                tvCardType.text = card.cardType
                tvPeriod.text = card.period
                tvBalance.text = card.balance.toString()
                tvCardManager.text = card.cardManager
            }
        }
    }
}