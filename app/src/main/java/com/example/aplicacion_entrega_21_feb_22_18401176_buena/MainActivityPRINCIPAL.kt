package com.example.aplicacion_entrega_21_feb_22_18401176_buena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aplicacion_entrega_21_feb_22_18401176_buena.databinding.ActivityFullscreenBinding.inflate
import kotlinx.android.synthetic.main.activity_fullscreen.*
import kotlinx.android.synthetic.main.activity_main_principal.*

class MainActivityPRINCIPAL : AppCompatActivity() {

    private var _binding: MainActivityPRINCIPAL? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_principal)

        val bmapa = findViewById<Button>(R.id.conocenos)
        bmapa.setOnClickListener{
            val lanzar =Intent(this, MapsActivity::class.java)
            startActivity(lanzar)
        }

        val bnota = findViewById<Button>(R.id.nota)
        bnota.setOnClickListener{
            val lanzar2 =Intent(this, FullscreenActivity::class.java)
            startActivity(lanzar2)
        }
    }






}