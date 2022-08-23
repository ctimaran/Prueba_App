package edu.ctsoft.pruebaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.ctsoft.pruebaapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //val boton = findViewById<Button>(R.id.buttonOk)

        binding.buttonOk.setOnClickListener(){
            Toast.makeText( this, "Los quiero mucho",Toast.LENGTH_SHORT).show()
        }

        

    }



}

