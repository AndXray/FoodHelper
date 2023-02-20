package com.example.diplom2.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diplom2.R
import com.example.diplom2.model.FoodModel
import kotlinx.android.synthetic.main.card_layout.view.*
import kotlinx.android.synthetic.main.fragment_add_food.view.*

class FoodAdapter: RecyclerView.Adapter<FoodAdapter.FoodViewHolder> (){
    class FoodViewHolder(view: View): RecyclerView.ViewHolder(view)

    var listFood = emptyList<FoodModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {

        holder.itemView.item_title.text = listFood[position].title
        holder.itemView.item_kalorii.text = listFood[position].kalorazh
        holder.itemView.item_belki.text = listFood[position].belki
        holder.itemView.item_jiri.text = listFood[position].jiri
        holder.itemView.item_uglevodi.text = listFood[position].uglevodi

    }

    override fun getItemCount(): Int {

        return listFood.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<FoodModel>){
        listFood = list
        notifyDataSetChanged()
    }
}