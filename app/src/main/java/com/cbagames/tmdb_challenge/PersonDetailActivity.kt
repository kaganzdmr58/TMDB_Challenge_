package com.cbagames.tmdb_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.cbagames.tmdb_challenge.databinding.ActivityPersonDetailBinding
import com.squareup.picasso.Picasso
import org.json.JSONException
import org.json.JSONObject

class PersonDetailActivity : AppCompatActivity() {

    private lateinit var videosList:ArrayList<Videos>
    private lateinit var adapter: PersomMoviesAdapter

    private lateinit var videosTVList:ArrayList<Videos>
    private lateinit var adapterTV: PersonTvAdapter

    private lateinit var dataBinding: ActivityPersonDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_person_detail)

        val person = intent.getSerializableExtra("persoon") as Person  // changing to person
        dataBinding.personDetail = person


        Picasso.get()
            .load("https://image.tmdb.org/t/p/w500"+person?.profile_path)
            .into(dataBinding.ivPersonImage)
        Picasso.get()
            .load("https://image.tmdb.org/t/p/w500"+person?.profile_path)
            .into(dataBinding.ivBackground)

        Log.e("Personnamee",person.name)

        videoSend(person)
        getDataWithVolleyForByography(person.id.toString())
    }

    fun videoSend(pers :Person){
        videosList = ArrayList()
        videosList = pers.videoList

        adapter = PersomMoviesAdapter(this,videosList)
        dataBinding.personMovieAdapter = adapter

        adapterTV = PersonTvAdapter(this,videosList)
        dataBinding.personTVAdapter = adapterTV
    }

  fun getDataWithVolleyForByography(serarcWord:String){

        val url = "https://api.themoviedb.org/3/person/"+serarcWord+"?api_key=9eecc30ae89f253bce3cec4140734493"
        val req = StringRequest(Request.Method.GET,url, Response.Listener { responce ->

            try {
                val  jsonObj = JSONObject(responce)
                val biography = jsonObj.getString("biography")

                dataBinding.byography =biography

                Log.e("byography",biography)

            }catch (e: JSONException){

            }
        }, Response.ErrorListener { error -> Log.e("Hata",error.toString()) })

        Volley.newRequestQueue(this@PersonDetailActivity).add(req)
    }



}