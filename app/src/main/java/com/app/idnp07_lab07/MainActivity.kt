package com.app.idnp07_lab07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.app.idnp07_lab07.data.Dosis
import com.app.idnp07_lab07.data.Paciente
import com.app.idnp07_lab07.data.database
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pacienteList: List<Paciente> = arrayListOf(
            Paciente("Juan","Gonza","Moli", "73966540", "null"),
            Paciente("Carlos","Gonza","Moli", "76494244", "null"),
            Paciente("Jose","Gonza","Moli", "8354540", "null"),
            Paciente("Julio","Gonza","Moli", "79546540", "null")
        )

        val dosisList: List<Dosis> = arrayListOf(
            Dosis(true,"Paracetamol","null",1),
            Dosis(true,"Ibuprofeno","null",1),
            Dosis(true,"Doloflan","null",1)
        )

        val db = database(this)

        CoroutineScope(Dispatchers.Default).launch {
            db.detailDao().insertPaciente(pacienteList)
            db.detailDao().insertDosis(dosisList)

            val data = db.detailDao().getDosisByPaciente()
            val st = db.detailDao().getById(1)
            Log.i("TAG",st.toString())
        }





    }
}