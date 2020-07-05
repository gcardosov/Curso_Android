package com.example.ciclo_vida_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Imprime en consola en que momento pasamos por los metodos del ciclo de vida de una app
        Log.i("LOGCICLO ", "Entramos en método onCreate");
    }

    override fun onStart() {
        super.onStart()
        //Imprime en consola en que momento pasamos por los metodos del ciclo de vida de una app
        Log.i("LOGCICLO ", "Entramos en método onStart");
    }

    override fun onResume() {
        //Imprime en consola en que momento pasamos por los metodos del ciclo de vida de una app
        super.onResume()
        Log.i("LOGCICLO", "Entramos en método onResume");
    }

    override fun onPause() {
        //Imprime en consola en que momento pasamos por los metodos del ciclo de vida de una app
        super.onPause()
        Log.i("LOGCICLO", "Entramos en método onPause");
    }

    override fun onStop() {
        //Imprime en consola en que momento pasamos por los metodos del ciclo de vida de una app
        super.onStop()
        Log.i("LOGCICLO", "Entramos en método onStop");
    }

    override fun onDestroy() {
        //Imprime en consola en que momento pasamos por los metodos del ciclo de vida de una app
        super.onDestroy()
        Log.i("LOGCICLO", "Entramos en método onDestroy");
    }
}



