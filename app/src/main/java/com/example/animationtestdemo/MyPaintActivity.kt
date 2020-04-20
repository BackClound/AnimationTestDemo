package com.example.animationtestdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.animationtestdemo.adapter.MyFragmentPager
import com.example.animationtestdemo.fragment.MyPaintOneFrament
import com.example.animationtestdemo.fragment.MyPaintShaderFragment
import kotlinx.android.synthetic.main.activity_paint_layout.*

class MyPaintActivity : AppCompatActivity(){

    var myPaintAdapter: MyFragmentPager? = null
    val myFragmentList = mutableListOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paint_layout)
        val paintFragmentOne = MyPaintOneFrament()
        val paintLinearGradientOne = MyPaintShaderFragment()
        myFragmentList.add(paintFragmentOne)
        myFragmentList.add(paintLinearGradientOne)
        myPaintAdapter = MyFragmentPager(myFragmentList, this.supportFragmentManager)
        my_paint_viewpager.adapter = myPaintAdapter
        my_paint_viewpager.currentItem = 0

    }
}