package com.seriouspoke;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Personalitzem el caption
        //setTitle("Pokedex HOENN");

        cPokimon pokemon = (cPokimon) getIntent().getSerializableExtra("pokemon");

        TextView tvNumPokedex2 = (TextView)findViewById(R.id.tvNumPokedex2);
        tvNumPokedex2.setText(pokemon.getNumPokedex());

        TextView tvNombre2 = (TextView)findViewById(R.id.tvNombre2);
        tvNombre2.setText(pokemon.getNombre());

        TextView tvT1 = (TextView)findViewById(R.id.tvT1);
        tvT1.setText(pokemon.getTipo1());

        TextView tvT2 = (TextView)findViewById(R.id.tvT2);
        tvT2.setText(pokemon.getTipo2());

        TextView tvHabilidad = (TextView)findViewById(R.id.tvHabilidad);
        tvHabilidad.setText(pokemon.getHabilidad());

        TextView tvHabOculta = (TextView)findViewById(R.id.tvHabOculta);
        tvHabOculta.setText(pokemon.getHabOculta());

        TextView tvPeso = (TextView)findViewById(R.id.tvPeso);
        tvPeso.setText(pokemon.getPeso());

        TextView tvAltura = (TextView)findViewById(R.id.tvAltura);
        tvAltura.setText(pokemon.getAltura());

        TextView tvGeneroM = (TextView)findViewById(R.id.tvGeneroM);
        tvGeneroM.setText(pokemon.getGeneroM());

        TextView tvGeneroF = (TextView)findViewById(R.id.tvGeneroF);
        tvGeneroF.setText(pokemon.getGeneroF());

        TextView tvHabitat = (TextView)findViewById(R.id.tvHabitat);
        tvHabitat.setText(pokemon.getHabitat());

    }

}
