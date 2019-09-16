package com.example.diffutilrv.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diffutilrv.MainActivity

import com.example.diffutilrv.R
import kotlinx.android.synthetic.main.frg_main.*

class FrgMain : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.frg_main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        submitListCardView.setOnClickListener { (activity as MainActivity).showFragment(FrgFirstCoinList.newInstance()) }
        diffUtilCardView.setOnClickListener { (activity as MainActivity).showFragment(FrgSecondCoinList.newInstance()) }
    }

    companion object{

        @JvmStatic
        fun newInstance() : FrgMain{
            return FrgMain()
        }
    }

}
