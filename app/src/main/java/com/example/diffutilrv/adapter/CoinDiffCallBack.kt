package com.example.diffutilrv.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.diffutilrv.ui.Coin

class CoinDiffCallBack(private var oldList: List<Coin>, private var newList: List<Coin>) : DiffUtil.Callback(){

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].coinId == newList[newItemPosition].coinId
    }

    override fun getOldListSize() = oldList.size

    override fun getNewListSize()= newList.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].coinPrice == newList[newItemPosition].coinPrice
    }

}