package com.cbagames.tmdb_challenge

import android.content.Context
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cbagames.tmdb_challenge.databinding.DetailCastCardBinding
import com.cbagames.tmdb_challenge.databinding.DetailVideosCardBinding
import com.squareup.picasso.Picasso

class DetailVideosAdapter(val mContext: Context, val VideList:List<Videos> )
    : RecyclerView.Adapter<DetailVideosAdapter.CardHendeler>(){

    inner class CardHendeler(cardBinding: DetailVideosCardBinding)
        : RecyclerView.ViewHolder(cardBinding.root){
        var CardBinding: DetailVideosCardBinding
        init {
            this.CardBinding = cardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHendeler {
        val layoutInflater = LayoutInflater.from(mContext)
        val cardBinding = DetailVideosCardBinding.inflate(layoutInflater,parent,false)
        return CardHendeler(cardBinding)
    }

    override fun onBindViewHolder(holder: CardHendeler, position: Int) {
        val videoo = VideList.get(position)

        holder.CardBinding.detailVideosCard = videoo

        Picasso.get()
            .load("https://image.tmdb.org/t/p/w500"+videoo.poster_path)
            .into(holder.CardBinding.ivVideo)
    }

    override fun getItemCount(): Int {
        return VideList.size
    }
}