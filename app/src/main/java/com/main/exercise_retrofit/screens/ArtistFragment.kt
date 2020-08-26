package com.main.exercise_retrofit.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.main.exercise_retrofit.R
import com.main.exercise_retrofit.artist.ArtistViewModel
import com.main.exercise_retrofit.container.AppContainer
import com.main.exercise_retrofit.container.MyApplication
import kotlinx.android.synthetic.main.fragment_artist.*
import javax.inject.Inject


class ArtistFragment : Fragment(), View.OnClickListener {
//    private val artistViewModel by activityViewModels<ArtistViewModel>()
    @Inject lateinit var artistViewModel: ArtistViewModel
//    lateinit var appContainer: AppContainer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        appContainer=(activity?.application as MyApplication).appContainer
        (activity?.applicationContext as MyApplication).applicationComponent.inject(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        artistViewModel.artist.observe(viewLifecycleOwner, Observer {
            artistNameText.text = it.nama
        })
        fetchButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            fetchButton -> getArtistByID()
        }
    }
    private fun getArtistByID(){
        artistViewModel.getArtist(artistIDInputText.text.toString())
    }
}