package com.example.counter61

class Injector {
    companion object{
        fun getPresenter() = Presenter()
        fun getModel() = CounterModel()
    }
}