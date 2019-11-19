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
                    new cPokimon("001", "Treecko", "Planta", "", "Espesura", "Liviano", 5, 0.5, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("002", "Grovyle", "Planta", "", "Espesura", "Liviano", 21.6, 0.9, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("003", "Sceptile", "Planta", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("004", "Torchic", "Fuego", "", "Mar llamas", "Impulso", 2.5, 0.4, "87,5%", "12,5%", "Pradera"),
                    new cPokimon("005", "Combusken", "Fuego", "Lucha", "Mar llamas", "Impulso", 19.5, 0.9, "87,5%", "12,5%", "Pradera"),
                    new cPokimon("006", "Blaziken", "Fuego", "Lucha", "Mar llamas", "Impulso", 52, 1.9, "87,5%", "12,5%", "Pradera"),
                    new cPokimon("007", "Mudkip", "Agua", "", "Torrente", "Humedad", 7.6, 0.4, "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("008", "Marshtomp", "Agua", "Tierra", "Torrente", "Humedad", 28, 0.7, "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("009", "Swampert", "Agua", "Tierra", "Torrente", "Humedad", 81.9, 1.5, "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("010", "Poochyena", "Siniestro", "", "Fuga, Pies rápidos", "Cobardía", 13.6, 0.5, "50%", "50%", "Pradera"),
                    new cPokimon("011", "Mightyena", "Siniestro", "", "Intimidación, Pies rápidos", "Autoestima", 37, 1, "50%", "50%", ""),
                    new cPokimon("012", "Zigzagoon", "Normal", "", "Recogida, Gula", "Pies rápidos", 17.5, 0.4, "50%", "50%", "Pradera"),
                    new cPokimon("013", "Linoone", "Normal", "", "Recogida, Gula", "Pies rápidos", 32.5, 0.5, "50%", "50%", "Pradera"),
                    new cPokimon("014", "Wurmple", "Bicho", "", "Polvo escudo", "Fuga", 3.6, 0.3, "50%", "50%", "Bosque"),
                    new cPokimon("015", "Silcoon", "Bicho", "", "Mudar", "", 10, 0.6, "50%", "50%", "Bosque"),
                    new cPokimon("016", "Beautifly", "Bicho", "Volador", "Enjambre", "Rivalidad", 28.4, 1, "50%", "50%", "Bosque"),
                    new cPokimon("017", "Cascoon", "Bicho", "", "Mudar", "", 11.5, 0.7, "50%", "50%", "Bosque"),
                    new cPokimon("018", "Dustox", "Bicho", "Veneno", "Polvo escudo", "Ojocompuesto", 31.6, 1.2, "50%", "50%", "Bosque"),
                    new cPokimon("019", "Lotad", "Agua", "Planta", "Cura lluvia, Nado rápido", "Ritmo propio", 2.6, 0.5, "50%", "50%", "Agua dulce"),
                    new cPokimon("020", "Lombre", "Agua", "Planta", "Cura lluvia, Nado rápido", "Ritmo propio", 32.5, 1.2, "50%", "50%", "Agua dulce"),
                    new cPokimon("021", "Ludicolo", "Agua", "Planta", "Cura lluvia, Nado rápido", "Ritmo propio", 55, 1.5, "50%", "50%", "Agua dulce"),
                    new cPokimon("022", "Seedot", "Planta", "", "Clorofila, Madrugar", "Hurto", 4, 0.5, "50%", "50%", "Bosque"),
                    new cPokimon("023", "Nuzleaf", "Planta", "Siniestro", "Clorofila, Madrugar", "Hurto", 28, 1, "50%", "50%", "Bosque"),
                    new cPokimon("024", "Shiftry", "Planta", "Siniestro", "Clorofila, Madrugar", "Hurto", 59.6, 1.3, "50%", "50%", "Bosque"),
                    new cPokimon("025", "Taillow", "Normal", "Volador", "Agallas", "Intrépido", 2.3, 0.3, "50%", "50%", "Pradera"),
                    new cPokimon("026", "Swellow", "Normal", "Volador", "Agallas", "Intrépido", 19.8, 0.7, "50%", "50%", "Pradera"),
                    new cPokimon("027", "Wingull", "Agua", "Volador", "Vista lince, Hidratación", "Cura lluvia", 9.5, 0.6, "50%", "50%", "Agua salada"),
                    new cPokimon("028", "Pelipper", "Agua", "Volador", "Vista lince, Llovizna", "Cura lluvia", 28, 1.2, "50%", "50%", "Agua salada"),
                    new cPokimon("029", "Ralts", "Psiquico", "Hada", "Sincronía, Rastro", "Telepatía", 6.6, 0.4, "50%", "50%", "Ciudad"),
                    new cPokimon("030", "Kirlia", "Psiquico", "Hada", "Sincronía, Rastro", "Telepatía", 20.2, 0.8, "50%", "50%", "Ciudad"),
                    new cPokimon("031", "Gardevoir", "Psiquico", "Hada", "Sincronía, Rastro", "Telepatía", 48.4, 1.6, "50%", "50%", "Ciudad"),
                    new cPokimon("032", "Gallade", "Psiquico", "Lucha", "Impasible", "Justiciero", 52, 1.6, "100%", "0%", ""),
                    new cPokimon("033", "Surskit", "Bicho", "Agua", "Nado rápido", "Cura lluvia", 1.7, 0.5, "50%", "50%", "Agua dulce"),
                    new cPokimon("034", "Masquerain", "Bicho", "Volador", "Intimidación", "Nerviosismo", 3.6, 0.8, "50%", "50%", "Agua dulce"),
                    new cPokimon("035", "Shroomish", "Planta", "", "Efecto espora, Antídoto", "Pies rápidos", 4.5, 0.4, "50%", "50%", "Bosque"),
                    new cPokimon("036", "Breloom", "Planta", "Lucha", "Efecto espora, Antídoto", "Experto", 39.2, 1.2, "50%", "50%", "Bosque"),
                    new cPokimon("037", "Slakoth", "Normal", "", "Ausente", "", 24, 0.8, "50%", "50%", "Bosque"),
                    new cPokimon("038", "Vigoroth", "Normal", "", "Espíritu vital", "", 46.5, 1.4, "50%", "50%", "Bosque"),
                    new cPokimon("039", "Slaking", "Normaal", "", "Ausente", "", 130, 2, "50%", "50%", "Bosque"),
                    new cPokimon("040", "Abra", "Psiquico", "", "Sincronía, Foco interno", "Muro mágico", 19.5, 0.9, "75%", "25%", "Ciudad"),
                    new cPokimon("041", "Kadabra", "Psiquico", "", "Sincronía, Foco interno", "Muro mágico", 56.5, 1.3, "75%", "25%", "Ciudad"),
                    new cPokimon("042", "Alakazam", "Psiquico", "", "Sincronía, Foco interno", "Muro mágico", 48, 1.5, "75%", "25%", "Ciudad"),
                    new cPokimon("043", "Nincada", "Bicho", "Tierra", "Ojocompuesto", "Fuga", 5.5, 0.5, "50%", "50%", "Bosque"),
                    new cPokimon("044", "Ninjask", "Bicho", "Volador", "Impulso", "Allanamiento", 12, 0.8, "50%", "50%", "Bosque"),
                    new cPokimon("045", "Shedinja", "Bicho", "Fantasma", "Superguarda", "", 1.2, 0.8, "Sin género", "", "Bosque"),
                    new cPokimon("046", "Whismur", "Normal", "", "Insonorizar", "Cobardía", 16.3, 0.6, "50%", "50%", "Caverna"),
                    new cPokimon("047", "Loudred", "Normal", "", "Insonorizar", "Intrépido", 40.5, 1, "50%", "50%", "Caverna"),
                    new cPokimon("048", "Exploud", "Normal", "", "Insonorizar", "Intrépido", 84, 1.5, "50%", "50%", "Caverna"),
                    new cPokimon("049", "Makuhita", "Lucha", "Lucha", "Agallas, Sebo", "Potencia bruta", 86.4, 1, "75%", "25%", "Montaña"),
                    new cPokimon("050", "Hariyama", "Lucha", "Lucha", "Agallas, Sebo", "Potencia bruta", 253.8, 2.3, "75%", "25%", "Montaña"),
                    new cPokimon("051", "Goldeen", "Agua", "", "Nado rápido, Velo agua", "Pararrayos", 15, 0.6, "50%", "50%", "Agua dulce"),
                    new cPokimon("052", "Seaking", "Agua", "", "Nado rápido, Velo agua", "Pararrayos", 39, 1.3, "50%", "50%", "Agua dulce"),
                    new cPokimon("053", "Magikarp", "Agua", "", "Nado rápido", "Cobardía", 10, 0.9, "50%", "50%", "Agua dulce"),
                    new cPokimon("054", "Gyarados", "Agua", "Volador", "Intimidación", "Autoestima", 235, 6.5, "50%", "50%", "Agua dulce"),
                    new cPokimon("055", "Azurill", "Normal", "Hada", "Potencia, Sebo", "Herbívoro", 2, 0.2, "25%", "75%", "Agua dulce"),
                    new cPokimon("056", "Marill", "Agua", "Hada", "Potencia, Sebo", "Herbívoro", 8.5, 0.4, "50%", "50%", "Agua dulce"),
                    new cPokimon("057", "Azumarill", "Agua", "Hada", "Potencia, Sebo", "Herbívoro", 28.5, 0.8, "50%", "50%", "Agua dulce"),
                    new cPokimon("058", "Geodude", "Roca", "Tierra", "Cabeza roca, Robustez", "Velo arena", 20, 0.4, "50%", "50%", "Montaña"),
                    new cPokimon("059", "Graveler", "Roca", "Tierra", "Cabeza roca, Robustez", "Velo arena", 105, 1, "50%", "50%", "Montaña"),
                    new cPokimon("060", "Golem", "Roca", "Tierra", "Cabeza roca, Robustez", "Velo arena", 300, 1.4, "50%", "50%", "Montaña"),
                    new cPokimon("061", "Nosepass", "Roca", "", "Imán, Robustez", "Poder arena", 97, 1, "50%", "50%", "Caverna"),
                    new cPokimon("062", "Probopass", "Roca", "Acero", "Imán, Robustez", "Poder arena", 340, 1.4, "50%", "50%", ""),
                    new cPokimon("063", "Skitty", "Normal", "", "Gran encanto, Normalidad", "Piel milagro", 11, 0.6, "25%", "75%", "Bosque"),
                    new cPokimon("064", "Delcatty", "Normal", "", "Gran encanto, Normalidad", "Piel milagro", 32.6, 1.1, "25%", "75%", "Bosque"),
                    new cPokimon("065", "Zubat", "Veneno", "Volador", "Foco interno", "Allanamiento", 7.5, 0.8, "50%", "50%", "Caverna"),
                    new cPokimon("066", "Golbat", "Veneno", "Volador", "Foco interno", "Allanamiento", 55, 1.6, "50%", "50%", "Caverna"),
                    new cPokimon("067", "Crobat", "Veneno", "Volador", "Foco interno", "Allanamiento", 75, 1.8, "50%", "50%", "Caverna"),
                    new cPokimon("068", "Tentacool", "Agua", "Veneno", "Cuerpo puro, Lodo líquido", "Cura lluvia", 45.5, 0.9, "50%", "50%", "Agua salada"),
                    new cPokimon("069", "Tentacruel", "Agua", "Veneno", "Cuerpo puro, Lodo líquido", "Cura lluvia", 55, 1.6, "50%", "50%", "Agua salada"),
                    new cPokimon("070", "Sableye", "Siniestro", "Fantasma", "Vista lince, Rezagado", "Bromista", 11, 0.5, "50%", "50%", "Caverna"),
                    new cPokimon("071", "Mawile", "Acero", "Hada", "Intimidación. Corte fuerte", "Potencia bruta", 11.5, 0.6, "50%", "50%", "Caverna"),
                    new cPokimon("072", "Aron", "Acero", "Roca", "Cabeza roca, Robustez", "Metal pesado", 60, 0.4, "50%", "50%", "Montaña"),
                    new cPokimon("073", "Lairon", "Acero", "Roca", "Cabeza roca, Robustez", "Metal pesado", 120, 0.9, "50%", "50%", "Montaña"),
                    new cPokimon("074", "Aggron", "Acero", "Roca", "Cabeza roca, Robustez", "Metal pesado", 360, 2.1, "50%", "50%", "Montaña"),
                    new cPokimon("075", "Machop", "Lucha", "", "Agallas, Indefenso", "Impasible", 19.5, 0.8, "75%", "25%", "Montaña"),
                    new cPokimon("076", "Machoke", "Lucha", "", "Agallas, Indefenso", "Impasible", 75.5, 1.5, "75%", "25%", "Montaña"),
                    new cPokimon("077", "Machamp", "Lucha", "", "Agallas, Indefenso", "Impasible", 130, 1.6, "75%", "25%", "Montaña"),
                    new cPokimon("078", "Meditite", "Lucha", "Psiquico", "Energía pura", "Telepatía", 11.2, 0.6, "50%", "50%", "Montaña"),
                    new cPokimon("079", "Medicham", "Lucha", "Psiquico", "Energía pura", "Telepatía", 31.5, 1.3, "50%", "50%", "Montaña"),
                    new cPokimon("080", "Electrike", "Electrico", "", "Elect. estát., Pararrayos", "Menos", 15.2, 0.6, "50%", "50%", "Pradera"),
                    new cPokimon("081", "Manectric", "Electrico", "", "Elect. estát., Pararrayos", "Menos", 40.2, 1.5, "50%", "50%", "Campo"),
                    new cPokimon("082", "Plusle", "Electrico", "", "Más", "Pararrayos", 4.2, 0.4, "50%", "50%", "Pradera"),
                    new cPokimon("083", "Minun", "Electrico", "", "Menos", "Absorbe electricidad", 4.2, 0.4, "50%", "50%", "Pradera"),
                    new cPokimon("084", "Magnemite", "Electrico", "Acero", "Imán, Robustez", "Cálculo final", 6, 0.3, "Sin género", "", "Campo"),
                    new cPokimon("085", "Magneton", "Electrico", "Acero", "Imán, Robustez", "Cálculo final", 60, 1, "Sin género", "", "Campo"),
                    new cPokimon("086", "Voltorb", "Electrico", "", "Insonorizar, Elect. estát.", "Resquicio", 10.4, 0.5, "Sin género", "", "Ciudad"),
                    new cPokimon("087", "Electrode", "Electrico", "", "Insonorizar, Elect. estát.", "Resquicio", 66.6, 1.2, "Sin género", "", "Ciudad"),
                    new cPokimon("088", "Volbeat", "Bicho", "", "Enjambre, Iluminación", "Bromista", 17.7, 0.7, "100%", "0%", "Bosque"),
                    new cPokimon("089", "Illumise", "Bicho", "", "Despiste, Cromolente", "Bromista", 17.7, 0.6, "0%", "100%", "Bosque"),
                    new cPokimon("090", "Oddish", "Planta", "Veneno", "Clorofila", "Fuga", 5.4, 0.5, "50%", "50%", "Pradera"),
                    new cPokimon("091", "Gloom", "Planta", "Veneno", "Clorofila", "Hedor", 8.6, 0.8, "50%", "50%", "Pradera"),
                    new cPokimon("092", "Vileplume", "Planta", "Veneno", "Clorofila", "Efec. espora", 18.6, 1.2, "50%", "50%", "Pradera"),
                    new cPokimon("093", "Bellossom", "Planta", "", "Clorofila", "Alma cura", 5.8, 0.4, "50%", "50%", "Pradera"),
                    new cPokimon("094", "Doduo", "Normal", "Volador", "Fuga, Madrugar", "Tumbos", 39.2, 1.4, "50%", "50%", "Pradera"),
                    new cPokimon("095", "Dodrio", "Normal", "Volador", "Fuga, Madrugar", "Tumbos", 85.2, 1.8, "50%", "50%", "Pradera"),
                    //new cPokimon("096", "Budew", "Planta", "Veneno", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("097", "Roselia", "Planta", "Veneno", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("098", "Roserade", "Planta", "Veneno", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("099", "Gulpin", "Veneno", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("100", "Swalot", "Veneno", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("101", "Carvanha", "Agua", "Siniestro", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("102", "Sharpedo", "Agua", "Siniestro", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("103", "Wailmer", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("104", "Wailord", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("105", "Numel", "Fuego", "Tierra", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("106", "Camerupt", "Fuego", "Tierra", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("107", "Slugma", "Fuego", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("108", "Magcargo", "Fuego", "Roca", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("109", "Torkoal", "Fuego", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("110", "Grimer", "Veneno", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("111", "Muk", "Veneno", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("112", "Koffing", "Veneno", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("113", "Weezing", "Veneno", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("114", "Spoink", "Psiquico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("115", "Grumpig", "Psiquico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("116", "Sandshrew", "Tierra", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("117", "Sandslash", "Tierra", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("118", "Spinda", "Normal", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("119", "Skarmory", "Acero", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("120", "Trapinch", "Tierra", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("121", "Vibrava", "Tierra", "Dragon", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("123", "Flygon", "Tierra", "Dragon", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("124", "Cacnea", "Planta", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("125", "Cacturne", "Planta", "Siniestro", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("126", "Swablu", "Normal", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("127", "Altaria", "Dragon", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("128", "Zangoose", "Normal", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("129", "Seviper", "Veneno", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("130", "Lunatone", "Roca", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("131", "Solrock", "Roca", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("132", "Barboach", "Agua", "Tierra", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("133", "Whiscash", "Agua", "Tierra", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("134", "Corphish", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("135", "Crawdaunt", "Agua", "Siniestro", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("136", "Baltoy", "Tierra", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("137", "Claydol", "Tierra", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("138", "Lileep", "Roca", "Planta", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("139", "Cradily", "Roca", "Planta", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("140", "Anorith", "Roca", "Bicho", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("141", "Armaldo", "Roca", "Bicho", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("142", "Igglybuff", "Normal", "Hada", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("143", "Jigglypuff", "Normal", "Hada", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("144", "Wigglytuff", "Normal", "Hada", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("145", "Feebas", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("146", "Milotic", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("147", "Castform", "Normal", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("148", "Staryu", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("149", "Starmie", "Agua", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("150", "Kecleon", "Normal", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("151", "Shuppet", "Fantasma", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("152", "Banette", "Fantasma", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("153", "Duskull", "Fantasma", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("154", "Dusclops", "Fantasma", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("155", "Dusknoir", "Fantasma", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("156", "Tropius", "Planta", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("157", "Chingling", "Psiquico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("158", "Chimecho", "Psiquico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("159", "Absol", "Siniestro", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("160", "Vulpix", "Fuego", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("161", "Ninetales", "Fuego", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("162", "Pichu", "Electrico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("163", "Pikachu", "Electrico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("164", "Raichu", "Electrico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("165", "Psyduck", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("166", "Golduck", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("167", "Wynaut", "Psiquico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("168", "Wobbuffet", "Psiquico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("169", "Natu", "Psiquico", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("170", "Xatu", "Psiquico", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("171", "Girafarig", "Normal", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("172", "Phanpy", "Tierra", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("173", "Donphan", "Tierra", "Veneno", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("174", "Pinsir", "Bicho", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("175", "Heracross", "Bicho", "Lucha", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("176", "Rhyhorn", "Tierra", "Roca", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("177", "Rhydon", "Tierra", "Roca", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("178", "Rhyperior", "Tierra", "Roca", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("179", "Snorunt", "Hielo", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("180", "Glalie", "Hielo", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("181", "Froslass", "Hielo", "Fantasma", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("182", "Spheal", "Hielo", "Agua", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("183", "Sealeo", "Hielo", "Agua", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("184", "Walrein", "Hielo", "Agua", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("185", "Clamperl", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("186", "Huntail", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("187", "Gorebyss", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("188", "Relicanth", "Roca", "Agua", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("189", "Corsola", "Roca", "Agua", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("190", "Chinchou", "Agua", "Electrico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("191", "Lanturn", "Agua", "Electrico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("192", "Luvdisc", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("193", "Horsea", "Agua", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("194", "Seadra", "Bicho", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("195", "Kingdra", "Agua", "Dragon", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("196", "Bagon", "Dragon", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("197", "Shelgon", "Dragon", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("198", "Salamence", "Dragon", "Voladora", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("199", "Beldum", "Acero", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("200", "Metang", "Acero", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("201", "Metagross", "Acero", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("202", "Regirock", "Roca", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("203", "Regice", "Hielo", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("204", "Registeel", "Acero", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("205", "Latias", "Dragon", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("206", "Latios", "Dragon", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("207", "Kyogre", "Agua", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("208", "Groudon", "Tierra", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("209", "Rayquaza", "Dragon", "Volador", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("210", "Jirachi", "Acero", "Psiquico", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque"),
                    new cPokimon("211", "Deoxys", "Psiquico", "", "Espesura", "Liviano", 52.2, 1.7, "87,5%", "12,5%", "Bosque")
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
