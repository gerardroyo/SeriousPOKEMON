package com.seriouspoke;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
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
    private static int PokesUsed [] = new int [211];
    private Button btnSalir;
    private EditText edtNombre;
    private int puntuacionMaxima;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ArrayList<cPokimon> pokemon;
        pokemon = (ArrayList<cPokimon>)getIntent().getSerializableExtra("pokemon");
        _pokemon = pokemon;

        puntuacionMaxima = getIntent().getExtras().getInt("puntuacionMax");

        ConstraintLayout cl = (ConstraintLayout)findViewById(R.id.clInfo);

        // deshabilita el titol
        getSupportActionBar().hide();

        // deshabilita la barra de notificacions
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setImg(pokemon);

        TextView tvPM = (TextView)findViewById(R.id.tvPM);
        tvPM.setText(puntuacionMaxima);

        String puntuacionActual = "0";
        tvPM = (TextView)findViewById(R.id.tvPA);
        tvPM.setText(puntuacionActual);

        puntuacion(puntuacionMaxima);

        btnSalir = findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salir();
            }

        });

        btnSalir = findViewById(R.id.btnConfirmar);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmar();
            }

        });

    }

    public void confirmar(){
        String textUser;
        String nombrePoke;

        edtNombre = findViewById(R.id.edtNombre);
        textUser = edtNombre.getText().toString().toLowerCase();
        nombrePoke = _pokemon.get(pos).getNombre().toLowerCase();

        if(textUser.equals(nombrePoke)) {
            puntuacionMaxima++;
            setImg(_pokemon);
        }
    }

    public void salir() {

        Intent intent = new Intent();
        intent.putExtra("puntuacionMax", puntuacionMaxima);
        setResult(RESULT_OK, intent);
        finish();

    }

    public void puntuacion(int puntuacionMaxima) {

        TextView tvPM = (TextView)findViewById(R.id.tvPM);
        tvPM.setText(puntuacionMaxima);

    }

    public void setImg(ArrayList<cPokimon> pokemon) {

        ImageView img = (ImageView) findViewById(R.id.imageView);

            pos = randomNoRepe();

            String nombre = pokemon.get(pos).getNombre();
            //String nombre = "Treeco";
            String src = "@drawable/" + nombre;
            src = src.toLowerCase();
            img.setImageResource(getResources().getIdentifier(src,"drawable", getOpPackageName()));

    }

    public int randomNoRepe() {

        int numArrayAleatoriItems = 0;
        int comptador = 0;

        while (comptador != 211) {
            numArrayAleatoriItems = (int) (Math.random()*210+0);
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
