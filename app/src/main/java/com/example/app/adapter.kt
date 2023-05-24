package com.example.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// for portfolio view
class adapter(private val userlist: ArrayList<user>): RecyclerView.Adapter<adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int): adapter.MyViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.portfolio_card, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: adapter.MyViewHolder, position: Int){
        val user: user = userlist[position]
        holder.title_cur.text = user.title
        holder.desc_cur.text = user.desc
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    public class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val title_cur: TextView = itemView.findViewById(R.id.portfolioTitle)
        val desc_cur: TextView = itemView.findViewById(R.id.portfolioDesc)
    }
}