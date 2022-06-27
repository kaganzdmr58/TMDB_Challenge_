package com.cbagames.tmdb_challenge

import java.io.Serializable

data class Movies(
    var id:Int,
    var title:String,
    var poster_path:String,
    var release_date:String,
    var vote_average: Double,
    var overview:String
    ) :Serializable{
}


