package com.example.firebase_141.repository

import com.example.firebase_141.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    //getALlmhs
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    //getMhs
    fun getMhs(nim: String): Flow<Mahasiswa> // Mengambil data mahasiswa berdasarkan NIM

    //deleteMhs
    suspend fun deleteMhs(mahasiswa: Mahasiswa) // Menghapus data mahasiswa

    //updateMhs
    suspend fun updateMhs(mahasiswa: Mahasiswa) // Memperbarui data mahasisiswa
}