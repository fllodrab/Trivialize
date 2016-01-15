package com.example.fllodrab.trivialize;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MenuActividad extends AppCompatActivity implements View.OnClickListener {
    private Button botonJugar;
    private Button botonEstadisticas;
    private Button botonAjustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_actividad);

        /* Botones de las vista del menú principal. */
        botonJugar = (Button) findViewById(R.id.buttonJugar);
        botonEstadisticas = (Button) findViewById(R.id.buttonEstadisticas);
        botonAjustes = (Button) findViewById(R.id.buttonAjustes);
        
        /* Manejadores de los botones del menú principal. */
        botonJugar.setOnClickListener(this);
        botonEstadisticas.setOnClickListener(this);
        botonAjustes.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonJugar) {
            this.startActivity(new Intent(MenuActividad.this, ActividadPrincipal.class));
        } else if (v.getId() == R.id.buttonEstadisticas) {
            this.startActivity(new Intent(MenuActividad.this, Resultados.class));
        } else if (v.getId() == R.id.buttonAjustes) {
            this.startActivity(new Intent(MenuActividad.this, Presentacion.class));
        }
    }
}
