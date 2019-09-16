package com.example.diffutilrv.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diffutilrv.R
import com.example.diffutilrv.adapter.SecondRecyclerViewAdapter
import com.example.diffutilrv.utils.secondRV2018
import com.example.diffutilrv.utils.secondRV2019
import kotlinx.android.synthetic.main.frg_second_coin_list.*

class FrgSecondCoinList : Fragment() {

    lateinit var adapter : SecondRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frg_second_coin_list, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize(){

        adapter = SecondRecyclerViewAdapter(secondRV2018())
        secondRecyclerView.adapter = adapter
        secondRecyclerView.layoutManager = LinearLayoutManager(activity)


        textView2018.setOnClickListener { adapter.diffResult(secondRV2018())}
        textView2019.setOnClickListener {  adapter.diffResult(secondRV2019())}
    }

    companion object{

        @JvmStatic
        fun newInstance() : FrgSecondCoinList{
            return FrgSecondCoinList()
        }
    }
}
