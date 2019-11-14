package com.seriouspoke;

import android.content.Context;
import android.content.Intent;
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
import androidx.appcompat.app.ActionBar;

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
                    new cPokimon("022", "Seedot", "Planta", "")
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



    class AdaptadorPokemons extends ArrayAdapter<cPokimon> {

        private Context context;

        public AdaptadorPokemons(Context context, cPokimon[] datos) {
            super(context, R.layout.activity_mostrar_lista, datos);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            String hexColor;

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_mostrar_lista, null);

            cPokimon pokemon = (cPokimon) getItem(position);

            ImageView img = (ImageView) item.findViewById(R.id.imgPokemon);
            String nombre = pokemon.getNombre();
            String src = "@drawable/" + nombre;
            src = src.toLowerCase();
            img.setImageResource(getResources().getIdentifier(src,"drawable", getOpPackageName()));

            TextView tv = (TextView) item.findViewById(R.id.tvNumPokedex);
            tv.setText(pokemon.getNumPokedex());

            tv = (TextView) item.findViewById(R.id.tvNombre);
            tv.setText(pokemon.getNombre());

            tv = (TextView) item.findViewById(R.id.tvTipo1);
            hexColor = escollirColor(pokemon.getTipo1());
            tv.setBackgroundColor(Color.parseColor(hexColor));


            tv.setText(pokemon.getTipo1());

            tv = (TextView) item.findViewById(R.id.tvTipo2);
            hexColor = escollirColor(pokemon.getTipo2());
            tv.setBackgroundColor(Color.parseColor(hexColor));

            tv.setText(pokemon.getTipo2());
            return (item);
        }

        public String escollirColor(String tipo) {
            String hexColor = "";

            switch (tipo) {
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
                case "Siniestro":

                    hexColor = "#71584A";

                    break;
                case "Normal":

                    hexColor = "#C2B4B2";

                    break;
                case "Bicho":

                    hexColor = "#A7B33B";

                    break;
                case "Tierra":

                    hexColor = "#DEC054";

                    break;
                case "Volador":

                    hexColor = "#6A9BE8";

                    break;
                case "Veneno":

                    hexColor = "#884A7A";

                    break;
                case "Psiquico":

                    hexColor = "#D06B8D";

                    break;
                case "Dragon":

                    hexColor = "#5A5478";

                    break;
                case "Roca":

                    hexColor = "#BCAA63";

                    break;
                case "Hada":

                    hexColor = "#FDABFD";

                    break;
                case "Fantasma":

                    hexColor = "#6E6DAD";

                    break;
                case "Electrico":

                    hexColor = "#F4CB5C";

                    break;
                case "Hielo":

                    hexColor = "#7EDAFD";

                    break;
                case "Acero":

                    hexColor = "#B2A8BC";

                    break;
                default:

                    hexColor = "#FFF5F5F6";
            }

            return hexColor;
        }
    }
}
