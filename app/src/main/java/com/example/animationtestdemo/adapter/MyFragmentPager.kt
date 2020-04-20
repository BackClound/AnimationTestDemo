package com.example.animationtestdemo.adapter

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentTransaction

class MyFragmentPager(listFragment: MutableList<Fragment>, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val mListFragment: List<Fragment> = listFragment
    val fragmentManager: FragmentManager = fm
    var currentTransaction: FragmentTransaction? = null

    override fun getItem(position: Int): Fragment {
        return mListFragment.get(position)
    }

    override fun getCount(): Int {
        return mListFragment.size
    }

    override fun getItemPosition(`object`: Any): Int {
        return super.getItemPosition(`object`)
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun notifyDataSetChanged() {
        super.notifyDataSetChanged()
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return super.getPageTitle(position)
    }

    companion object {

    }

}