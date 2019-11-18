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
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;

public class ListPrincipal extends AppCompatActivity {

    private LinearLayout linealTop;

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
                    new cPokimon("023", "Nuzleaf", "Planta", "Siniestro"),
                    new cPokimon("024", "Shiftry", "Planta", "Siniestro"),
                    new cPokimon("025", "Taillow", "Normal", "Volador"),
                    new cPokimon("026", "Swellow", "Normal", "Volador"),
                    new cPokimon("027", "Wingull", "Agua", "Volador"),
                    new cPokimon("028", "Pelipper", "Agua", "Volador"),
                    new cPokimon("029", "Ralts", "Psiquico", "Hada"),
                    new cPokimon("030", "Kirlia", "Psiquico", "Hada"),
                    new cPokimon("031", "Gardevoir", "Psiquico", "Hada"),
                    new cPokimon("032", "Gallade", "Psiquico", "Lucha"),
                    new cPokimon("033", "Surskit", "Bicho", "Agua"),
                    new cPokimon("034", "Masquerain", "Bicho", "Volador"),
                    new cPokimon("035", "Shroomish", "Planta", ""),
                    new cPokimon("036", "Breloom", "Planta", "Lucha"),
                    new cPokimon("037", "Slakoth", "Normal", ""),
                    new cPokimon("038", "Vigoroth", "Normal", ""),
                    new cPokimon("039", "Slaking", "Normaal", ""),
                    new cPokimon("040", "Abra", "Psiquico", ""),
                    new cPokimon("041", "Kadabra", "Psiquico", ""),
                    new cPokimon("042", "Alakazam", "Psiquico", ""),
                    new cPokimon("043", "Nincada", "Bicho", "Tierra"),
                    new cPokimon("044", "Ninjask", "Bicho", "Volador"),
                    new cPokimon("045", "Shedinja", "Bicho", "Fantasma"),
                    new cPokimon("046", "Whismur", "Normal", ""),
                    new cPokimon("047", "Loudred", "Normal", ""),
                    new cPokimon("048", "Exploud", "Normal", ""),
                    new cPokimon("049", "Makuhita", "Lucha", "Lucha"),
                    new cPokimon("050", "Hariyama", "Lucha", "Lucha"),
                    new cPokimon("051", "Goldeen", "Agua", ""),
                    new cPokimon("052", "Seaking", "Agua", ""),
                    new cPokimon("053", "Magikarp", "Agua", ""),
                    new cPokimon("054", "Gyarados", "Agua", "Volador"),
                    new cPokimon("055", "Azurill", "Normal", "Hada"),
                    new cPokimon("056", "Marill", "Agua", "Hada"),
                    new cPokimon("057", "Azumarill", "Agua", "Hada"),
                    new cPokimon("058", "Geodude", "Roca", "Tierra"),
                    new cPokimon("059", "Graveler", "Roca", "Tierra"),
                    new cPokimon("060", "Golem", "Roca", "Tierra"),
                    new cPokimon("061", "Nosepass", "Roca", ""),
                    new cPokimon("062", "Probopass", "Roca", "Acero"),
                    new cPokimon("063", "Skitty", "Normal", ""),
                    new cPokimon("064", "Delcatty", "Normal", ""),
                    new cPokimon("065", "Zubat", "Veneno", "Volador"),
                    new cPokimon("066", "Golbat", "Veneno", "Volador"),
                    new cPokimon("067", "Crobat", "Veneno", "Volador"),
                    new cPokimon("068", "Tentacool", "Agua", "Veneno"),
                    new cPokimon("069", "Tentacruel", "Agua", "Veneno"),
                    new cPokimon("070", "Sableye", "Siniestro", "Fantasma"),
                    new cPokimon("071", "Mawile", "Acero", "Hada"),
                    new cPokimon("072", "Aron", "Acero", "Roca"),
                    new cPokimon("073", "Lairon", "Acero", "Roca"),
                    new cPokimon("074", "Aggron", "Acero", "Roca"),
                    new cPokimon("075", "Machop", "Lucha", ""),
                    new cPokimon("076", "Machoke", "Lucha", ""),
                    new cPokimon("077", "Machamp", "Lucha", ""),
                    new cPokimon("078", "Meditite", "Lucha", "Psiquico"),
                    new cPokimon("079", "Medicham", "Lucha", "Psiquico"),
                    new cPokimon("080", "Electrike", "Electrico", ""),
                    new cPokimon("081", "Manectric", "Electrico", ""),
                    new cPokimon("082", "Plusle", "Electrico", ""),
                    new cPokimon("083", "Minun", "Electrico", ""),
                    new cPokimon("084", "Magnemite", "Electrico", "Acero"),
                    new cPokimon("085", "Magneton", "Electrico", "Acero"),
                    new cPokimon("086", "Voltorb", "Electrico", ""),
                    new cPokimon("087", "Electrode", "Electrico", ""),
                    new cPokimon("088", "Volbeat", "Bicho", ""),
                    new cPokimon("089", "Illumise", "Bicho", ""),
                    new cPokimon("090", "Oddish", "Planta", "Veneno"),
                    new cPokimon("091", "Gloom", "Planta", "Veneno"),
                    new cPokimon("092", "Vileplume", "Planta", "Veneno"),
                    new cPokimon("093", "Bellossom", "Planta", ""),
                    new cPokimon("094", "Doduo", "Normal", "Volador"),
                    new cPokimon("095", "Dodrio", "Normal", "Volador"),
                    new cPokimon("096", "Budew", "Planta", "Veneno"),
                    new cPokimon("097", "Roselia", "Planta", "Veneno"),
                    new cPokimon("098", "Roserade", "Planta", "Veneno"),
                    new cPokimon("099", "Gulpin", "Veneno", ""),
                    new cPokimon("100", "Swalot", "Veneno", ""),
                    new cPokimon("101", "Carvanha", "Agua", "Siniestro"),
                    new cPokimon("102", "Sharpedo", "Agua", "Siniestro"),
                    new cPokimon("103", "Wailmer", "Agua", ""),
                    new cPokimon("104", "Wailord", "Agua", ""),
                    new cPokimon("105", "Numel", "Fuego", "Tierra"),
                    new cPokimon("106", "Camerupt", "Fuego", "Tierra"),
                    new cPokimon("107", "Slugma", "Fuego", ""),
                    new cPokimon("108", "Magcargo", "Fuego", "Roca"),
                    new cPokimon("109", "Torkoal", "Fuego", ""),
                    new cPokimon("110", "Grimer", "Veneno", ""),
                    new cPokimon("111", "Muk", "Veneno", ""),
                    new cPokimon("112", "Koffing", "Veneno", ""),
                    new cPokimon("113", "Weezing", "Veneno", ""),
                    new cPokimon("114", "Spoink", "Psiquico", ""),
                    new cPokimon("115", "Grumpig", "Psiquico", ""),
                    new cPokimon("116", "Sandshrew", "Tierra", ""),
                    new cPokimon("117", "Sandslash", "Tierra", ""),
                    new cPokimon("118", "Spinda", "Normal", ""),
                    new cPokimon("119", "Skarmory", "Acero", "Volador"),
                    new cPokimon("120", "Trapinch", "Tierra", ""),
                    new cPokimon("121", "Vibrava", "Tierra", "Dragon"),
                    new cPokimon("123", "Flygon", "Tierra", "Dragon"),
                    new cPokimon("124", "Cacnea", "Planta", ""),
                    new cPokimon("125", "Cacturne", "Planta", "Siniestro"),
                    new cPokimon("126", "Swablu", "Normal", "Volador"),
                    new cPokimon("127", "Altaria", "Dragon", "Volador"),
                    new cPokimon("128", "Zangoose", "Normal", ""),
                    new cPokimon("129", "Seviper", "Veneno", ""),
                    new cPokimon("130", "Lunatone", "Roca", "Psiquico"),
                    new cPokimon("131", "Solrock", "Roca", "Psiquico"),
                    new cPokimon("132", "Barboach", "Agua", "Tierra"),
                    new cPokimon("133", "Whiscash", "Agua", "Tierra"),
                    new cPokimon("134", "Corphish", "Agua", ""),
                    new cPokimon("135", "Crawdaunt", "Agua", "Siniestro"),
                    new cPokimon("136", "Baltoy", "Tierra", "Psiquico"),
                    new cPokimon("137", "Claydol", "Tierra", "Psiquico"),
                    new cPokimon("138", "Lileep", "Roca", "Planta"),
                    new cPokimon("139", "Cradily", "Roca", "Planta"),
                    new cPokimon("140", "Anorith", "Roca", "Bicho"),
                    new cPokimon("141", "Armaldo", "Roca", "Bicho"),
                    new cPokimon("142", "Igglybuff", "Normal", "Hada"),
                    new cPokimon("143", "Jigglypuff", "Normal", "Hada"),
                    new cPokimon("144", "Wigglytuff", "Normal", "Hada"),
                    new cPokimon("145", "Feebas", "Agua", ""),
                    new cPokimon("146", "Milotic", "Agua", ""),
                    new cPokimon("147", "Castform", "Normal", ""),
                    new cPokimon("148", "Staryu", "Agua", ""),
                    new cPokimon("149", "Starmie", "Agua", "Psiquico"),
                    new cPokimon("150", "Kecleon", "Normal", ""),
                    new cPokimon("151", "Shuppet", "Fantasma", ""),
                    new cPokimon("152", "Banette", "Fantasma", ""),
                    new cPokimon("153", "Duskull", "Fantasma", ""),
                    new cPokimon("154", "Dusclops", "Fantasma", ""),
                    new cPokimon("155", "Dusknoir", "Fantasma", ""),
                    new cPokimon("156", "Tropius", "Planta", "Volador"),
                    new cPokimon("157", "Chingling", "Psiquico", ""),
                    new cPokimon("158", "Chimecho", "Psiquico", ""),
                    new cPokimon("159", "Absol", "Siniestro", ""),
                    new cPokimon("160", "Vulpix", "Fuego", ""),
                    new cPokimon("161", "Ninetales", "Fuego", ""),
                    new cPokimon("162", "Pichu", "Electrico", ""),
                    new cPokimon("163", "Pikachu", "Electrico", ""),
                    new cPokimon("164", "Raichu", "Electrico", ""),
                    new cPokimon("165", "Psyduck", "Agua", ""),
                    new cPokimon("166", "Golduck", "Agua", ""),
                    new cPokimon("167", "Wynaut", "Psiquico", ""),
                    new cPokimon("168", "Wobbuffet", "Psiquico", ""),
                    new cPokimon("169", "Natu", "Psiquico", "Volador"),
                    new cPokimon("170", "Xatu", "Psiquico", "Volador"),
                    new cPokimon("171", "Girafarig", "Normal", "Psiquico"),
                    new cPokimon("172", "Phanpy", "Tierra", ""),
                    new cPokimon("173", "Donphan", "Tierra", "Veneno"),
                    new cPokimon("174", "Pinsir", "Bicho", ""),
                    new cPokimon("175", "Heracross", "Bicho", "Lucha"),
                    new cPokimon("176", "Rhyhorn", "Tierra", "Roca"),
                    new cPokimon("177", "Rhydon", "Tierra", "Roca"),
                    new cPokimon("178", "Rhyperior", "Tierra", "Roca"),
                    new cPokimon("179", "Snorunt", "Hielo", ""),
                    new cPokimon("180", "Glalie", "Hielo", ""),
                    new cPokimon("181", "Froslass", "Hielo", "Fantasma"),
                    new cPokimon("182", "Spheal", "Hielo", "Agua"),
                    new cPokimon("183", "Sealeo", "Hielo", "Agua"),
                    new cPokimon("184", "Walrein", "Hielo", "Agua"),
                    new cPokimon("185", "Clamperl", "Agua", ""),
                    new cPokimon("186", "Huntail", "Agua", ""),
                    new cPokimon("187", "Gorebyss", "Agua", ""),
                    new cPokimon("188", "Relicanth", "Roca", "Agua"),
                    new cPokimon("189", "Corsola", "Roca", "Agua"),
                    new cPokimon("190", "Chinchou", "Agua", "Electrico"),
                    new cPokimon("191", "Lanturn", "Agua", "Electrico"),
                    new cPokimon("192", "Luvdisc", "Agua", ""),
                    new cPokimon("193", "Horsea", "Agua", "Volador"),
                    new cPokimon("194", "Seadra", "Bicho", ""),
                    new cPokimon("195", "Kingdra", "Agua", "Dragon"),
                    new cPokimon("196", "Bagon", "Dragon", ""),
                    new cPokimon("197", "Shelgon", "Dragon", ""),
                    new cPokimon("198", "Salamence", "Dragon", "Voladora"),
                    new cPokimon("199", "Beldum", "Acero", "Psiquico"),
                    new cPokimon("200", "Metang", "Acero", "Psiquico"),
                    new cPokimon("201", "Metagross", "Acero", "Psiquico"),
                    new cPokimon("202", "Regirock", "Roca", ""),
                    new cPokimon("203", "Regice", "Hielo", ""),
                    new cPokimon("204", "Registeel", "Acero", ""),
                    new cPokimon("205", "Latias", "Dragon", "Psiquico"),
                    new cPokimon("206", "Latios", "Dragon", "Psiquico"),
                    new cPokimon("207", "Kyogre", "Agua", ""),
                    new cPokimon("208", "Groudon", "Tierra", ""),
                    new cPokimon("209", "Rayquaza", "Dragon", "Volador"),
                    new cPokimon("210", "Jirachi", "Acero", "Psiquico"),
                    new cPokimon("211", "Deoxys", "Psiquico", "")
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_principal);

        // Personalitzem el caption
        setTitle("Pokedex HOENN");

        // Construim l'adaptador utilitzant un layout per defecte de Android.
        AdaptadorPokemons adaptador = new AdaptadorPokemons(this, Pokemons);

        // Assignem al listview l'adaptador creat
        ListView lst = (ListView)findViewById(R.id.listCustom);
        lst.setAdapter(adaptador);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                // Agafem l'objecte associat, en aquest cas l'objecte es un STRING
                cPokimon pokemon = (cPokimon) a.getItemAtPosition(position);

                Intent intent = new Intent(ListPrincipal.this, Info.class);

                intent.putExtra("numPokedex", pokemon.getNumPokedex());
                intent.putExtra("nombre", pokemon.getNombre());
                intent.putExtra("t1", pokemon.getTipo1());
                intent.putExtra("t2", pokemon.getTipo2());

                startActivity(intent);

            }
        });

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

                    hexColor = "#FFFFFFFF";
            }

            return hexColor;
        }
    }
}
