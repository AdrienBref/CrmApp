package com.dam.crmapp

import android.content.DialogInterface
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dam.crmapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), DialogInterface.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var configuration: Configuration
    private lateinit var buttonAceptar: Button
    private lateinit var textViewNombre: TextView
    private lateinit var textViewApellidos: TextView
    private lateinit var textViewEdad: TextView
    private lateinit var textViewCorreo: TextView
    private lateinit var spinnergenero: Spinner
    private lateinit var recyclerView: RecyclerView
    private lateinit var spinnerPuestoTrabajo: Spinner
    private lateinit var adapterGenero: ArrayAdapter<CharSequence>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuration = resources.configuration
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initvar()

    }

    fun initvar() {
        buttonAceptar = binding.setData
        textViewNombre = binding.nombreEditText
        textViewApellidos = binding.ApellidosEditText
        textViewEdad = binding.EdadEditText
        textViewCorreo = binding.CorreoEditText
        spinnergenero = binding.genderSpinner
        recyclerView = binding.recycleView
        spinnerPuestoTrabajo = binding.puestoDeTrabajo
    }

    fun crearAdapterSpinnerGenero() {
        adapterGenero = ArrayAdapter.createFromResource(
            this,
            R.array.genero,
            android.R.layout.simple_spinner_item)
    }

    override fun onClick(p0: DialogInterface?, p1: Int) {
        TODO("Not yet implemented")
    }
}