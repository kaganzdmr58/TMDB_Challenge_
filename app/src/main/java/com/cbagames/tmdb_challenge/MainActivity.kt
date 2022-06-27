package com.cbagames.tmdb_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.cbagames.tmdb_challenge.databinding.ActivityMainBinding
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {

    private lateinit var cardsList:ArrayList<Cards>
    public lateinit var movieList:ArrayList<Movies>
    private lateinit var adapter: MainActivityMoviesAdapter

    private lateinit var dataBinding:ActivityMainBinding

    private lateinit var searchWord:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        dataBinding.mainActivityObject = this

        dataBinding.toolbar.title = "Search"
        setSupportActionBar(dataBinding.toolbar)

        getDataWithVolleyMovie("/movie/popular","")


    }


    fun getDataWithVolleyMovie(category:String,query: String){
        val url = "https://api.themoviedb.org/3"+category+"?api_key=9eecc30ae89f253bce3cec4140734493"+query
        Log.e("URL",url)
        cardsList = ArrayList()
        movieList = ArrayList()
        val req = StringRequest(Request.Method.GET,url,Response.Listener { responce ->

            Log.e("Cevap",responce)

            try {
                val  jsonObj = JSONObject(responce)
                val movies = jsonObj.getJSONArray("results")

                Log.e("Cevap result",movies.toString())

                for (i in 0 until movies.length()){
                    val m = movies.getJSONObject(i)


                    /*
                    * "adult": false,
            "backdrop_path": "/wcKFYIiVDvRURrzglV9kGu7fpfY.jpg",
            "genre_ids": [            ],
            "id": 453395,
            "original_language": "en",
            "original_title": "Doctor Strange in the Multiverse of Madness",
            "overview": "Doctor Strange, with the help of mystical allies both old and new, traverses the mind-bending and dangerous alternate realities of the Multiverse to confront a mysterious new adversary.",
            "popularity": 14988.159,
            "poster_path": "/9Gtg2DzBhmYamXBS1hKAhiwbBKS.jpg",
            "release_date": "2022-05-04",
            "title": "Doctor Strange in the Multiverse of Madness",
            "video": false,
            "vote_average": 7.6,
            "vote_count": 3223*/

                    val id = m.getInt("id")
                    val title = m.getString("original_title")
                    val poster_path = m.getString("poster_path")
                    val overview = m.getString("overview")

                    val mov_release_date = m.getString("release_date")
                    var vote_avarage = m.getDouble("vote_average")


                    val movie = Cards(id,title,poster_path, overview)
                    cardsList.add(movie)

                    val per = Movies(id,title, poster_path , mov_release_date , vote_avarage ,overview)
                    movieList.add(per)
                }
                adapter = MainActivityMoviesAdapter(this,cardsList,movieList)
                dataBinding.moviesAdapter = adapter
            }catch (e: JSONException){

            }
        },Response.ErrorListener { error -> Log.e("Hata",error.toString()) })


        Log.e("Cevap",cardsList.toString())

        Volley.newRequestQueue(this@MainActivity).add(req)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_search,menu)

        val item = menu?.findItem(R.id.search)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        // burada olacak
        searchWord = query.toString()
        getDataWithVolleyMovie("/search/movie","&query="+query.toString())
        Log.e("KELİME 1",query.toString())
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        searchWord = newText.toString()
        searchMovieButton()
        getDataWithVolleyMovie("/search/movie","&query="+newText.toString())
        Log.e("KELİME 2",newText.toString())
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.search ->{
                dataBinding.ButtonsLayout.visibility = View.VISIBLE
                dataBinding.tvMostpopular.visibility = View.INVISIBLE

                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }



    fun searchMovieButton(){
        if(searchWord != null)
            getDataWithVolleyMovie("/search/movie","&query="+searchWord)
    }

    fun searchPersonButton(){
        if(searchWord != null)
            getDataWithVolleyPerson("&query="+searchWord)
    }


    fun searchTvButton(){
        if(searchWord != null)
            getDataWithVolleyTv("&query="+searchWord)

    }


    private fun getDataWithVolleyPerson( query: String) {
        val url = "https://api.themoviedb.org/3/search/person?api_key=9eecc30ae89f253bce3cec4140734493"+query
        Log.e("URL",url)
        cardsList = ArrayList()
        val req = StringRequest(Request.Method.GET,url,Response.Listener { responce ->

            Log.e("Cevap",responce)

            try {
                val  jsonObj = JSONObject(responce)
                val movies = jsonObj.getJSONArray("results")

                Log.e("Cevap result",movies.toString())

                for (i in 0 until movies.length()){
                    val m = movies.getJSONObject(i)


                    val id = m.getInt("id")
                    val title = m.getString("name")
                    val path = m.getString("profile_path")
                    val overview = m.getString("overview")

                    val movie = Cards(id,title,path,overview)
                    cardsList.add(movie)

                }
                adapter = MainActivityMoviesAdapter(this,cardsList,movieList)
                dataBinding.moviesAdapter = adapter
            }catch (e: JSONException){

            }
        },Response.ErrorListener { error -> Log.e("Hata",error.toString()) })


        Log.e("Cevap",cardsList.toString())

        Volley.newRequestQueue(this@MainActivity).add(req)
    }

    private fun getDataWithVolleyTv(query: String) {
        val url = "https://api.themoviedb.org/3/search/tv?api_key=9eecc30ae89f253bce3cec4140734493"+query
        Log.e("URL",url)
        cardsList = ArrayList()
        val req = StringRequest(Request.Method.GET,url,Response.Listener { responce ->

            Log.e("Cevap",responce)

            try {
                val  jsonObj = JSONObject(responce)
                val movies = jsonObj.getJSONArray("results")

                Log.e("Cevap result",movies.toString())

                for (i in 0 until movies.length()){
                    val m = movies.getJSONObject(i)


                    val id = m.getInt("id")
                    val title = m.getString("title")
                    val path = m.getString("poster_path")
                    val overview = m.getString("overview")

                    val movie = Cards(id,title,path,overview)
                    cardsList.add(movie)

                }
                adapter = MainActivityMoviesAdapter(this,cardsList,movieList)
                dataBinding.moviesAdapter = adapter
            }catch (e: JSONException){

            }
        },Response.ErrorListener { error -> Log.e("Hata",error.toString()) })


        Log.e("Cevap",cardsList.toString())

        Volley.newRequestQueue(this@MainActivity).add(req)
    }


    class translateByMovieObject(val pets: MutableList<Movies> = mutableListOf()){

    }

}