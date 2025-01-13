package com.example.firebase_141

import android.app.Application
import androidx.compose.ui.Modifier
import com.example.firebase_141.di.MahasiswaContainer

class MahasiswaApp : Application() {
    lateinit var containerApp: MahasiswaContainer //fungsinya untuk menyimpan instance
    override fun onCreate() {
        super.onCreate()
        containerApp = MahasiswaContainer(this)
        //instance adalah object yang di buat dari class
    }
}