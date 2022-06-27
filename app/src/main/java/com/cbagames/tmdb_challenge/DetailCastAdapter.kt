package com.cbagames.tmdb_challenge

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cbagames.tmdb_challenge.databinding.DetailCastCardBinding
import com.cbagames.tmdb_challenge.databinding.MovieCardBinding
import com.squareup.picasso.Picasso

class DetailCastAdapter (val mContext: Context, val personList:List<Person> )
    : RecyclerView.Adapter<DetailCastAdapter.CardHendeler>(){

    inner class CardHendeler(cardBinding: DetailCastCardBinding)
        : RecyclerView.ViewHolder(cardBinding.root){
        var CardBinding: DetailCastCardBinding
        init {
            this.CardBinding = cardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHendeler {
        val layoutInflater = LayoutInflater.from(mContext)
        val cardBinding = DetailCastCardBinding.inflate(layoutInflater,parent,false)
        return CardHendeler(cardBinding)
    }

    override fun onBindViewHolder(holder: CardHendeler, position: Int) {
        val person = personList.get(position)

        holder.CardBinding.detailCasdCard = person

        Picasso.get()
            .load("https://image.tmdb.org/t/p/w500"+person.profile_path)
            .into(holder.CardBinding.imageView)

        holder.CardBinding.textView.text = person.name

        holder.CardBinding.detailCastCard.setOnClickListener {
            translate(person)
        }
    }

    override fun getItemCount(): Int {
        return personList.size
    }


    fun translate(person: Person){
        val i = Intent(mContext, PersonDetailActivity::class.java)
        i.putExtra("persoon",person)  // chaning to person
        mContext.startActivity(i)
    }





}