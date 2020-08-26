package com.main.exercise_retrofit.container

import com.main.exercise_retrofit.artist.ArtistAPI
import com.main.exercise_retrofit.artist.ArtistRepository
import com.main.exercise_retrofit.artist.ArtistViewModel
import com.main.exercise_retrofit.config.RetrofitBuilder

class AppContainer{
//    private val artistAPI: ArtistAPI = RetrofitBuilder.createRetrofit().create((ArtistAPI::class.java))
//    private val artistRepository: ArtistRepository = ArtistRepository(artistAPI)
//    val artistViewModel: ArtistViewModel = ArtistViewModel(artistRepository)
//    val artistViewModelFactory: ArtistViewModelFactory = ArtistViewModelFactory(artistRepository)



}

//factory dibuat untuk dibuat berulang
//class ArtistViewModelFactory(val artistRepository: ArtistRepository): Factory<ArtistViewModel>{
//    override fun create(): ArtistViewModel {
//       return ArtistViewModel(artistRepository)
//    }
//
//}
//
//interface Factory<T>{
//    fun create(): T
//}