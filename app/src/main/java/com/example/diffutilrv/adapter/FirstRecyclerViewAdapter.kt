package com.example.diffutilrv.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.diffutilrv.R
import com.example.diffutilrv.ui.Coin
import kotlinx.android.synthetic.main.item_first_list_coin.view.*

class FirstRecyclerViewAdapter : ListAdapter<Coin, FirstRecyclerViewAdapter.ViewHolder>(CoinDiffItemCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_first_list_coin, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(coin: Coin) {

            view.tvCoinName.text = coin.coinName
            view.tvCoinPrice.text = coin.coinPrice
        }
    }
}