package com.seriouspoke;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListPrincipal extends AppCompatActivity {

    private cPokimon[] Pokemons =
            new cPokimon[] {
                    new cPokimon("001", "Treecko", "Planta", ""),
                    new cPokimon("002", "Grovyle", "Planta", "")
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_principal);

        // Personalitzem el caption
        setTitle("Pokedex HOENN");

        // Mostrem el botó enrera que cal capturar en l'envent onOptionsItemSelected
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Construim l'adaptador utilitzant un layout per defecte de Android.
        AdaptadorPokemons adaptador = new AdaptadorPokemons(this, Pokemons);

        // Assignem al listview l'adaptador creat
        ListView lst = (ListView)findViewById(R.id.listCustom);
        lst.setAdapter(adaptador);

    }

}

class AdaptadorPokemons extends ArrayAdapter<cPokimon> {

    public AdaptadorPokemons(Context context, cPokimon[] datos) {
        super(context, R.layout.activity_lista_principal, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.activity_lista_principal, null);

        cPokimon pokemon = (cPokimon) getItem(position);

        TextView tv = (TextView)item.findViewById(R.id.tvNumPokedex);
        tv.setText(pokemon.getNumPokedex());

        item.findViewById(R.id.tvNombre);
        tv.setText(pokemon.getNombre());

        tv = (TextView)item.findViewById(R.id.tvTipo1);
        tv.setText(pokemon.getTipo1());

        tv = (TextView)item.findViewById(R.id.tvTipo2);
        tv.setText(pokemon.getTipo2());
        return(item);
    }
}
