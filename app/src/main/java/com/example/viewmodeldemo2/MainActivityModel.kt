package com.example.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityModel(startCount:Int) :ViewModel()
{
   private var count =0
  init {
    count= startCount
  }
  fun getCount():Int{
      return count
  }
    fun updateCount(input:Int){
        count +=input
    }
}