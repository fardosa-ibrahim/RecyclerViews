package com.example.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonaccinumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList= Addition(100)
        binding.rvNumber.layoutManager= LinearLayoutManager(this)
        binding.rvNumber.adapter =NameRecyclerViews(numberList)
        displayNumbers()
    }
    fun displayNumbers(){

    }
    fun Addition(size:Int):List<Int>{
        var list = ArrayList<Int>()
        var t1 = 1
        var t2 = 0
        var n = 0

        while (n <= size){
            print(t1)
            var sum =t1 + t2
            t1 = t2
            t2 = sum
            n++
            list +=sum
        }
        return list
    }

}