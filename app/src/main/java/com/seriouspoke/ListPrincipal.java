package com.seriouspoke;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
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
                    new cPokimon("001", "Treecko", "Planta", ""),
                    new cPokimon("002", "Grovyle", "Planta", ""),
                    new cPokimon("003", "Sceptile", "Planta", ""),
                    new cPokimon("004", "Torchic", "Fuego", ""),
                    new cPokimon("005", "Combusken", "Fuego", "Lucha"),
                    new cPokimon("006", "Blaziken", "Fuego", "Lucha"),
                    new cPokimon("007", "Mudkip", "Agua", ""),
                    new cPokimon("008", "Marshtomp", "Agua", "Tierra"),
                    new cPokimon("009", "Swampert", "Agua", "Tierra"),
                    new cPokimon("010", "Poochyena", "Siniestro", ""),
                    new cPokimon("011", "Mightyena", "Siniestro", ""),
                    new cPokimon("012", "Zigzagoon", "Normal", ""),
                    new cPokimon("013", "Linoone", "Normal", ""),
                    new cPokimon("014", "Wurmple", "Bicho", ""),
                    new cPokimon("015", "Silcoon", "Bicho", ""),
                    new cPokimon("016", "Beautifly", "Bicho", "Volador"),
                    new cPokimon("017", "Cascoon", "Bicho", ""),
                    new cPokimon("018", "Dustox", "Bicho", "Veneno"),
                    new cPokimon("019", "Lotad", "Agua", "Planta"),
                    new cPokimon("020", "Lombre", "Agua", "Planta"),
                    new cPokimon("021", "Ludicolo", "Agua", "Planta"),
                    new cPokimon("022", "Seedot", "Planta", ""),
                    new cPokimon("023", "Swampert", "Agua", "Tierra"),
                    new cPokimon("024", "Swampert", "Agua", "Tierra"),
                    new cPokimon("025", "Swampert", "Agua", "Tierra"),
                    new cPokimon("026", "Swampert", "Agua", "Tierra"),
                    new cPokimon("027", "Swampert", "Agua", "Tierra"),
                    new cPokimon("028", "Swampert", "Agua", "Tierra"),
                    new cPokimon("029", "Swampert", "Agua", "Tierra"),
                    new cPokimon("030", "Swampert", "Agua", "Tierra"),
                    new cPokimon("031", "Swampert", "Agua", "Tierra"),
                    new cPokimon("032", "Swampert", "Agua", "Tierra"),
                    new cPokimon("033", "Swampert", "Agua", "Tierra"),
                    new cPokimon("034", "Swampert", "Agua", "Tierra"),
                    new cPokimon("035", "Swampert", "Agua", "Tierra")
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

        TextView tv = (TextView)item.findViewById(R.id.tvNumPokedex);
        tv.setText(pokemon.getNumPokedex());

        tv = (TextView)item.findViewById(R.id.tvNombre);
        tv.setText(pokemon.getNombre());

        ImageView img = (ImageView)item.findViewById(R.id.imgPokemon);

        switch (pokemon.getNombre()) {
            case "Treecko":
                img.setImageResource(R.drawable.treecko);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Sceptile":
                img.setImageResource(R.drawable.sceptile);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
            case "Grovyle":
                img.setImageResource(R.drawable.grovyle);
                break;
        }

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
