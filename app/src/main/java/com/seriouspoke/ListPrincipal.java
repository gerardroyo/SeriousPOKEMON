package com.seriouspoke;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListPrincipal extends AppCompatActivity {

    private cPokimon[] Pokemons =
            new cPokimon[] {
                    new cPokimon("001", "Treecko", "Planta", "", "@drawable/img_pokemon/treecko"),
                    new cPokimon("002", "Grovyle", "Planta", "", "@drawable/img_pokemon/grovyle")
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
        super(context, R.layout.activity_mostrar_lista, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        String hexColor;

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.activity_mostrar_lista, null);

        cPokimon pokemon = (cPokimon) getItem(position);

        ImageView img = (ImageView)item.findViewById(R.id.imgPokemon);
        img.setImageResource(R.drawable.treecko);

        TextView tv = (TextView)item.findViewById(R.id.tvNumPokedex);
        tv.setText(pokemon.getNumPokedex());

        tv = (TextView)item.findViewById(R.id.tvNombre);
        tv.setText(pokemon.getNombre());

        tv = (TextView)item.findViewById(R.id.tvTipo1);
        hexColor = escollirColor(pokemon.getTipo1());
        tv.setBackgroundColor(Color.parseColor(hexColor));


        tv.setText(pokemon.getTipo1());

        tv = (TextView)item.findViewById(R.id.tvTipo2);
        hexColor = escollirColor(pokemon.getTipo2());
        tv.setBackgroundColor(Color.parseColor(hexColor));

        tv.setText(pokemon.getTipo2());
        return(item);
    }

    public String escollirColor(String tipo) {
        String hexColor = "";

        switch(tipo) {
            case "Planta":

                hexColor = "#73C457";

                break;
            case "Fuego":

                hexColor = "#DF4E2F";

                break;
            case "Lucha":

                hexColor = "#B95943";

                break;
            case "Agua":

                hexColor = "#329BFE";

                break;
            default:

                hexColor = "#E1E2E1";
        }

        return hexColor;
    }

}
