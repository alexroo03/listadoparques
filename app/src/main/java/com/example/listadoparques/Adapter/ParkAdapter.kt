package com.example.listadoparques.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Park
import com.example.listadoparques.R


class ParkAdapter (private val parklist:List<Park>): RecyclerView.Adapter<ParkViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ParkViewHolder(layoutInflater.inflate(R.layout.item_park,parent,false))
    }


    override fun getItemCount(): Int {
        return parklist.size
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val item = parklist[position]
        holder.render(item)
    }

}