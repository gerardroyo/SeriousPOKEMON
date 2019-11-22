package com.seriouspoke;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Game extends AppCompatActivity {

    private ArrayList<cPokimon> _pokemon;

    private static int properaLliurePokes = 0;
    private static int PokesUsed [] = new int [210];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ArrayList<cPokimon> pokemon = new ArrayList<cPokimon>(); getIntent().getSerializableExtra("pokemon");
        _pokemon = pokemon;

        ConstraintLayout cl = (ConstraintLayout)findViewById(R.id.clInfo);

        // deshabilita el titol
        getSupportActionBar().hide();

        // deshabilita la barra de notificacions
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setImg();

    }

    public void setImg() {

        ImageView img = (ImageView) findViewById(R.id.imageView);

            int pos = randomNoRepe();

            String nombre = _pokemon.get(pos).getNombre();
            String src = "@drawable/" + nombre;
            src = src.toLowerCase();
            img.setImageResource(getResources().getIdentifier(src,"drawable", getOpPackageName()));

    }

    public int randomNoRepe() {

        int numArrayAleatoriItems = 0;
        int comptador = 0;

        while (comptador != 210) {
            numArrayAleatoriItems = (int) (Math.random()*211+0);
            comptador = 0;
            for (int i = 0; i < PokesUsed.length; i++) {
                if (PokesUsed[i] != numArrayAleatoriItems) {
                    comptador++;
                }
            }
        }
        PokesUsed[properaLliurePokes] = numArrayAleatoriItems;
        properaLliurePokes++;


        return numArrayAleatoriItems;
    }

}
