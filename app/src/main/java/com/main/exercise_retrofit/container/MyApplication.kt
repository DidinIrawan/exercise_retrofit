package com.main.exercise_retrofit.container

import android.app.Application

class MyApplication : Application(){
//    manual inject
//    val appContainer: AppContainer = AppContainer()

    val applicationComponent:ApplicationComponent = DaggerApplicationComponent.create()
}