package com.example.viewmodeldemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var viewMode:MainActivityModel
    lateinit var viewModelFactory:ViewModelfactorys
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = ViewModelfactorys(123)
        viewMode = ViewModelProvider(this,viewModelFactory)[MainActivityModel::class.java]
        binding.sum.text = viewMode.getCount().toString()
        binding.click.setOnClickListener {
            viewMode.updateCount(binding.enterNumber.text.toString().toInt())
            binding.sum.text = viewMode.getCount().toString()
        }
    }
}