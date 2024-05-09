package com.standard.multiviewtyperecyclerview.presentation.main.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.standard.multiviewtyperecyclerview.databinding.ItemBlueCardBinding
import com.standard.multiviewtyperecyclerview.databinding.ItemLightblueCardBinding
import com.standard.multiviewtyperecyclerview.databinding.ItemOrangeCardBinding
import com.standard.multiviewtyperecyclerview.databinding.UnknownItemBinding
import com.standard.multiviewtyperecyclerview.presentation.main.model.CardModel

class CardAdapter(private val onClick: (CardModel) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var cardModelList = listOf<CardModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val multiViewType = MultiViewEnum.entries.find { it.viewType == viewType }
        return when (multiViewType) {
            MultiViewEnum.BLUE -> {
                val binding = ItemBlueCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                BlueTypeViewHolder(binding)
            }

            MultiViewEnum.LIGHTBLUE -> {
                val binding = ItemLightblueCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                LightblueTypeViewHolder(binding)
            }

            MultiViewEnum.ORANGE -> {
                val binding = ItemOrangeCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                OrangeTypeViewHolder(binding)
            }

            else -> {
                val binding = UnknownItemBinding.inflate(LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                UnknownViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var currentItem = cardModelList[position]
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
        return cardModelList.size
    }

    override fun getItemViewType(position: Int): Int {
        return cardModelList[position].cardViewType.viewType
    }

    class BlueTypeViewHolder(private val binding: ItemBlueCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: CardModel) {
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
        fun bind(card: CardModel) {
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
        fun bind(card: CardModel) {
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

    class UnknownViewHolder(binding: UnknownItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() = Unit
    }
}