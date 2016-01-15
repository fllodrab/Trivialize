package com.example.fllodrab.trivialize;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by FllodraB.
 */
public class Utilidad extends Application {
    private int respuesta = 0;

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void  onCreate() {
        super.onCreate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public int gertPuntuacion() {
        return respuesta;
    }

    public void setPuntuacion(int puntuacion) {
        respuesta = puntuacion;
    }
}
