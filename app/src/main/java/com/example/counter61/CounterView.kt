package com.example.counter61

interface CounterView {

    fun showCount(count: Int)

    fun changeVisible(isVisible: Boolean)

    fun showToast(context: String)

    fun changeColor()
}