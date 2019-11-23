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
import java.util.Collections;

public class Game extends AppCompatActivity {

    private ArrayList<cPokimon> _pokemon;

    private Button btnSalir;
    private EditText edtNombre;
    private int puntuacionMaxima;
    private int puntuacionActual = 0;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ArrayList<cPokimon> pokemon;
        pokemon = (ArrayList<cPokimon>)getIntent().getSerializableExtra("pokemon");
        Collections.shuffle(pokemon);
        _pokemon = pokemon;

        puntuacionMaxima = getIntent().getExtras().getInt("puntuacionMax");

        // deshabilita el titol
        getSupportActionBar().hide();

        // deshabilita la barra de notificacions
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setImg(_pokemon);

        TextView tvPM = (TextView)findViewById(R.id.tvPM);
        tvPM.setText(Integer.toString(puntuacionMaxima));


        tvPM = (TextView)findViewById(R.id.tvPA);
        tvPM.setText(Integer.toString(puntuacionActual));

        puntuacion(puntuacionMaxima);

        btnSalir = findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean salir = true;
                salir(salir);
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
            edtNombre.setText("");
            snackBarCorrecto();
            puntuacionActual++;
            TextView tvPM = (TextView)findViewById(R.id.tvPM);
            tvPM = (TextView)findViewById(R.id.tvPA);
            tvPM.setText(Integer.toString(puntuacionActual));
            pos++;
            setImg(_pokemon);
        } else if (textUser.isEmpty()) {

            snackBarEmpty();

        } else {
            boolean salir = false;
            salir(salir);
        }
    }

    public void snackBarCorrecto(){
        View parentLayout = findViewById(android.R.id.content);
        Snackbar snack = Snackbar.make(parentLayout, "¡CORRECTO!", Snackbar.LENGTH_SHORT);

        // Cambiamos el color de fondo del snackbar.
        View sbv = snack.getView();
        sbv.setBackgroundColor(Color.parseColor("#1cc61c"));

        snack.show();
    }

    public void snackBarEmpty(){
        View parentLayout = findViewById(android.R.id.content);
        Snackbar snack = Snackbar.make(parentLayout, "¡No has escrito nada!", Snackbar.LENGTH_SHORT);

        // Cambiamos el color de fondo del snackbar.
        View sbv = snack.getView();
        sbv.setBackgroundColor(Color.parseColor("#0CB7F2"));

        snack.show();
    }

    public void salir(boolean salir) {

        Intent intent = new Intent();
        if(puntuacionMaxima < puntuacionActual) {
            puntuacionMaxima = puntuacionActual;
        }
        intent.putExtra("puntuacionMax", puntuacionMaxima);
        intent.putExtra("puntuacionPartida", puntuacionActual);
        intent.putExtra("nbPokemonFailed", _pokemon.get(pos).getNombre());
        intent.putExtra("salir", salir);
        setResult(RESULT_OK, intent);
        finish();

    }

    public void puntuacion(int puntuacionMaxima) {

        TextView tvPM = (TextView)findViewById(R.id.tvPM);
        tvPM.setText(Integer.toString(puntuacionMaxima));

    }

    public void setImg(ArrayList<cPokimon> pokemon) {

        ImageView img = (ImageView) findViewById(R.id.imageView);

            String nombre = pokemon.get(pos).getNombre();
            String src = "@drawable/" + nombre;
            src = src.toLowerCase();
            img.setImageResource(getResources().getIdentifier(src,"drawable", getOpPackageName()));
    }

}
