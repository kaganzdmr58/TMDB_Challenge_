package com.cbagames.tmdb_challenge

import java.io.Serializable

data class Person (
    var id:Int,
    var name : String,
    var profile_path:String,
    var known_for_department:String,
    var overview:String,
    var videoList :ArrayList<Videos>
    ) : Serializable {
}