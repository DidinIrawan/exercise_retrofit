package com.main.exercise_retrofit.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.main.exercise_retrofit.R
import com.main.exercise_retrofit.artist.Artist
import com.main.exercise_retrofit.artist.ArtistViewModel
import com.main.exercise_retrofit.container.AppContainer
import com.main.exercise_retrofit.container.MyApplication
import kotlinx.android.synthetic.main.fragment_create_artist.*
import javax.inject.Inject


class CreateArtistFragment : Fragment(), View.OnClickListener {
//    val artistViewModel by activityViewModels<ArtistViewModel>()
    @Inject lateinit var artistViewModel: ArtistViewModel
//    lateinit var appContainer: AppContainer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        appContainer = (activity?.application as MyApplication).appContainer
    (activity?.applicationContext as MyApplication).applicationComponent.inject(this)

}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_artist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        submitArtist.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            submitArtist -> {
                val artist = Artist(
                    nik = nikInput.text.toString(),
                    nama = namaInput.text.toString(),
                    jabatan = jabatanInput.text.toString(),
                    email = emailInput.text.toString()
                )
                    artistViewModel.saveArtist(artist)
            }
        }
    }
}