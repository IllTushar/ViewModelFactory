package com.example.viewmodeldemo2

import androidx.compose.runtime.internal.illegalDecoyCallException
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelfactorys(private val startCount:Int) :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       if (modelClass.isAssignableFrom(MainActivityModel::class.java)){
           return MainActivityModel(startCount) as T
       }
        return illegalDecoyCallException("Unkown class")
    }
}