package com.main.exercise_retrofit.artist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.main.exercise_retrofit.config.RetrofitBuilder
import javax.inject.Inject

class ArtistViewModel @Inject constructor(val artistRepository:ArtistRepository){


//    val artistRepository:ArtistRepository
//
//
//    init {
//        val artistAPI = RetrofitBuilder.createRetrofit().create(ArtistAPI::class.java)
//        artistRepository = ArtistRepository(artistAPI)
//    }

    val artist : LiveData<Artist> = artistRepository.artist

    fun getArtist(nik: String){
        artistRepository.getArtist(nik)
    }

    fun saveArtist(artist: Artist){
        artistRepository.saveArtist(artist)
    }
}