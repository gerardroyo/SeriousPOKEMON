package com.seriouspoke;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        /*AdaptadorPokemons2 adaptador = new AdaptadorPokemons2(this);
        Toolbar tb = findViewById(R.id.toolbar);
        tb.setBackgroundColor(Color.parseColor("#73C457"));*/
        //Toolbar tb = getLayoutInflater().inflate(R.layout.activity_info, null);

        //Toolbar tb = findViewById(R.id.tbInfo);
        //setSupportActionBar(findViewById(R.id.tbInfo));

        // Personalitzem el caption
        //setTitle("Pokedex HOENN");

        cPokimon pokemon = (cPokimon) getIntent().getSerializableExtra("pokemon");

        ConstraintLayout cl = (ConstraintLayout)findViewById(R.id.clInfo);

        setTitle(pokemon.getNombre());

        TextView tvNumPokedex2 = (TextView)findViewById(R.id.tvNumPokedex2);
        tvNumPokedex2.setText(pokemon.getNumPokedex());

        TextView tvT = (TextView)findViewById(R.id.tvT2);
        cambiarColores(pokemon.getTipo2(), tvT, cl, pokemon);

        tvT = (TextView)findViewById(R.id.tvT1);
        cambiarColores(pokemon.getTipo1(), tvT, cl, pokemon);

        /*TextView tvHabilidad = (TextView)findViewById(R.id.tvHabilidad);
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
        tvHabitat.setText(pokemon.getHabitat());*/

    }



    public void introduirTipoString(cPokimon pokemon, TextView tvT, String tipoString) {
        pokemon.setTipoS(tipoString);
        tvT.setText(pokemon.getTipoS());
    }

    public void cambiarColores(int tipo, TextView tvT, ConstraintLayout clInfo, cPokimon pokemon/*, Toolbar tb*/) {
        String tipoString = "";

        switch (tipo) {
            case 1:

                /*tb.setBackgroundColor(Color.parseColor("#73C457"));*/
                tvT.setBackgroundColor(Color.parseColor("#73C457"));
                clInfo.setBackgroundColor(Color.parseColor("#73C457"));
                tipoString = "Planta";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 2:

                clInfo.setBackgroundColor(Color.parseColor("#DF4E2F"));
                tipoString = "Fuego";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 3:

                clInfo.setBackgroundColor(Color.parseColor("#B95943"));
                tipoString = "Lucha";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 4:

                clInfo.setBackgroundColor(Color.parseColor("#329BFE"));
                tipoString = "Agua";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 6:

                clInfo.setBackgroundColor(Color.parseColor("#71584A"));
                tipoString = "Siniestro";
                introduirTipoString(pokemon, tvT, tipoString);


                break;
            case 7:

                clInfo.setBackgroundColor(Color.parseColor("#C2B4B2"));
                tipoString = "Normal";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 8:

                clInfo.setBackgroundColor(Color.parseColor("#A7B33B"));
                tipoString = "Bicho";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 5:

                clInfo.setBackgroundColor(Color.parseColor("#DEC054"));
                tipoString = "Tierra";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 9:

                clInfo.setBackgroundColor(Color.parseColor("#6A9BE8"));
                tipoString = "Volador";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 10:

                clInfo.setBackgroundColor(Color.parseColor("#884A7A"));
                tipoString = "Veneno";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 11:

                clInfo.setBackgroundColor(Color.parseColor("#D06B8D"));
                tipoString = "Psíquico";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 17:

                clInfo.setBackgroundColor(Color.parseColor("#5A5478"));
                tipoString = "Dragon";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 14:

                clInfo.setBackgroundColor(Color.parseColor("#BCAA63"));
                tipoString = "Roca";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 12:

                clInfo.setBackgroundColor(Color.parseColor("#FDABFD"));
                tipoString = "Hada";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 13:

                clInfo.setBackgroundColor(Color.parseColor("#6E6DAD"));
                tipoString = "Fantasma";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 16:

                clInfo.setBackgroundColor(Color.parseColor("#F4CB5C"));
                tipoString = "Eléctrico";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 18:

                clInfo.setBackgroundColor(Color.parseColor("#7EDAFD"));
                tipoString = "Hielo";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            case 15:

                clInfo.setBackgroundColor(Color.parseColor("#B2A8BC"));
                tipoString = "Acero";
                introduirTipoString(pokemon, tvT, tipoString);

                break;
            default:

                clInfo.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        }
    }

}
/*class AdaptadorPokemons2 extends ArrayAdapter<cPokimon> {

    private Context context;

    public AdaptadorPokemons2(Context context) {
        super(context, R.layout.toolbar);
        this.context = context;
    }
}*/
