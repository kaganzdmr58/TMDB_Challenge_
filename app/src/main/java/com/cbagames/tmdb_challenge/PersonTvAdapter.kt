package com.cbagames.tmdb_challenge

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cbagames.tmdb_challenge.databinding.PersonMoviesCardBinding
import com.cbagames.tmdb_challenge.databinding.PersonTvCardBinding
import com.squareup.picasso.Picasso

class PersonTvAdapter (val mContext: Context, val videosList:List<Videos> )
    : RecyclerView.Adapter<PersonTvAdapter.CardHendeler>(){

        inner class CardHendeler(cardBinding: PersonTvCardBinding)
            : RecyclerView.ViewHolder(cardBinding.root){
            var CardBinding: PersonTvCardBinding
            init {
                this.CardBinding = cardBinding
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHendeler {
            val layoutInflater = LayoutInflater.from(mContext)
            val cardBinding = PersonTvCardBinding.inflate(layoutInflater,parent,false)
            return CardHendeler(cardBinding)    }



        override fun getItemCount(): Int {
            return videosList.size
        }

    override fun onBindViewHolder(holder: PersonTvAdapter.CardHendeler, position: Int) {
        val v = videosList.get(position)
        if (v.media_type=="tv"){
            holder.CardBinding.personTVCardVideo = v

            Picasso.get()
                .load("https://image.tmdb.org/t/p/w500"+v.poster_path)
                .into(holder.CardBinding.ivTVImage)
        }
    }

}