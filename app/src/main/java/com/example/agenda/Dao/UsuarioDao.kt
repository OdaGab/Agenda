package com.example.agenda.Dao

import androidx.room.Dao
import androidx.room.Insert


@Dao
interface UsuarioDao {
    @Insert

    fun inserir(listaUsuario: MutableList<Usuario>)
}