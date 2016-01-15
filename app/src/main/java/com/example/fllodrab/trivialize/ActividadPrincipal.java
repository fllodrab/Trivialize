package com.example.fllodrab.trivialize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActividadPrincipal extends AppCompatActivity {

    private TextView pregunta_inicial;
    private Button opcion_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        /* Recuperar el contexto para introducirle la pregunta */
        Utilidad mUtilidad = (Utilidad) getApplicationContext();
        this.pregunta_inicial = (TextView) this.findViewById(R.id.pregunta_inicial);
        this.opcion_1 = (Button) this.findViewById(R.id.buttonOpcion1);

    }
}
