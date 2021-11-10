package com.app.idnp07_lab07.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "dosisTable")
data class Dosis(
    @ColumnInfo(name = "estado") val dosisEstado:Boolean,
    @ColumnInfo(name = "nombre") val dosisNombre:String,
    @ColumnInfo(name = "fecha") val dosisFecNac: String,
    val pacienteCreatorId: Int,
){
    @PrimaryKey(autoGenerate = true) var dosis_id=0
}