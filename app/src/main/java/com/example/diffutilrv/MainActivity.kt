package com.example.diffutilrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.diffutilrv.ui.FrgFirstCoinList
import com.example.diffutilrv.ui.FrgMain
import com.example.diffutilrv.ui.FrgSecondCoinList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment(FrgMain.newInstance())
    }

    fun showFragment(frg: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frmContainer, frg, frg.javaClass.name)
            .addToBackStack(frg.javaClass.name)
            .commit()
    }
}
