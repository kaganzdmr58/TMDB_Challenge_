package com.cbagames.tmdb_challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.cbagames.tmdb_challenge.databinding.ActivityMovieDetailBinding
import com.squareup.picasso.Picasso
import org.json.JSONException
import org.json.JSONObject

class DetailActivity : AppCompatActivity() {

    private lateinit var personList:ArrayList<Person>
    private lateinit var adapterPerson: DetailCastAdapter

    private lateinit var videosList:ArrayList<Videos>
    private lateinit var adapterVideos: DetailVideosAdapter

    private lateinit var dataBinding: ActivityMovieDetailBinding
    //private lateinit var dataBindingPerson:DetailCastCardBinding
    private lateinit var moviee:Movies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie_detail)
        dataBinding.movieDetailObject = this

        moviee =intent.getSerializableExtra("movieID") as Movies
        dataBinding.detailData = moviee
        dataBinding.raiting = moviee.vote_average.toFloat()
        Picasso.get()
            .load("https://image.tmdb.org/t/p/w500"+moviee?.poster_path)
            .into(dataBinding.ivPersonImage)
        Picasso.get()
            .load("https://image.tmdb.org/t/p/w500"+moviee?.poster_path)
            .into(dataBinding.ivBackground)


        getDataWithVolley()
        getDataWithVolley_Videos()


    }



    fun translate(moviee: Movies){
        val i = Intent(this@DetailActivity, PersonDetailActivity::class.java)
        i.putExtra("moviee",moviee)  // chaning to person
        startActivity(i)
    }


    fun getDataWithVolley(){
        val url = "https://api.themoviedb.org/3/person/popular?api_key=9eecc30ae89f253bce3cec4140734493"
        personList = ArrayList()
        val req = StringRequest(Request.Method.GET,url, Response.Listener { responce ->

            try {
                val  jsonObj = JSONObject(responce)
                val movies = jsonObj.getJSONArray("results")


                for (i in 0 until movies.length()){
                    val m = movies.getJSONObject(i)

                    val id = m.getInt("id")
                    val name = m.getString("name")
                    val profile_path = m.getString("profile_path")
                    val known_for_department = m.getString("known_for_department")

                    val known_for = m.getJSONArray("known_for")
                    var videoList:ArrayList<Videos> = ArrayList()
                    for (a in 0 until known_for.length()){
                        val v = known_for.getJSONObject(a)

                        val v_id = v.getInt("id")
                        val media_type = v.getString("media_type")
                        val v_poster_path = v.getString("poster_path")
                        var v_name = "name"
                        if (media_type == "tv"){
                            v_name =  v.getString("name")
                        }else if (media_type =="movie"){
                            v_name =  v.getString("title")
                        }

                        val video = Videos(v_id,v_name,v_poster_path,media_type)
                        videoList.add(video)
                    }


                    val per = Person(id,name, profile_path , known_for_department  ,"biography",videoList)
                    personList.add(per)

                }
                adapterPerson = DetailCastAdapter(this,personList)
                dataBinding.personCastDetailAdapter = adapterPerson
            }catch (e: JSONException){

            }
        }, Response.ErrorListener { error -> Log.e("Hata",error.toString()) })



        Volley.newRequestQueue(this@DetailActivity).add(req)
    }







    fun getDataWithVolley_Videos(){
        val url = "https://api.themoviedb.org/3/discover/movie?api_key=9eecc30ae89f253bce3cec4140734493"
        videosList = ArrayList()
        val req = StringRequest(Request.Method.GET,url, Response.Listener { responce ->


            try {
                val  jsonObj = JSONObject(responce)
                val movies = jsonObj.getJSONArray("results")

                for (i in 0 until movies.length()){
                    val m = movies.getJSONObject(i)

                    val id = m.getInt("id")
                    val name = m.getString("title")
                    val profile_path = m.getString("poster_path")

                    val vid = Videos(id,name, profile_path  ,"movie")
                    videosList.add(vid)
                    Log.e("Cevap","Video Lists : "+movies.toString())

                }

                adapterVideos = DetailVideosAdapter(this,videosList)
                dataBinding.videosDetailAdapter = adapterVideos
            }catch (e: JSONException){

            }
        }, Response.ErrorListener { error -> Log.e("Hata",error.toString()) })


        Log.e("Cevap","Video Lists : "+videosList.toString())

        Volley.newRequestQueue(this@DetailActivity).add(req)
    }



}