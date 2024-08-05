package com.example.iolsa_siges;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class portadaActivity extends AppCompatActivity {
    // creamos una constante tipo entero para la duracion de la pantalla de bienvenida(splash_screen)
    private static final int DURACION_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);

        // handler=permite enviar y procesar mensajes y objetos Runnable
        // postdelayed =Es un método de Handler que ejecuta un Runnable después de un retraso especificado en milisegundos.

        new Handler().postDelayed(new Runnable(){
            @Override
            //metodo run que debe ser implementado cuando se crea un Runnable
        public void run() {
                // creamos un objeto que contiene los componentes a usar, osea las actividades
                Intent mainIntent= new Intent(portadaActivity.this,MainActivity.class);// contexto actual y contexto que se desea iniciar
                startActivity(mainIntent);// comienza la actividad
                finish(); // finaliza la actividad
            }
        },DURACION_SPLASH);

        }
    }
