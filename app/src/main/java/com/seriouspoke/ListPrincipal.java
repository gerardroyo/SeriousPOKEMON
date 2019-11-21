package com.seriouspoke;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListPrincipal extends AppCompatActivity {

    private LinearLayout linealTop;

    private ArrayList<cPokimon> Pokemons = new ArrayList<cPokimon>();

    private AdaptadorPokemons adaptador;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_principal);

        Pokemons.clear();
        Pokemons.add(new cPokimon("001", "Treecko", 1, 0, "Espesura", "Liviano", "5 Kg", "0,5 m", "87,5%", "12,5%", "Bosque"));
        Pokemons.add(new cPokimon("002", "Grovyle", 1, 0, "Espesura", "Liviano", "21,6 Kg", "0,9 m", "87,5%", "12,5%", "Bosque"));
        Pokemons.add(new cPokimon("003", "Sceptile", 1, 0, "Espesura", "Liviano", "52,2 Kg", "1,7 m", "87,5%", "12,5%", "Bosque"));
        Pokemons.add(new cPokimon("004", "Torchic", 2, 0, "Mar llamas", "Impulso", "2,5 Kg", "0,4 m", "87,5%", "12,5%", "Pradera"));
        Pokemons.add(new cPokimon("005", "Combusken", 2, 3, "Mar llamas", "Impulso", "19,5 Kg", "0,9 m", "87,5%", "12,5%", "Pradera"));
        Pokemons.add(new cPokimon("006", "Blaziken", 2, 3, "Mar llamas", "Impulso", "52 Kg", "1,9 m", "87,5%", "12,5%", "Pradera"));
        Pokemons.add(new cPokimon("007", "Mudkip", 4, 0, "Torrente", "Humedad", "7,6 Kg", "0,4 m", "87,5%", "12,5%", "Agua dulce"));
        Pokemons.add(new cPokimon("008", "Marshtomp", 4, 5, "Torrente", "Humedad", "28 Kg", "0,7 m", "87,5%", "12,5%", "Agua dulce"));
        Pokemons.add(new cPokimon("009", "Swampert", 4, 5, "Torrente", "Humedad", "81,9 Kg" , "1,5 m", "87,5%", "12,5%", "Agua dulce"));
        Pokemons.add(new cPokimon("010", "Poochyena", 6, 0, "Fuga, Pies rápidos", "Cobardía", "13,6 Kg", "0,5 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("011", "Mightyena", 6, 0, "Intimidación, Pies rápidos", "Autoestima", "37 Kg", "1 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("012", "Zigzagoon", 7, 0, "Recogida, Gula", "Pies rápidos", "1,5 Kg", "0,4 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("013", "Linoone", 7, 0, "Recogida, Gula", "Pies rápidos", "32,5 Kg", "0,5 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("014", "Wurmple", 8, 0, "Polvo escudo", "Fuga", "3,6 Kg", "0,3 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("015", "Silcoon", 8, 0, "Mudar", "", "10 Kg", "0,6 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("016", "Beautifly", 8, 9, "Enjambre", "Rivalidad", "28,4 Kg", "1 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("017", "Cascoon", 8, 2, "Mudar", "", "11,5 Kg", "0,7 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("018", "Dustox", 8, 10, "Polvo escudo", "Ojocompuesto", "31,6 Kg", "1,2 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("019", "Lotad", 4, 1, "Cura lluvia, Nado rápido", "Ritmo propio", "2,6 Kg", "0,5 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("020", "Lombre", 4, 1, "Cura lluvia, Nado rápido", "Ritmo propio", "32,5 Kg", "1,2 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("021", "Ludicolo", 4, 1, "Cura lluvia, Nado rápido", "Ritmo propio", "55 Kg", "1,5 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("022", "Seedot", 1, 0, "Clorofila, Madrugar", "Hurto", "4 Kg", "0,5 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("023", "Nuzleaf", 1, 6, "Clorofila, Madrugar", "Hurto", "28 Kg", "1 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("024", "Shiftry", 1, 6, "Clorofila, Madrugar", "Hurto", "59,6 Kg", "1,3 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("025", "Taillow", 7, 9, "Agallas", "Intrépido", "2,3 Kg", "0,3 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("026", "Swellow", 7, 9, "Agallas", "Intrépido", "19,8 Kg", "0,7 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("027", "Wingull", 4, 9, "Vista lince, Hidratación", "Cura lluvia", "9,5 Kg", "0,6 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("028", "Pelipper", 4, 9, "Vista lince, Llovizna", "Cura lluvia", "28 Kg", "1,2 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("029", "Ralts", 11, 12, "Sincronía, Rastro", "Telepatía", "6,6 Kg", "0,4 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("030", "Kirlia", 11, 12, "Sincronía, Rastro", "Telepatía", "20,2 Kg", "0,8 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("031", "Gardevoir", 11, 12, "Sincronía, Rastro", "Telepatía", "48,4 Kg", "1,6 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("032", "Gallade", 11, 3, "Impasible", "Justiciero", "52 Kg", "1,6 m", "100%", "0%", ""));
        Pokemons.add(new cPokimon("033", "Surskit", 8, 4, "Nado rápido", "Cura lluvia", "1,7 Kg", "0,5 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("034", "Masquerain", 8, 9, "Intimidación", "Nerviosismo", "3,6 Kg", "0,8 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("035", "Shroomish", 1, 0, "Efecto espora, Antídoto", "Pies rápidos", "4,5 Kg", "0,4 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("036", "Breloom", 1, 3, "Efecto espora, Antídoto", "Experto", "39,2 Kg", "1,2 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("037", "Slakoth", 7, 0, "Ausente", "", "24 Kg", "0,8 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("038", "Vigoroth", 7, 0, "Espíritu vital", "", "46,5 Kg", "1,4 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("039", "Slaking", 7, 0, "Ausente", "", "130 Kg", "2 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("040", "Abra", 11, 0, "Sincronía, Foco interno", "Muro mágico", "19,5 Kg", "0,9 m", "75%", "25%", "Ciudad"));
        Pokemons.add(new cPokimon("041", "Kadabra", 11, 0, "Sincronía, Foco interno", "Muro mágico", "56,5 Kg", "1,3 m", "75%", "25%", "Ciudad"));
        Pokemons.add(new cPokimon("042", "Alakazam", 11, 0, "Sincronía, Foco interno", "Muro mágico", "48 Kg", "1,5 m", "75%", "25%", "Ciudad"));
        Pokemons.add(new cPokimon("043", "Nincada", 8, 5, "Ojocompuesto", "Fuga", "5,5 Kg", "0,5 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("044", "Ninjask", 8, 9, "Impulso", "Allanamiento", "12 Kg", "0,8 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("045", "Shedinja", 8, 13, "Superguarda", "", "1,2 Kg", "0,8 m", "Sin género", "", "Bosque"));
        Pokemons.add(new cPokimon("046", "Whismur", 7, 0, "Insonorizar", "Cobardía", "16,3 Kg", "0,6 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("047", "Loudred", 7, 0, "Insonorizar", "Intrépido", "40,5 Kg", "1 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("048", "Exploud", 7, 0, "Insonorizar", "Intrépido", "84 Kg", "1,5 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("049", "Makuhita", 3, 0, "Agallas, Sebo", "Potencia bruta", "86,4 Kg", "1 m", "75%", "25%", "Montaña"));
        Pokemons.add(new cPokimon("050", "Hariyama", 3, 0, "Agallas, Sebo", "Potencia bruta", "253,8 Kg", "2,3 m", "75%", "25%", "Montaña"));
        Pokemons.add(new cPokimon("051", "Goldeen", 4, 0, "Nado rápido, Velo agua", "Pararrayos", "15 Kg", "0,6 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("052", "Seaking", 4, 0, "Nado rápido, Velo agua", "Pararrayos", "39 Kg", "1,3 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("053", "Magikarp", 4, 0, "Nado rápido", "Cobardía", "10 Kg", "0,9 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("054", "Gyarados", 4, 9, "Intimidación", "Autoestima", "235 Kg", "6,5", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("055", "Azurill", 7, 12, "Potencia, Sebo", "Herbívoro", "2 Kg", "0,2 m", "25%", "75%", "Agua dulce"));
        Pokemons.add(new cPokimon("056", "Marill", 4, 12, "Potencia, Sebo", "Herbívoro", "8,5 Kg", "0,4 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("057", "Azumarill", 4, 12, "Potencia, Sebo", "Herbívoro", "28,5 Kg", "0,8 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("058", "Geodude", 14, 5, "Cabeza roca, Robustez", "Velo arena", "20 Kg", "0,4 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("059", "Graveler", 14, 5, "Cabeza roca, Robustez", "Velo arena", "105 Kg", "1 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("060", "Golem", 14, 5, "Cabeza roca, Robustez", "Velo arena", "300 Kg", "1,4 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("061", "Nosepass", 14, 0, "Imán, Robustez", "Poder arena", "97 Kg", "1 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("062", "Probopass", 14, 15, "Imán, Robustez", "Poder arena", "340 Kg", "1,4 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("063", "Skitty", 7, 0, "Gran encanto, Normalidad", "Piel milagro", "11 Kg", "0,6 m", "25%", "75%", "Bosque"));
        Pokemons.add(new cPokimon("064", "Delcatty", 7, 0, "Gran encanto, Normalidad", "Piel milagro", "32,6 Kg", "1,1 m", "25%", "75%", "Bosque"));
        Pokemons.add(new cPokimon("065", "Zubat", 10, 9, "Foco interno", "Allanamiento", "7,5 Kg", "0,8 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("066", "Golbat", 10, 9, "Foco interno", "Allanamiento", "55 Kg", "1,6 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("067", "Crobat", 10, 9, "Foco interno", "Allanamiento", "75 Kg", "1,8 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("068", "Tentacool", 4, 10, "Cuerpo puro, Lodo líquido", "Cura lluvia", "45,5 Kg", "0,9 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("069", "Tentacruel", 4, 10, "Cuerpo puro, Lodo líquido", "Cura lluvia", "55 Kg", "1,6 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("070", "Sableye", 6, 13, "Vista lince, Rezagado", "Bromista", "11 Kg", "0,5 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("071", "Mawile", 15, 12, "Intimidación. Corte fuerte", "Potencia bruta", "11,5 Kg", "0,6 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("072", "Aron", 15, 14, "Cabeza roca, Robustez", "Metal pesado", "60 Kg", "0,4 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("073", "Lairon", 15, 14, "Cabeza roca, Robustez", "Metal pesado", "120 Kg", "0,9 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("074", "Aggron", 15, 14, "Cabeza roca, Robustez", "Metal pesado", "360 Kg", "2,1 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("075", "Machop", 3, 0, "Agallas, Indefenso", "Impasible", "19,5 Kg", "0,8 m", "75%", "25%", "Montaña"));
        Pokemons.add(new cPokimon("076", "Machoke", 3, 0, "Agallas, Indefenso", "Impasible", "75,5 Kg", "1,5 m", "75%", "25%", "Montaña"));
        Pokemons.add(new cPokimon("077", "Machamp", 3, 0, "Agallas, Indefenso", "Impasible", "130 Kg", "1,6 m", "75%", "25%", "Montaña"));
        Pokemons.add(new cPokimon("078", "Meditite", 3, 11, "Energía pura", "Telepatía", "11.2 Kg", "0,6 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("079", "Medicham", 3, 11, "Energía pura", "Telepatía", "31,5 Kg", "1,3 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("080", "Electrike", 16, 0, "Elect. estát., Pararrayos", "Menos", "15,2 Kg", "0,6 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("081", "Manectric", 16, 0, "Elect. estát., Pararrayos", "Menos", "40,2 Kg", "1,5 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("082", "Plusle", 16, 0, "Más", "Pararrayos", "4,2 Kg", "0,4 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("083", "Minun", 16, 0, "Menos", "Absorbe electricidad", "4,2 Kg", "0,4 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("084", "Magnemite", 16, 15, "Imán, Robustez", "Cálculo final", "6 Kg", "0,3 m", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("085", "Magneton", 16, 15, "Imán, Robustez", "Cálculo final", "60 Kg", "1 m", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("086", "Voltorb", 16, 0, "Insonorizar, Elect. estát.", "Resquicio", "10,4 Kg", "0,5 m", "Sin género", "", "Ciudad"));
        Pokemons.add(new cPokimon("087", "Electrode", 16, 0, "Insonorizar, Elect. estát.", "Resquicio", "66,6 Kg", "1,2 m", "Sin género", "", "Ciudad"));
        Pokemons.add(new cPokimon("088", "Volbeat", 8, 0, "Enjambre, Iluminación", "Bromista", "17,7 Kg", "0,7 m", "100%", "0%", "Bosque"));
        Pokemons.add(new cPokimon("089", "Illumise", 8, 0, "Despiste, Cromolente", "Bromista", "17,7 Kg", "0,6 m", "0%", "100%", "Bosque"));
        Pokemons.add(new cPokimon("090", "Oddish", 1, 10, "Clorofila", "Fuga", "5,4 Kg", "0,5 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("091", "Gloom", 1, 10, "Clorofila", "Hedor", "8,6 Kg", "0,8 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("092", "Vileplume", 1, 10, "Clorofila", "Efec. espora", "18,6 Kg", "1,2 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("093", "Bellossom", 1, 0, "Clorofila", "Alma cura", "5,8 Kg", "0,4 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("094", "Doduo", 7, 9, "Fuga, Madrugar", "Tumbos", "39,2 Kg", "1,4 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("095", "Dodrio", 7, 9, "Fuga, Madrugar", "Tumbos", "85,2 Kg", "1,8 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("096", "Budew", 1, 10, "Cura natural, Punto tóxico", "Defensa hoja", "1,2 Kg", "0,2 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("097", "Roselia", 1, 10, "Cura natural, Punto tóxico", "Defensa hoja", "2 Kg", "0,3 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("098", "Roserade", 1, 10, "Cura natural, Punto tóxico", "Experto", "14,5 Kg", "0,9 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("099", "Gulpin", 10, 0, "Lodo líquido, Viscosidad", "Gula", "10,3 Kg", "0,4 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("100", "Swalot", 10, 0, "Lodo líquido, Viscosidad", "Gula", "80 Kg", "1,7 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("101", "Carvanha", 4, 6, "Piel tosca", "Impulso", "20,8 Kg", "0,8 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("102", "Sharpedo", 4, 6, "Piel tosca", "Impulso", "88,8 Kg", "1,8 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("103", "Wailmer", 4, 0, "Velo agua, Despiste", "Presión", "130 Kg", "2 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("104", "Wailord", 4, 0, "Velo agua, Despiste", "Presión", "398 Kg", "14,5 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("105", "Numel", 2, 5, "Despiste, Simple", "Ritmo propio", "24 Kg", "0,7 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("106", "Camerupt", 2, 5, "Escudo magma, Roca sólida", "Irascible", "220 Kg", "1,9 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("107", "Slugma", 2, 0, "Cuerpo llama, Escudo magma", "Armadura frágil", "30 Kg", "0,7 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("108", "Magcargo", 2, 14, "Cuerpo llama, Escudo magma", "Armadura frágil", "55 Kg", "0,8 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("109", "Torkoal", 2, 0, "Humo blanco, Sequía", "Caparazón", "80,4 Kg", "0,5 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("110", "Grimer", 10, 0, "Hedor, Viscosidad", "Toque tóxico", "30 Kg", "0,9 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("111", "Muk", 10, 0, "Hedor, Viscosidad", "Toque tóxico", "30 Kg", "1,2 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("112", "Koffing", 10, 0, "Levitación", "", "1 Kg", "0,6 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("113", "Weezing", 10, 0, "Levitación", "", "9,5 Kg", "1,2 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("114", "Spoink", 11, 0, "Ritmo propio, Sebo", "Gula", "30,6 Kg", "0,7 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("115", "Grumpig", 11, 0, "Ritmo propio, Sebo", "Gula", "71,5 Kg", "0,9 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("116", "Sandshrew", 5, 0, "Velo arena", "Ímpetu arena", "12 Kg", "0,6 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("117", "Sandslash", 5, 0, "Velo arena", "Ímpetu arena", "29,5 Kg", "1 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("118", "Spinda", 7, 0, "Ritmo propio, Tumbos", "Respondón", "5 Kg", "1,1 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("119", "Skarmory", 15, 9, "Robustez, Vista lince", "Armadura frágil", "50,5 Kg", "1,7 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("120", "Trapinch", 5, 0, "Corte fuerte, Trampa arena", "Potencia bruta", "15 Kg", "0,7 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("121", "Vibrava", 5, 17, "Levitación", "", "15,3 Kg", "1,1 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("123", "Flygon", 5, 17, "Levitación", "", "82 Kg", "2 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("124", "Cacnea", 1, 0, "Velo arena", "Absorbe agua", "51,3 Kg", "0,4 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("125", "Cacturne", 1, 6, "Velo arena", "Absorbe agua", "77,4 Kg", "1,3 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("126", "Swablu", 7, 9, "Cura natural", "Aclimatación", "1,2 Kg", "0,4 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("127", "Altaria", 17, 9, "Cura natural", "Aclimatación", "20,6 Kg", "1,1 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("128", "Zangoose", 7, 0, "Inmunidad", "Ímpetu tóxico", "40,3 Kg", "1,3 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("129", "Seviper", 10, 0, "Mudar", "Allanamiento", "52,5 Kg", "2,7 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("130", "Lunatone", 14, 11, "Levitación", "", "168 Kg", "1 m", "Sin género", "", "Caverna"));
        Pokemons.add(new cPokimon("131", "Solrock", 14, 11, "Levitación", "", "154 Kg", "1,2 m", "Sin género", "", "Caverna"));
        Pokemons.add(new cPokimon("132", "Barboach", 4, 5, "Despiste, Anticipación", "Hidratación", "1,9 Kg", "0,4 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("133", "Whiscash", 4, 5, "Despiste, Anticipación", "Hidratación", "23,6 Kg", "0,9 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("134", "Corphish", 4, 0, "Caparazón, Corte fuerte", "Adaptable", "11,5 Kg", "0,6 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("135", "Crawdaunt", 4, 6, "Caparazón, Corte fuerte", "Adaptable", "32,8 Kg", "1.1 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("136", "Baltoy", 5, 11, "Levitación", "", "21,5 Kg", "0,5 m", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("137", "Claydol", 5, 11, "Levitación", "", "108 Kg", "15 m", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("138", "Lileep", 14, 1, "Ventosas", "Colector", "23,8 Kg", "1 m", "87,5%", "12,5%", "Agua salada"));
        Pokemons.add(new cPokimon("139", "Cradily", 14, 1, "Ventosas", "Colector", "60,4 Kg", "1,5 m", "87,5%", "12,5%", "Agua salada"));
        Pokemons.add(new cPokimon("140", "Anorith", 14, 8, "Armad. bat.", "Nado rápido", "12,5 Kg", "0,7 m", "87,5%", "12,5%", "Agua dulce"));
        Pokemons.add(new cPokimon("141", "Armaldo", 14, 8, "Armad. bat.", "Nado rápido", "68,2 Kg", "1,5 m", "87,5%", "12,5%", "Agua dulce"));
        Pokemons.add(new cPokimon("142", "Igglybuff", 7, 12, "Gran encanto, Tenacidad", "Compiescolta", "1 Kg", "0,3 m", "25%", "75%", "Pradera"));
        Pokemons.add(new cPokimon("143", "Jigglypuff", 7, 12, "Gran encanto, Tenacidad", "Compiescolta", "5,5 Kg", "0,5 m", "25%", "75%", "Pradera "));
        Pokemons.add(new cPokimon("144", "Wigglytuff", 7, 12, "Gran encanto, Tenacidad", "Cacheo", "12 Kg", "1 m", "25%", "75%", "Pradera"));
        Pokemons.add(new cPokimon("145", "Feebas", 4, 0, "Nado rápido, Despiste", "Adaptable", "7,4 Kg", "0,6 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("146", "Milotic", 4, 0, "Escama especial, Tenacidad", "Gran encanto", "162 Kg", "6,2 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("147", "Castform", 7, 0, "Predicción", "", "0,8 Kg", "0,3 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("148", "Staryu", 4, 0, "Cura natural, Iluminación", "Cálculo final", "34,5 Kg", "0,8 m", "Sin género", "", "Agua salada"));
        Pokemons.add(new cPokimon("149", "Starmie", 4, 11, "Cura natural, Iluminación", "Cálculo final", "80 Kg", "1,1 m", "Sin género", "", "Agua salada"));
        Pokemons.add(new cPokimon("150", "Kecleon", 4, 0, "Cambio color", "Mutatipo", "22 Kg", "1 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("151", "Shuppet", 13, 0, "Insomnio, Cacheo", "Cuerpo maldito", "2,3 Kg", "0,6 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("152", "Banette", 13, 0, "Insomnio, Cacheo", "Cuerpo maldito", "12,5 Kg", "1,1 m", "50%", "50%", "Ciudad"));
        Pokemons.add(new cPokimon("153", "Duskull", 13, 0, "Levitación", "Cacheo", "15 Kg", "0,8 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("154", "Dusclops", 13, 0, "Presión", "Cacheo", "30,6 Kg", "1,6 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("155", "Dusknoir", 13, 0, "Presión", "Cacheo", "106,6 Kg", "2,2 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("156", "Tropius", 1, 9, "Clorofila, Poder solar", "Cosecha", "100 Kg", "2 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("157", "Chingling", 11, 0, "Levitación", "", "0,6 Kg", "0,2 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("158", "Chimecho", 11, 0, "Levitación", "", "1 Kg", "0,6 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("159", "Absol", 6, 0, "Presión, Afortunado", "Justiciero", "47 Kg", "1,2 m", "50%", "50%", "Montaña"));
        Pokemons.add(new cPokimon("160", "Vulpix", 2, 0, "Absorbe fuego", "Sequía", "9,9 Kg", "0,6 m", "25%", "75%", "Pradera"));
        Pokemons.add(new cPokimon("161", "Ninetales", 2, 0, "Absorbe fuego", "Sequía", "19,9 Kg", "1,1 m", "25%", "75%", "Pradera"));
        Pokemons.add( new cPokimon("162", "Pichu", 16, 0, "Electricidad estática", "Pararrayos", "2 Kg", "0,3 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("163", "Pikachu", 16, 0, "Electricidad estática", "Pararrayos", "6 Kg", "0,4 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("164", "Raichu", 16, 0, "Electricidad estática", "Pararrayos", "30 Kg", "0,8 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("165", "Psyduck", 4, 0, "Humedad, Aclimatación", "Nado rápido", "19,6 Kg", "0,8 m", "50%", "50%", "Agua dulce"));
        Pokemons.add(new cPokimon("166", "Golduck", 4, 0, "Humedad, Aclimatación", "Nado rápido", "76,6 Kg", "1,7 m", "50%", "50%", "Agua dulce "));
        Pokemons.add(new cPokimon("167", "Wynaut", 11, 0, "Sombra trampa", "Telepatía", "14 Kg", "0,6 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("168", "Wobbuffet", 11, 0, "Sombra trampa", "Telepatía", "28,5 Kg", "1,3 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("169", "Natu", 11, 9, "Madrugar", "Sincronía", "2 Kg", "0,2 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("170", "Xatu", 11, 9, "Madrugar, Sincronía", "Espejo mágico", "15 Kg", "1,5 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("171", "Girafarig", 7, 11, "Foco interno, Madrugar", "Herbívoro", "41,5 Kg", "1,5 m", "50%", "50%", "Pradera"));
        Pokemons.add(new cPokimon("172", "Phanpy", 5, 0, "Recogida", "Velo arena", "33,5 Kg", "0,5 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("173", "Donphan", 5, 10, "Robustez", "Velo arena", "120 Kg", "1,1 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("174", "Pinsir", 8, 0, "Corte fuerte, Rompemoldes", "Autoestima", "55 Kg", "1,5 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("175", "Heracross", 8, 3, "Enjambre, Agallas", "Autoestima", "54 Kg", "1,5 m", "50%", "50%", "Bosque"));
        Pokemons.add(new cPokimon("176", "Rhyhorn", 5, 14, "Pararrayos", "Cabeza roca", "115 Kg", "1 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("177", "Rhydon", 5, 14, "Pararrayos, Cabeza roca", "Audaz", "120 Kg", "1,9 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("178", "Rhyperior", 5, 14, "Pararrayos, Roca sólida", "Audaz", "282,8 Kg", "2,4 m", "50%", "50%", ""));
        Pokemons.add(new cPokimon("179", "Snorunt", 18, 0, "Foco interno, Gélido", "Veleta", "16,8 Kg", "0,7 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("180", "Glalie", 18, 0, "Foco interno, Gélido", "Veleta", "256,5 Kg", "1,5 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("181", "Froslass", 18, 13, "Manto níveo", "Cuerpo maldito", "26,6 Kg", "1,3 m", "0%", "100%", ""));
        Pokemons.add(new cPokimon("182", "Spheal", 18, 4, "Sebo, Gélido", "Despiste", "39,5 Kg", "0,8 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("183", "Sealeo", 18, 4, "Sebo, Gélido", "Despiste", "87,6 Kg", "1,1 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("184", "Walrein", 18, 4, "Sebo, Gélido", "Despiste", "150,6 Kg", "1,4 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("185", "Clamperl", 4, 0, "Caparazón", "Cobardía", "52,5 Kg", "0,4 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("186", "Huntail", 4, 0, "Nado rápido", "Velo agua", "27 Kg", "1,7 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("187", "Gorebyss", 4, 0, "Nado rápido", "Hidratación", "22,6 Kg", "1,8 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("188", "Relicanth", 14, 4, "Cabeza roca, Nado rápido", "Robustez", "23,4 Kg", "1 m", "87,5%", "12,5%", "Agua salada"));
        Pokemons.add(new cPokimon("189", "Corsola", 14, 4, "Cura natural, Entusiasmo", "Regeneración", "5 Kg", "0,6 m", "25%", "75%", "Agua salada"));
        Pokemons.add(new cPokimon("190", "Chinchou", 4, 16, "Absor. elec., Iluminación", "Absorbe agua", "12 Kg", "0,5 m", "57%", "43%", "Agua salada"));
        Pokemons.add(new cPokimon("191", "Lanturn", 4, 16, "Absor. elec., Iluminación", "Absorbe agua", "22,5 Kg", "1,2 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("192", "Luvdisc", 4, 16, "Nado rápido", "Hidratación", "8,7 Kg", "0,6 m", "25%", "75%", "Agua salada"));
        Pokemons.add(new cPokimon("193", "Horsea", 4, 9, "Nado rápido, Francotirador", "Humedad", "8 Kg", "0,4 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("194", "Seadra", 8, 0, "Punto tóxico, Francotirador", "Humedad", "25 Kg", "1,2 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("195", "Kingdra", 4, 17, "Nado rápido, Francotirador", "Humedad", "152 Kg", "1,8 m", "50%", "50%", "Agua salada"));
        Pokemons.add(new cPokimon("196", "Bagon", 17, 0, "Cabeza roca", "Potencia bruta", "42,1 Kg", "0,6 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("197", "Shelgon", 17, 0, "Cabeza roca", "Funda", "110,5 Kg", "1,1 m", "50%", "50%", "Caverna"));
        Pokemons.add(new cPokimon("198", "Salamence", 17, 9, "Intimidación", "Autoestima", "102,6 Kg", "1,5 m", "50%", "50%", "Campo"));
        Pokemons.add(new cPokimon("199", "Beldum", 15, 11, "Cuerpo puro", "Metal liviano", "95,2 Kg", "0,6 m,", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("200", "Metang", 15, 11, "Cuerpo puro", "Metal liviano", "202,5 Kg", "1,2 m", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("201", "Metagross", 15, 11, "Cuerpo puro", "Metal liviano", "550 Kg", "1,6 m", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("202", "Regirock", 14, 0, "Cuerpo puro", "Robustez", "230 Kg", "1,7 m", "Sin género", "", "Caverna"));
        Pokemons.add(new cPokimon("203", "Regice", 18, 0, "Cuerpo puro", "Gélido", "175 Kg", "1,8 m", "Sin género", "", "Caverna"));
        Pokemons.add(new cPokimon("204", "Registeel", 15, 0, "Cuerpo puro", "Metal liviano", "205 Kg", "1,9 m", "Sin género", "", "Caverna"));
        Pokemons.add(new cPokimon("205", "Latias", 17, 11, "Levitación", "", "40 Kg", "1,4 m", "0%", "100%", "Agua dulce"));
        Pokemons.add(new cPokimon("206", "Latios", 17, 11, "Levitación", "", "60 Kg", "2 m", "100%", "0%", "Agua dulce"));
        Pokemons.add(new cPokimon("207", "Kyogre", 4, 0, "Llovizna", "", "352 Kg", "4,5 m", "Sin género", "", "Agua salada"));
        Pokemons.add(new cPokimon("208", "Groudon", 5, 0, "Sequía", "", "950 Kg", "3,5 m", "Sin género", "", "Campo"));
        Pokemons.add(new cPokimon("209", "Rayquaza", 17, 9, "Bucle aire", "", "206,5 Kg", "7 m", "Sin género", "", "Raro"));
        Pokemons.add(new cPokimon("210", "Jirachi", 15, 11, "Dicha", "", "1,1 Kg", "0,3 m", "Sin género", "", ""));
        Pokemons.add(new cPokimon("211", "Deoxys", 11, 0, "Presión", "", "60,8 Kg", "1,7 m", "Sin género", "", "Raro"));

        // Personalitzem el caption
        setTitle("Pokedex HOENN");

        // Construim l'adaptador utilitzant un layout per defecte de Android.
        AdaptadorPokemons adaptador = new AdaptadorPokemons(this, Pokemons);

        // Assignem al listview l'adaptador creat

        ListView lst = (ListView)findViewById(R.id.listCustom);
        lst.setAdapter(adaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actionbar_listprincipal, menu);
        return true;
    }

    // Capturar pulsacions en el menú de la barra superior.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //ArrayList<cPokimon> pokeFiltro = new ArrayList<cPokimon>();
        ArrayList<cPokimon> pokeList = new ArrayList<cPokimon>();
        int tipo;


        switch (item.getItemId()) {
            // Respond to the action bar's Filtros
            case R.id.game:

                return true;
            case R.id.muTodos:

                return true;
            case R.id.muFav:

                return true;
            case R.id.muPlanta:

                tipo = 1;
                pokeList = filtros(tipo);
                AdaptadorPokemons adaptador = new AdaptadorPokemons(this, pokeList);

                return true;
            case R.id.muFuego:

                return true;
            case R.id.muLucha:

                return true;
            case R.id.muAgua:

                return true;
            case R.id.muSiniestro:

                return true;
            case R.id.muNormal:

                return true;
            case R.id.muBicho:

                return true;
            case R.id.muTierra:

                return true;
            case R.id.muVolador:

                return true;
            case R.id.muVeneno:

                return true;
            case R.id.muPsiquico:

                return true;
            case R.id.muDragon:

                return true;
            case R.id.muRoca:

                return true;
            case R.id.muHada:

                return true;
            case R.id.muFantasma:

                return true;
            case R.id.muElectr:

                return true;
            case R.id.muHielo:

                return true;
            case R.id.muAcero:

                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public ArrayList<cPokimon> filtros(int tipo) {
        ArrayList<cPokimon> pokeList = new ArrayList<cPokimon>();

        for(int i = 0; i < Pokemons.length; i++) {
            if(Pokemons[i].getTipo1() == tipo || Pokemons[i].getTipo2() == tipo) {
                pokeList.add(Pokemons[i]);
            }
        }

        return pokeList;
    }

    class AdaptadorPokemons extends ArrayAdapter<cPokimon> {

        private Context context;

        public AdaptadorPokemons(Context context, ArrayList<cPokimon> datos) {
            super(context, R.layout.activity_mostrar_lista, datos);
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            String hexColor;

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_mostrar_lista, null);

            final cPokimon pokemon = (cPokimon) getItem(position);

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
            escojerColor(pokemon.getTipo1(), item, tv, pokemon);

            tv = (TextView) item.findViewById(R.id.tvTipo2);
            escojerColor(pokemon.getTipo2(), item, tv, pokemon);

            item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cPokimon pokemon = (cPokimon) a.getItemAtPosition(position);

                Intent intent = new Intent(ListPrincipal.this, Info.class);

                intent.putExtra("pokemon", pokemon);

                context.startActivity(intent);
            }
            });

            return (item);
        }
    }
    public void introducirTiposString(cPokimon pokemon, TextView tv, String tipo) {
        pokemon.setTipoS(tipo);
        tv.setText(pokemon.getTipoS());
    }

    public void escojerColor(int tipo, View item, TextView tv, cPokimon pokemon) {
        String tipoString = "";

        switch (tipo) {
            case 1:

                tv.setBackgroundColor(Color.parseColor("#73C457"));
                tipoString = "Planta";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 2:

                tv.setBackgroundColor(Color.parseColor("#DF4E2F"));
                tipoString = "Fuego";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 3:

                tv.setBackgroundColor(Color.parseColor("#B95943"));
                tipoString = "Lucha";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 4:

                tv.setBackgroundColor(Color.parseColor("#329BFE"));
                tipoString = "Agua";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 6:

                tv.setBackgroundColor(Color.parseColor("#71584A"));
                tipoString = "Siniestro";
                introducirTiposString(pokemon, tv, tipoString);

                tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                break;
            case 7:

                tv.setBackgroundColor(Color.parseColor("#C2B4B2"));
                tipoString = "Normal";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 8:

                tv.setBackgroundColor(Color.parseColor("#A7B33B"));
                tipoString = "Bicho";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 5:

                tv.setBackgroundColor(Color.parseColor("#DEC054"));
                tipoString = "Tierra";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 9:

                tv.setBackgroundColor(Color.parseColor("#6A9BE8"));
                tipoString = "Volador";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 10:

                tv.setBackgroundColor(Color.parseColor("#884A7A"));
                tipoString = "Veneno";
                introducirTiposString(pokemon, tv, tipoString);

                tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                break;
            case 11:

                tv.setBackgroundColor(Color.parseColor("#D06B8D"));
                tipoString = "Psíquico";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 17:

                tv.setBackgroundColor(Color.parseColor("#5A5478"));
                tipoString = "Dragon";
                introducirTiposString(pokemon, tv, tipoString);

                tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                break;
            case 14:

                tv.setBackgroundColor(Color.parseColor("#BCAA63"));
                tipoString = "Roca";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 12:

                tv.setBackgroundColor(Color.parseColor("#FDABFD"));
                tipoString = "Hada";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 13:

                tv.setBackgroundColor(Color.parseColor("#6E6DAD"));
                tipoString = "Fantasma";
                introducirTiposString(pokemon, tv, tipoString);

                tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                break;
            case 16:

                tv.setBackgroundColor(Color.parseColor("#F4CB5C"));
                tipoString = "Eléctrico";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 18:

                tv.setBackgroundColor(Color.parseColor("#7EDAFD"));
                tipoString = "Hielo";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            case 15:

                tv.setBackgroundColor(Color.parseColor("#B2A8BC"));
                tipoString = "Acero";
                introducirTiposString(pokemon, tv, tipoString);

                break;
            default:

                tv.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
        }
    }
}
