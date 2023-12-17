package com.massive_project_eduvion_mahasiswa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponse


class KonsultasiAdapter(
    private val KonsultasiList : List<DissertationsResponse>
): RecyclerView.Adapter<KonsultasiAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_consultation,
            parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return KonsultasiList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    val currentItem = KonsultasiList[position]
        holder.title.text = currentItem.title
        holder.chapter.text = currentItem.chapter
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var title:TextView = itemView.findViewById(R.id.title)
        var chapter:TextView = itemView.findViewById(R.id.chapter)
    }
}