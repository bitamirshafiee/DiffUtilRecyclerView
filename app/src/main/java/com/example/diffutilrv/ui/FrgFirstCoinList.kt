package com.example.diffutilrv.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.diffutilrv.R
import com.example.diffutilrv.adapter.FirstRecyclerViewAdapter
import com.example.diffutilrv.utils.firstRV2018
import com.example.diffutilrv.utils.firstRV2019
import kotlinx.android.synthetic.main.frg_first_coin_list.*

class FrgFirstCoinList : Fragment() {

    lateinit var adapter : FirstRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frg_first_coin_list, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize(){

        adapter = FirstRecyclerViewAdapter()
        firstRecyclerView.adapter = adapter
        firstRecyclerView.layoutManager = LinearLayoutManager(activity)

        adapter.submitList(firstRV2018())

        textView2018.setOnClickListener { adapter.submitList(firstRV2018()) }
        textView2019.setOnClickListener { adapter.submitList(firstRV2019()) }

    }

    companion object {

        @JvmStatic
        fun newInstance(): FrgFirstCoinList {
            return FrgFirstCoinList()
        }
    }

}
