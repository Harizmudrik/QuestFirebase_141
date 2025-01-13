package com.example.firebase_141.ui.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.firebase_141.ui.viewmodel.FormErrorState
import com.example.firebase_141.ui.viewmodel.MahasiswaEvent


@Composable
fun FormMahasiswa (
    mahasiswaEvent: MahasiswaEvent = MahasiswaEvent(),
    onValueChange: (MahasiswaEvent) -> Unit,
    errorState: FormErrorState = FormErrorState(),
    modifier: Modifier = Modifier
){
    val gender = listOf("Laki-laki", "Perempuan")
    val kelas = listOf("A", "B", "C", "D", "E")
}