package com.cbagames.tmdb_challenge

import java.io.Serializable

data class Videos (val id : Int, val name:String, val poster_path:String, val media_type:String):Serializable {
}