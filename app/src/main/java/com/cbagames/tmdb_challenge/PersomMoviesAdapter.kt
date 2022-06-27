package com.cbagames.tmdb_challenge

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cbagames.tmdb_challenge.databinding.PersonMoviesCardBinding
import com.squareup.picasso.Picasso

class PersomMoviesAdapter (val mContext: Context, val videosList:List<Videos> )
    : RecyclerView.Adapter<PersomMoviesAdapter.CardHendeler>(){


    inner class CardHendeler(cardBinding: PersonMoviesCardBinding)
        : RecyclerView.ViewHolder(cardBinding.root){
        var CardBinding: PersonMoviesCardBinding
        init {
            this.CardBinding = cardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHendeler {
        val layoutInflater = LayoutInflater.from(mContext)
        val cardBinding = PersonMoviesCardBinding.inflate(layoutInflater,parent,false)
        return CardHendeler(cardBinding)    }

    override fun onBindViewHolder(holder: CardHendeler, position: Int) {
        val v = videosList.get(position)
        if (v.media_type=="movie") {
            holder.CardBinding.personMovieCard = v

            Picasso.get()
                .load("https://image.tmdb.org/t/p/w500" + v.poster_path)
                .into(holder.CardBinding.ivPersonMovie)
        }
    }

    override fun getItemCount(): Int {
        return videosList.size
    }


}