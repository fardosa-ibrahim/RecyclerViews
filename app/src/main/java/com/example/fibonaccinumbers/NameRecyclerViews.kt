package com.example.fibonaccinumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameRecyclerViews(var numberList: List<Int>):
    RecyclerView.Adapter<NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.tvName.text= numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}

class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
}