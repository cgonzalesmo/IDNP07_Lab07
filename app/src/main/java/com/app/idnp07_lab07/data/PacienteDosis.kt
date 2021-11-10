package com.app.idnp07_lab07.data

import androidx.room.Embedded
import androidx.room.Relation

data class PacienteDosis(
    @Embedded
    val paciente: Paciente,
    @Relation(
        parentColumn = "paciente_id",
        entityColumn = "pacienteCreatorId"
    )
    val dosis: List<Dosis>
)