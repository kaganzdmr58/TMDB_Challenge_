package com.cbagames.tmdb_challenge

import android.content.Context
import android.content.Intent
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.cbagames.tmdb_challenge.databinding.MovieCardBinding
import com.squareup.picasso.Picasso

class MainActivityMoviesAdapter (val mContext: Context, val cardList:List<Cards>,val movieList:List<Movies> )
    :RecyclerView.Adapter<MainActivityMoviesAdapter.CardHendeler>(){

    inner class CardHendeler(movieCardBinding: MovieCardBinding)
        :RecyclerView.ViewHolder(movieCardBinding.root){
            var cardBinding:MovieCardBinding
            init {
                this.cardBinding = movieCardBinding
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHendeler {
        val layoutInflater = LayoutInflater.from(mContext)
        val moviewCardBinding = MovieCardBinding.inflate(layoutInflater,parent,false)
        return CardHendeler(moviewCardBinding)
    }

    override fun onBindViewHolder(holder: CardHendeler, position: Int) {
        val card =cardList.get(position)

        holder.cardBinding.movieCard = card

        holder.cardBinding.cardViewMovie.setOnClickListener {
            Toast.makeText(mContext,"Card tıklandı", Toast.LENGTH_SHORT).show()
            translate(movieList.get(position))
        }

        Picasso.get()
            .load("https://image.tmdb.org/t/p/w500"+card.path)
            .into(holder.cardBinding.imageViewPictures)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    fun translate(id:Movies){

        val i = Intent(mContext, DetailActivity::class.java)
        i.putExtra("movieID",id)
        mContext.startActivity(i)


    }
}