package com.example.deni.layout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
    private val pages = listOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
            FourFragment()
    )
    override fun getItem(position: Int): Fragment {
        return pages[position] }
    override fun getCount(): Int{
        return pages.size }
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            2-> "Third Tab"
            else -> "Four Tab"

        }
        }
    }

