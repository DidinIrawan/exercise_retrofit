package com.main.exercise_retrofit.artist

import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

//class ArtistRepository @Inject constructor(var artistAPI: ArtistAPI){
//    var artist: MutableLiveData<Artist> = MutableLiveData<Artist>()
//
//    fun getArtist(id: String){
////        artistAPI.getArtistByID(id).enqueue(object : Callback<Artist>{//enqueue mengntrikan sama seperti antrian coroutine
////
////            override fun onFailure(call: Call<Artist>, t: Throwable) {
////                println("Gagal Karena ${t.printStackTrace()}")
////            }
////
////            override fun onResponse(call: Call<Artist>, response: Response<Artist>) {
////                if(response.code()==200){
////                    val  response = response.body()
////                    artist.value = response
////                }
////                println("GAGAL ${response.code()}")
////            }
////        })
//        artistAPI.getArtistByID(id).enqueue(object : Callback<WrapperResponse>{//enqueue mengntrikan sama seperti antrian coroutine
//
//            override fun onFailure(call: Call<WrapperResponse>, t: Throwable) {
//                println("Gagal Karena ${t.printStackTrace()}")
//            }
//
//            override fun onResponse(call: Call<WrapperResponse>, response: Response<WrapperResponse>) {
//                if(response.code()==200){
//                    val  response = response.body()
//                    val gson = Gson()
//                    val result = gson.toJson(response?.result)
//                    val artistObject = gson.fromJson<Artist>(result,Artist::class.java)
//                    artist.value = artistObject
//                }
//                println("GAGAL ${response.code()}")
//            }
//        })
//    }
//    fun saveArtist(artist: Artist){
//        artistAPI.createArtist(artist).enqueue(object : Callback<Artist>{
//            override fun onFailure(call: Call<Artist>, t: Throwable) {
//                t.printStackTrace()
//            }
//
//            override fun onResponse(call: Call<Artist>, response: Response<Artist>) {
//                if(response.code() == 200){
//                    println("SUCCESS")
//                }
//            }
//        })
//    }
//}

class ArtistRepository @Inject constructor(){
    var artist: MutableLiveData<Artist> = MutableLiveData<Artist>()

    fun getArtist(id: String){
//        artistAPI.getArtistByID(id).enqueue(object : Callback<Artist>{//enqueue mengntrikan sama seperti antrian coroutine
//
//            override fun onFailure(call: Call<Artist>, t: Throwable) {
//                println("Gagal Karena ${t.printStackTrace()}")
//            }
//
//            override fun onResponse(call: Call<Artist>, response: Response<Artist>) {
//                if(response.code()==200){
//                    val  response = response.body()
//                    artist.value = response
//                }
//                println("GAGAL ${response.code()}")
//            }
//        })
//        artistAPI.getArtistByID(id).enqueue(object : Callback<WrapperResponse>{//enqueue mengntrikan sama seperti antrian coroutine
//
//            override fun onFailure(call: Call<WrapperResponse>, t: Throwable) {
//                println("Gagal Karena ${t.printStackTrace()}")
//            }
//
//            override fun onResponse(call: Call<WrapperResponse>, response: Response<WrapperResponse>) {
//                if(response.code()==200){
//                    val  response = response.body()
//                    val gson = Gson()
//                    val result = gson.toJson(response?.result)
//                    val artistObject = gson.fromJson<Artist>(result,Artist::class.java)
//                    artist.value = artistObject
//                }
//                println("GAGAL ${response.code()}")
//            }
//        })
    }
    fun saveArtist(artist: Artist){
//        artistAPI.createArtist(artist).enqueue(object : Callback<Artist>{
//            override fun onFailure(call: Call<Artist>, t: Throwable) {
//                t.printStackTrace()
//            }
//
//            override fun onResponse(call: Call<Artist>, response: Response<Artist>) {
//                if(response.code() == 200){
//                    println("SUCCESS")
//                }
//            }
//        })
    }
}