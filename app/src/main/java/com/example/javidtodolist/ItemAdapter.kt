package com.example.javidtodolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter (val dataSet : Array<String> ) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.CardTitle.text = dataSet[position]
        holder.view.setOnClickListener{
            Toast.makeText(holder.view.context,"You clicked on the task " + dataSet[position], Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val CardTitle:TextView = itemView.findViewById(R.id.cardTitle)
        val view = itemView
    }

}