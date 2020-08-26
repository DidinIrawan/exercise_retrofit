package com.main.exercise_retrofit.container

import com.main.exercise_retrofit.activity.MainActivity
import com.main.exercise_retrofit.screens.ArtistFragment
import com.main.exercise_retrofit.screens.CreateArtistFragment
import dagger.Component

@Component
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(artistFragment: ArtistFragment)
    fun inject(createArtistFragment: CreateArtistFragment)
}