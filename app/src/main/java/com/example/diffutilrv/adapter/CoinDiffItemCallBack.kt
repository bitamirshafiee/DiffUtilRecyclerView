package com.example.diffutilrv.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.diffutilrv.ui.Coin

class CoinDiffItemCallBack : DiffUtil.ItemCallback<Coin>(){
    override fun areItemsTheSame(oldItem: Coin, newItem: Coin): Boolean {
        return oldItem.coinId == newItem.coinId
    }

    override fun areContentsTheSame(oldItem: Coin, newItem: Coin): Boolean {
        return oldItem.coinName == oldItem.coinName
    }

}