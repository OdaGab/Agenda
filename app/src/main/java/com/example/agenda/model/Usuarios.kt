package com.example.agenda.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabela_usuarios")
data class Usuarios (
    @ColumnInfo(name = "nome") val name: String,
    @ColumnInfo(name = "sobrenome") val sobrenome: String,
    @ColumnInfo(name = "idade") val idade: String,
    @ColumnInfo(name = "celular") val celular: String
    //Tabelas ok
){
    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0
}