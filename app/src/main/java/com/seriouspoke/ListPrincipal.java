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
                    new cPokimon("001", "Treecko", "Planta", "", "Espesura", "Liviano", "5 Kg", "0,5 m", "87,5%", "12,5%", "Bosque"),
                    new cPokimon("002", "Grovyle", "Planta", "", "Espesura", "Liviano", "21,6 Kg", "0,9 m", "87,5%", "12,5%", "Bosque"),
                    new cPokimon("003", "Sceptile", "Planta", "", "Espesura", "Liviano", "52,2 Kg", "1,7 m", "87,5%", "12,5%", "Bosque"),
                    new cPokimon("004", "Torchic", "Fuego", "", "Mar llamas", "Impulso", "2,5 Kg", "0,4 m", "87,5%", "12,5%", "Pradera"),
                    new cPokimon("005", "Combusken", "Fuego", "Lucha", "Mar llamas", "Impulso", "19,5 Kg", "0,9 m", "87,5%", "12,5%", "Pradera"),
                    new cPokimon("006", "Blaziken", "Fuego", "Lucha", "Mar llamas", "Impulso", "52 Kg", "1,9 m", "87,5%", "12,5%", "Pradera"),
                    new cPokimon("007", "Mudkip", "Agua", "", "Torrente", "Humedad", "7,6 Kg", "0,4 m", "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("008", "Marshtomp", "Agua", "Tierra", "Torrente", "Humedad", "28 Kg", "0,7 m", "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("009", "Swampert", "Agua", "Tierra", "Torrente", "Humedad", "81,9 Kg" , "1,5 m", "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("010", "Poochyena", "Siniestro", "", "Fuga, Pies rápidos", "Cobardía", "13,6 Kg", "0,5 m", "50%", "50%", "Pradera"),
                    new cPokimon("011", "Mightyena", "Siniestro", "", "Intimidación, Pies rápidos", "Autoestima", "37 Kg", "1 m", "50%", "50%", ""),
                    new cPokimon("012", "Zigzagoon", "Normal", "", "Recogida, Gula", "Pies rápidos", "1,5 Kg", "0,4 m", "50%", "50%", "Pradera"),
                    new cPokimon("013", "Linoone", "Normal", "", "Recogida, Gula", "Pies rápidos", "32,5 Kg", "0,5 m", "50%", "50%", "Pradera"),
                    new cPokimon("014", "Wurmple", "Bicho", "", "Polvo escudo", "Fuga", "3,6 Kg", "0,3 m", "50%", "50%", "Bosque"),
                    new cPokimon("015", "Silcoon", "Bicho", "", "Mudar", "", "10 Kg", "0,6 m", "50%", "50%", "Bosque"),
                    new cPokimon("016", "Beautifly", "Bicho", "Volador", "Enjambre", "Rivalidad", "28,4 Kg", "1 m", "50%", "50%", "Bosque"),
                    new cPokimon("017", "Cascoon", "Bicho", "", "Mudar", "", "11,5 Kg", "0,7 m", "50%", "50%", "Bosque"),
                    new cPokimon("018", "Dustox", "Bicho", "Veneno", "Polvo escudo", "Ojocompuesto", "31,6 Kg", "1,2 m", "50%", "50%", "Bosque"),
                    new cPokimon("019", "Lotad", "Agua", "Planta", "Cura lluvia, Nado rápido", "Ritmo propio", "2,6 Kg", "0,5 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("020", "Lombre", "Agua", "Planta", "Cura lluvia, Nado rápido", "Ritmo propio", "32,5 Kg", "1,2 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("021", "Ludicolo", "Agua", "Planta", "Cura lluvia, Nado rápido", "Ritmo propio", "55 Kg", "1,5 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("022", "Seedot", "Planta", "", "Clorofila, Madrugar", "Hurto", "4 Kg", "0,5 m", "50%", "50%", "Bosque"),
                    new cPokimon("023", "Nuzleaf", "Planta", "Siniestro", "Clorofila, Madrugar", "Hurto", "28 Kg", "1 m", "50%", "50%", "Bosque"),
                    new cPokimon("024", "Shiftry", "Planta", "Siniestro", "Clorofila, Madrugar", "Hurto", "59,6 Kg", "1,3 m", "50%", "50%", "Bosque"),
                    new cPokimon("025", "Taillow", "Normal", "Volador", "Agallas", "Intrépido", "2,3 Kg", "0,3 m", "50%", "50%", "Pradera"),
                    new cPokimon("026", "Swellow", "Normal", "Volador", "Agallas", "Intrépido", "19,8 Kg", "0,7 m", "50%", "50%", "Pradera"),
                    new cPokimon("027", "Wingull", "Agua", "Volador", "Vista lince, Hidratación", "Cura lluvia", "9,5 Kg", "0,6 m", "50%", "50%", "Agua salada"),
                    new cPokimon("028", "Pelipper", "Agua", "Volador", "Vista lince, Llovizna", "Cura lluvia", "28 Kg", "1,2 m", "50%", "50%", "Agua salada"),
                    new cPokimon("029", "Ralts", "Psiquico", "Hada", "Sincronía, Rastro", "Telepatía", "6,6 Kg", "0,4 m", "50%", "50%", "Ciudad"),
                    new cPokimon("030", "Kirlia", "Psiquico", "Hada", "Sincronía, Rastro", "Telepatía", "20,2 Kg", "0,8 m", "50%", "50%", "Ciudad"),
                    new cPokimon("031", "Gardevoir", "Psiquico", "Hada", "Sincronía, Rastro", "Telepatía", "48,4 Kg", "1,6 m", "50%", "50%", "Ciudad"),
                    new cPokimon("032", "Gallade", "Psiquico", "Lucha", "Impasible", "Justiciero", "52 Kg", "1,6 m", "100%", "0%", ""),
                    new cPokimon("033", "Surskit", "Bicho", "Agua", "Nado rápido", "Cura lluvia", "1,7 Kg", "0,5 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("034", "Masquerain", "Bicho", "Volador", "Intimidación", "Nerviosismo", "3,6 Kg", "0,8 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("035", "Shroomish", "Planta", "", "Efecto espora, Antídoto", "Pies rápidos", "4,5 Kg", "0,4 m", "50%", "50%", "Bosque"),
                    new cPokimon("036", "Breloom", "Planta", "Lucha", "Efecto espora, Antídoto", "Experto", "39,2 Kg", "1,2 m", "50%", "50%", "Bosque"),
                    new cPokimon("037", "Slakoth", "Normal", "", "Ausente", "", "24 Kg", "0,8 m", "50%", "50%", "Bosque"),
                    new cPokimon("038", "Vigoroth", "Normal", "", "Espíritu vital", "", "46,5 Kg", "1,4 m", "50%", "50%", "Bosque"),
                    new cPokimon("039", "Slaking", "Normal", "", "Ausente", "", "130 Kg", "2 m", "50%", "50%", "Bosque"),
                    new cPokimon("040", "Abra", "Psiquico", "", "Sincronía, Foco interno", "Muro mágico", "19,5 Kg", "0,9 m", "75%", "25%", "Ciudad"),
                    new cPokimon("041", "Kadabra", "Psiquico", "", "Sincronía, Foco interno", "Muro mágico", "56,5 Kg", "1,3 m", "75%", "25%", "Ciudad"),
                    new cPokimon("042", "Alakazam", "Psiquico", "", "Sincronía, Foco interno", "Muro mágico", "48 Kg", "1,5 m", "75%", "25%", "Ciudad"),
                    new cPokimon("043", "Nincada", "Bicho", "Tierra", "Ojocompuesto", "Fuga", "5,5 Kg", "0,5 m", "50%", "50%", "Bosque"),
                    new cPokimon("044", "Ninjask", "Bicho", "Volador", "Impulso", "Allanamiento", "12 Kg", "0,8 m", "50%", "50%", "Bosque"),
                    new cPokimon("045", "Shedinja", "Bicho", "Fantasma", "Superguarda", "", "1,2 Kg", "0,8 m", "Sin género", "", "Bosque"),
                    new cPokimon("046", "Whismur", "Normal", "", "Insonorizar", "Cobardía", "16,3 Kg", "0,6 m", "50%", "50%", "Caverna"),
                    new cPokimon("047", "Loudred", "Normal", "", "Insonorizar", "Intrépido", "40,5 Kg", "1 m", "50%", "50%", "Caverna"),
                    new cPokimon("048", "Exploud", "Normal", "", "Insonorizar", "Intrépido", "84 Kg", "1,5 m", "50%", "50%", "Caverna"),
                    new cPokimon("049", "Makuhita", "Lucha", "", "Agallas, Sebo", "Potencia bruta", "86,4 Kg", "1 m", "75%", "25%", "Montaña"),
                    new cPokimon("050", "Hariyama", "Lucha", "", "Agallas, Sebo", "Potencia bruta", "253,8 Kg", "2,3 m", "75%", "25%", "Montaña"),
                    new cPokimon("051", "Goldeen", "Agua", "", "Nado rápido, Velo agua", "Pararrayos", "15 Kg", "0,6 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("052", "Seaking", "Agua", "", "Nado rápido, Velo agua", "Pararrayos", "39 Kg", "1,3 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("053", "Magikarp", "Agua", "", "Nado rápido", "Cobardía", "10 Kg", "0,9 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("054", "Gyarados", "Agua", "Volador", "Intimidación", "Autoestima", "235 Kg", "6,5", "50%", "50%", "Agua dulce"),
                    new cPokimon("055", "Azurill", "Normal", "Hada", "Potencia, Sebo", "Herbívoro", "2 Kg", "0,2 m", "25%", "75%", "Agua dulce"),
                    new cPokimon("056", "Marill", "Agua", "Hada", "Potencia, Sebo", "Herbívoro", "8,5 Kg", "0,4 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("057", "Azumarill", "Agua", "Hada", "Potencia, Sebo", "Herbívoro", "28,5 Kg", "0,8 m", "50%", "50%", "Agua dulce"),
                    new cPokimon("058", "Geodude", "Roca", "Tierra", "Cabeza roca, Robustez", "Velo arena", "20 Kg", "0,4 m", "50%", "50%", "Montaña"),
                    new cPokimon("059", "Graveler", "Roca", "Tierra", "Cabeza roca, Robustez", "Velo arena", "105 Kg", "1 m", "50%", "50%", "Montaña"),
                    new cPokimon("060", "Golem", "Roca", "Tierra", "Cabeza roca, Robustez", "Velo arena", "300 Kg", "1,4 m", "50%", "50%", "Montaña"),
                    new cPokimon("061", "Nosepass", "Roca", "", "Imán, Robustez", "Poder arena", "97 Kg", "1 m", "50%", "50%", "Caverna"),
                    new cPokimon("062", "Probopass", "Roca", "Acero", "Imán, Robustez", "Poder arena", "340 Kg", "1,4 m", "50%", "50%", ""),
                    new cPokimon("063", "Skitty", "Normal", "", "Gran encanto, Normalidad", "Piel milagro", "11 Kg", "0,6 m", "25%", "75%", "Bosque"),
                    new cPokimon("064", "Delcatty", "Normal", "", "Gran encanto, Normalidad", "Piel milagro", "32,6 Kg", "1,1 m", "25%", "75%", "Bosque"),
                    new cPokimon("065", "Zubat", "Veneno", "Volador", "Foco interno", "Allanamiento", "7,5 Kg", "0,8 m", "50%", "50%", "Caverna"),
                    new cPokimon("066", "Golbat", "Veneno", "Volador", "Foco interno", "Allanamiento", "55 Kg", "1,6 m", "50%", "50%", "Caverna"),
                    new cPokimon("067", "Crobat", "Veneno", "Volador", "Foco interno", "Allanamiento", "75 Kg", "1,8 m", "50%", "50%", "Caverna"),
                    new cPokimon("068", "Tentacool", "Agua", "Veneno", "Cuerpo puro, Lodo líquido", "Cura lluvia", "45,5 Kg", "0,9 m", "50%", "50%", "Agua salada"),
                    new cPokimon("069", "Tentacruel", "Agua", "Veneno", "Cuerpo puro, Lodo líquido", "Cura lluvia", "55 Kg", "1,6 m", "50%", "50%", "Agua salada"),
                    new cPokimon("070", "Sableye", "Siniestro", "Fantasma", "Vista lince, Rezagado", "Bromista", "11 Kg", "0,5 m", "50%", "50%", "Caverna"),
                    new cPokimon("071", "Mawile", "Acero", "Hada", "Intimidación. Corte fuerte", "Potencia bruta", "11,5 Kg", "0,6 m", "50%", "50%", "Caverna"),
                    new cPokimon("072", "Aron", "Acero", "Roca", "Cabeza roca, Robustez", "Metal pesado", "60 Kg", "0,4 m", "50%", "50%", "Montaña"),
                    new cPokimon("073", "Lairon", "Acero", "Roca", "Cabeza roca, Robustez", "Metal pesado", "120 Kg", "0,9 m", "50%", "50%", "Montaña"),
                    new cPokimon("074", "Aggron", "Acero", "Roca", "Cabeza roca, Robustez", "Metal pesado", "360 Kg", "2,1 m", "50%", "50%", "Montaña"),
                    new cPokimon("075", "Machop", "Lucha", "", "Agallas, Indefenso", "Impasible", "19,5 Kg", "0,8 m", "75%", "25%", "Montaña"),
                    new cPokimon("076", "Machoke", "Lucha", "", "Agallas, Indefenso", "Impasible", "75,5 Kg", "1,5 m", "75%", "25%", "Montaña"),
                    new cPokimon("077", "Machamp", "Lucha", "", "Agallas, Indefenso", "Impasible", "130 Kg", "1,6 m", "75%", "25%", "Montaña"),
                    new cPokimon("078", "Meditite", "Lucha", "Psiquico", "Energía pura", "Telepatía", "11.2 Kg", "0,6 m", "50%", "50%", "Montaña"),
                    new cPokimon("079", "Medicham", "Lucha", "Psiquico", "Energía pura", "Telepatía", "31,5 Kg", "1,3 m", "50%", "50%", "Montaña"),
                    new cPokimon("080", "Electrike", "Electrico", "", "Elect. estát., Pararrayos", "Menos", "15,2 Kg", "0,6 m", "50%", "50%", "Pradera"),
                    new cPokimon("081", "Manectric", "Electrico", "", "Elect. estát., Pararrayos", "Menos", "40,2 Kg", "1,5 m", "50%", "50%", "Campo"),
                    new cPokimon("082", "Plusle", "Electrico", "", "Más", "Pararrayos", "4,2 Kg", "0,4 m", "50%", "50%", "Pradera"),
                    new cPokimon("083", "Minun", "Electrico", "", "Menos", "Absorbe electricidad", "4,2 Kg", "0,4 m", "50%", "50%", "Pradera"),
                    new cPokimon("084", "Magnemite", "Electrico", "Acero", "Imán, Robustez", "Cálculo final", "6 Kg", "0,3 m", "Sin género", "", "Campo"),
                    new cPokimon("085", "Magneton", "Electrico", "Acero", "Imán, Robustez", "Cálculo final", "60 Kg", "1 m", "Sin género", "", "Campo"),
                    new cPokimon("086", "Voltorb", "Electrico", "", "Insonorizar, Elect. estát.", "Resquicio", "10,4 Kg", "0,5 m", "Sin género", "", "Ciudad"),
                    new cPokimon("087", "Electrode", "Electrico", "", "Insonorizar, Elect. estát.", "Resquicio", "66,6 Kg", "1,2 m", "Sin género", "", "Ciudad"),
                    new cPokimon("088", "Volbeat", "Bicho", "", "Enjambre, Iluminación", "Bromista", "17,7 Kg", "0,7 m", "100%", "0%", "Bosque"),
                    new cPokimon("089", "Illumise", "Bicho", "", "Despiste, Cromolente", "Bromista", "17,7 Kg", "0,6 m", "0%", "100%", "Bosque"),
                    new cPokimon("090", "Oddish", "Planta", "Veneno", "Clorofila", "Fuga", "5,4 Kg", "0,5 m", "50%", "50%", "Pradera"),
                    new cPokimon("091", "Gloom", "Planta", "Veneno", "Clorofila", "Hedor", "8,6 Kg", "0,8 m", "50%", "50%", "Pradera"),
                    new cPokimon("092", "Vileplume", "Planta", "Veneno", "Clorofila", "Efec. espora", "18,6 Kg", "1,2 m", "50%", "50%", "Pradera"),
                    new cPokimon("093", "Bellossom", "Planta", "", "Clorofila", "Alma cura", "5,8 Kg", "0,4 m", "50%", "50%", "Pradera"),
                    new cPokimon("094", "Doduo", "Normal", "Volador", "Fuga, Madrugar", "Tumbos", "39,2 Kg", "1,4 m", "50%", "50%", "Pradera"),
                    new cPokimon("095", "Dodrio", "Normal", "Volador", "Fuga, Madrugar", "Tumbos", "85,2 Kg", "1,8 m", "50%", "50%", "Pradera"),
                    new cPokimon("096", "Budew", "Planta", "Veneno", "Cura natural, Punto tóxico", "Defensa hoja", "1,2 Kg", "0,2 m", "50%", "50%", ""),
                    new cPokimon("097", "Roselia", "Planta", "Veneno", "Cura natural, Punto tóxico", "Defensa hoja", "2 Kg", 0.3, "50%", "50%", "Pradera"),
                    new cPokimon("098", "Roserade", "Planta", "Veneno", "Cura natural, Punto tóxico", "Experto", 14.5, 0.9, "50%", "50%", ""),
                    new cPokimon("099", "Gulpin", "Veneno", "", "Lodo líquido, Viscosidad", "Gula", 10.3, 0.4, "50%", "50%", "Pradera"),
                    new cPokimon("100", "Swalot", "Veneno", "", "Lodo líquido, Viscosidad", "Gula", 80, 1.7, "50%", "50%", "Pradera"),
                    new cPokimon("101", "Carvanha", "Agua", "Siniestro", "Piel tosca", "Impulso", 20.8, 0.8, "50%", "50%", "Agua salada"),
                    new cPokimon("102", "Sharpedo", "Agua", "Siniestro", "Piel tosca", "Impulso", 88.8, 1.8, "50%", "50%", "Agua salada"),
                    new cPokimon("103", "Wailmer", "Agua", "", "Velo agua, Despiste", "Presión", 130, 2, "50%", "50%", "Agua salada"),
                    new cPokimon("104", "Wailord", "Agua", "", "Velo agua, Despiste", "Presión", 398, 14.5, "50%", "50%", "Agua salada"),
                    new cPokimon("105", "Numel", "Fuego", "Tierra", "Despiste, Simple", "Ritmo propio", 24, 0.7, "50%", "50%", "Montaña"),
                    new cPokimon("106", "Camerupt", "Fuego", "Tierra", "Escudo magma, Roca sólida", "Irascible", 220, 1.9, "50%", "50%", "Montaña"),
                    new cPokimon("107", "Slugma", "Fuego", "", "Cuerpo llama, Escudo magma", "Armadura frágil", 30, 0.7, "50%", "50%", "Montaña"),
                    new cPokimon("108", "Magcargo", "Fuego", "Roca", "Cuerpo llama, Escudo magma", "Armadura frágil", 55, 0.8, "50%", "50%", "Montaña"),
                    new cPokimon("109", "Torkoal", "Fuego", "", "Humo blanco, Sequía", "Caparazón", 80.4, 0.5, "50%", "50%", "Montaña"),
                    new cPokimon("110", "Grimer", "Veneno", "", "Hedor, Viscosidad", "Toque tóxico", 30, 0.9, "50%", "50%", "Ciudad"),
                    new cPokimon("111", "Muk", "Veneno", "", "Hedor, Viscosidad", "Toque tóxico", 30, 1.2, "50%", "50%", "Ciudad"),
                    new cPokimon("112", "Koffing", "Veneno", "", "Levitación", "", 1, 0.6, "50%", "50%", "Ciudad"),
                    new cPokimon("113", "Weezing", "Veneno", "", "Levitación", "", 9.5, 1.2, "50%", "50%", "Ciudad"),
                    new cPokimon("114", "Spoink", "Psiquico", "", "Ritmo propio, Sebo", "Gula", 30.6, 0.7, "50%", "50%", "Montaña"),
                    new cPokimon("115", "Grumpig", "Psiquico", "", "Ritmo propio, Sebo", "Gula", 71.5, 0.9, "50%", "50%", "Montaña"),
                    new cPokimon("116", "Sandshrew", "Tierra", "", "Velo arena", "Ímpetu arena", 12, 0.6, "50%", "50%", "Campo"),
                    new cPokimon("117", "Sandslash", "Tierra", "", "Velo arena", "Ímpetu arena", 29.5, 1, "50%", "50%", "Campo"),
                    new cPokimon("118", "Spinda", "Normal", "", "Ritmo propio, Tumbos", "Respondón", 5, 1.1, "50%", "50%", "Pradera"),
                    new cPokimon("119", "Skarmory", "Acero", "Volador", "Robustez, Vista lince", "Armadura frágil", 50.5, 1.7, "50%", "50%", "Campo"),
                    new cPokimon("120", "Trapinch", "Tierra", "", "Corte fuerte, Trampa arena", "Potencia bruta", 15, 0.7, "50%", "50%", "Campo"),
                    new cPokimon("121", "Vibrava", "Tierra", "Dragon", "Levitación", "", 15.3, 1.1, "50%", "50%", "Campo"),
                    new cPokimon("123", "Flygon", "Tierra", "Dragon", "Levitación", "", 82, 2, "50%", "50%", "Campo"),
                    new cPokimon("124", "Cacnea", "Planta", "", "Velo arena", "Absorbe agua", 51.3, 0.4, "50%", "50%", "Campo"),
                    new cPokimon("125", "Cacturne", "Planta", "Siniestro", "Velo arena", "Absorbe agua", 77.4, 1.3, "50%", "50%", "Campo"),
                    new cPokimon("126", "Swablu", "Normal", "Volador", "Cura natural", "Aclimatación", 1.2, 0.4, "50%", "50%", "Bosque"),
                    new cPokimon("127", "Altaria", "Dragon", "Volador", "Cura natural", "Aclimatación", 20.6, 1.1, "50%", "50%", "Bosque"),
                    new cPokimon("128", "Zangoose", "Normal", "", "Inmunidad", "Ímpetu tóxico", 40.3, 1.3, "50%", "50%", "Pradera"),
                    new cPokimon("129", "Seviper", "Veneno", "", "Mudar", "Allanamiento", 52.5, 2.7, "50%", "50%", "Pradera"),
                    new cPokimon("130", "Lunatone", "Roca", "Psiquico", "Levitación", "", 168, 1, "Sin género", "", "Caverna"),
                    new cPokimon("131", "Solrock", "Roca", "Psiquico", "Levitación", "", 154, 1.2, "Sin género", "", "Caverna"),
                    new cPokimon("132", "Barboach", "Agua", "Tierra", "Despiste, Anticipación", "Hidratación", 1.9, 0.4, "50%", "50%", "Agua dulce"),
                    new cPokimon("133", "Whiscash", "Agua", "Tierra", "Despiste, Anticipación", "Hidratación", 23.6, 0.9, "50%", "50%", "Agua dulce"),
                    new cPokimon("134", "Corphish", "Agua", "", "Caparazón, Corte fuerte", "Adaptable", 11.5, 0.6, "50%", "50%", "Agua dulce"),
                    new cPokimon("135", "Crawdaunt", "Agua", "Siniestro", "Caparazón, Corte fuerte", "Adaptable", 32.8, 1.1, "50%", "50%", "Agua dulce"),
                    new cPokimon("136", "Baltoy", "Tierra", "Psiquico", "Levitación", "", 21.5, 0.5, "Sin género", "", "Campo"),
                    new cPokimon("137", "Claydol", "Tierra", "Psiquico", "Levitación", "", 108, 1.5, "Sin género", "", "Campo"),
                    new cPokimon("138", "Lileep", "Roca", "Planta", "Ventosas", "Colector", 23.8, 1, "87,5%", "12,5%", "Agua salada"),
                    new cPokimon("139", "Cradily", "Roca", "Planta", "Ventosas", "Colector", 60.4, 1.5, "87,5%", "12,5%", "Agua salada"),
                    new cPokimon("140", "Anorith", "Roca", "Bicho", "Armad. bat.", "Nado rápido", 12.5, 0.7, "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("141", "Armaldo", "Roca", "Bicho", "Armad. bat.", "Nado rápido", 68.2, 1.5, "87,5%", "12,5%", "Agua dulce"),
                    new cPokimon("142", "Igglybuff", "Normal", "Hada", "Gran encanto, Tenacidad", "Compiescolta", 1, 0.3, "25%", "75%", "Pradera"),
                    new cPokimon("143", "Jigglypuff", "Normal", "Hada", "Gran encanto, Tenacidad", "Compiescolta", 5.5, 0.5, "25%", "75%", "Pradera "),
                    new cPokimon("144", "Wigglytuff", "Normal", "Hada", "Gran encanto, Tenacidad", "Cacheo", 12, 1, "25%", "75%", "Pradera"),
                    new cPokimon("145", "Feebas", "Agua", "", "Nado rápido, Despiste", "Adaptable", 7.4, 0.6, "50%", "50%", "Agua dulce"),
                    new cPokimon("146", "Milotic", "Agua", "", "Escama especial, Tenacidad", "Gran encanto", 162, 6.2, "50%", "50%", "Agua dulce"),
                    new cPokimon("147", "Castform", "Normal", "", "Predicción", "", 0.8, 0.3, "50%", "50%", "Pradera"),
                    new cPokimon("148", "Staryu", "Agua", "", "Cura natural, Iluminación", "Cálculo final", 34.5, 0.8, "Sin género", "", "Agua salada"),
                    new cPokimon("149", "Starmie", "Agua", "Psiquico", "Cura natural, Iluminación", "Cálculo final", 80, 1.1, "Sin género", "", "Agua salada"),
                    new cPokimon("150", "Kecleon", "Normal", "", "Cambio color", "Mutatipo", 22, 1, "50%", "50%", "Bosque"),
                    new cPokimon("151", "Shuppet", "Fantasma", "", "Insomnio, Cacheo", "Cuerpo maldito", 2.3, 0.6, "50%", "50%", "Ciudad"),
                    new cPokimon("152", "Banette", "Fantasma", "", "Insomnio, Cacheo", "Cuerpo maldito", 12.5, 1.1, "50%", "50%", "Ciudad"),
                    new cPokimon("153", "Duskull", "Fantasma", "", "Levitación", "Cacheo", 15, 0.8, "50%", "50%", "Bosque"),
                    new cPokimon("154", "Dusclops", "Fantasma", "", "Presión", "Cacheo", 30.6, 1.6, "50%", "50%", "Bosque"),
                    new cPokimon("155", "Dusknoir", "Fantasma", "", "Presión", "Cacheo", 106.6, 2.2, "50%", "50%", ""),
                    new cPokimon("156", "Tropius", "Planta", "Volador", "Clorofila, Poder solar", "Cosecha", 100, 2, "50%", "50%", "Bosque"),
                    new cPokimon("157", "Chingling", "Psiquico", "", "Levitación", "", 0.6, 0.2, "50%", "50%", ""),
                    new cPokimon("158", "Chimecho", "Psiquico", "", "Levitación", "", 1, 0.6, "50%", "50%", "Pradera"),
                    new cPokimon("159", "Absol", "Siniestro", "", "Presión, Afortunado", "Justiciero", 47, 1.2, "50%", "50%", "Montaña"),
                    new cPokimon("160", "Vulpix", "Fuego", "", "Absorbe fuego", "Sequía", 9.9, 0.6, "25%", "75%", "Pradera"),
                    new cPokimon("161", "Ninetales", "Fuego", "", "Absorbe fuego", "Sequía", 19.9, 1.1, "25%", "75%", "Pradera"),
                    new cPokimon("162", "Pichu", "Electrico", "", "Electricidad estática", "Pararrayos", 2, 0.3, "50%", "50%", "Bosque"),
                    new cPokimon("163", "Pikachu", "Electrico", "", "Electricidad estática", "Pararrayos", 6, 0.4, "50%", "50%", "Bosque"),
                    new cPokimon("164", "Raichu", "Electrico", "", "Electricidad estática", "Pararrayos", 30, 0.8, "50%", "50%", "Bosque"),
                    new cPokimon("165", "Psyduck", "Agua", "", "Humedad, Aclimatación", "Nado rápido", 19.6, 0.8, "50%", "50%", "Agua dulce"),
                    new cPokimon("166", "Golduck", "Agua", "", "Humedad, Aclimatación", "Nado rápido", 76.6, 1.7, "50%", "50%", "Agua dulce "),
                    new cPokimon("167", "Wynaut", "Psiquico", "", "Sombra trampa", "Telepatía", 14, 0.6, "50%", "50%", "Caverna"),
                    new cPokimon("168", "Wobbuffet", "Psiquico", "", "Sombra trampa", "Telepatía", 28.5, 1.3, "50%", "50%", "Caverna"),
                    new cPokimon("169", "Natu", "Psiquico", "Volador", "Madrugar", "Sincronía", 2, 0.2, "50%", "50%", "Bosque"),
                    new cPokimon("170", "Xatu", "Psiquico", "Volador", "Madrugar, Sincronía", "Espejo mágico", 15, 1.5, "50%", "50%", "Bosque"),
                    new cPokimon("171", "Girafarig", "Normal", "Psiquico", "Foco interno, Madrugar", "Herbívoro", 41.5, 1.5, "50%", "50%", "Pradera"),
                    new cPokimon("172", "Phanpy", "Tierra", "", "Recogida", "Velo arena", 33.5, 0.5, "50%", "50%", "Campo"),
                    new cPokimon("173", "Donphan", "Tierra", "Veneno", "Robustez", "Velo arena", 120, 1.1, "50%", "50%", "Campo"),
                    new cPokimon("174", "Pinsir", "Bicho", "", "Corte fuerte, Rompemoldes", "Autoestima", 55, 1.5, "50%", "50%", "Bosque"),
                    new cPokimon("175", "Heracross", "Bicho", "Lucha", "Enjambre, Agallas", "Autoestima", 54, 1.5, "50%", "50%", "Bosque"),
                    new cPokimon("176", "Rhyhorn", "Tierra", "Roca", "Pararrayos", "Cabeza roca", 115, 1, "50%", "50%", "Campo"),
                    new cPokimon("177", "Rhydon", "Tierra", "Roca", "Pararrayos, Cabeza roca", "Audaz", 120, 1.9, "50%", "50%", ""),
                    new cPokimon("178", "Rhyperior", "Tierra", "Roca", "Pararrayos, Roca sólida", "Audaz", 282.8, 2.4, "50%", "50%", ""),
                    new cPokimon("179", "Snorunt", "Hielo", "", "Foco interno, Gélido", "Veleta", 16.8, 0.7, "50%", "50%", "Caverna"),
                    new cPokimon("180", "Glalie", "Hielo", "", "Foco interno, Gélido", "Veleta", 256.5, 1.5, "50%", "50%", "Caverna"),
                    new cPokimon("181", "Froslass", "Hielo", "Fantasma", "Manto níveo", "Cuerpo maldito", 26.6, 1.3, "0%", "100%", ""),
                    new cPokimon("182", "Spheal", "Hielo", "Agua", "Sebo, Gélido", "Despiste", 39.5, 0.8, "50%", "50%", "Agua salada"),
                    new cPokimon("183", "Sealeo", "Hielo", "Agua", "Sebo, Gélido", "Despiste", 87.6, 1.1, "50%", "50%", "Agua salada"),
                    new cPokimon("184", "Walrein", "Hielo", "Agua", "Sebo, Gélido", "Despiste", 150.6, 1.4, "50%", "50%", "Agua salada"),
                    new cPokimon("185", "Clamperl", "Agua", "", "Caparazón", "Cobardía", 52.5, 0.4, "50%", "50%", "Agua salada"),
                    new cPokimon("186", "Huntail", "Agua", "", "Nado rápido", "Velo agua", 27, 1.7, "50%", "50%", "Agua salada"),
                    new cPokimon("187", "Gorebyss", "Agua", "", "Nado rápido", "Hidratación", 22.6, 1.8, "50%", "50%", "Agua salada"),
                    new cPokimon("188", "Relicanth", "Roca", "Agua", "Cabeza roca, Nado rápido", "Robustez", 23.4, 1, "87,5%", "12,5%", "Agua salada"),
                    new cPokimon("189", "Corsola", "Roca", "Agua", "Cura natural, Entusiasmo", "Regeneración", 5, 0.6, "25%", "75%", "Agua salada"),
                    new cPokimon("190", "Chinchou", "Agua", "Electrico", "Absor. elec., Iluminación", "Absorbe agua", 12, 0.5, "57%", "43%", "Agua salada"),
                    new cPokimon("191", "Lanturn", "Agua", "Electrico", "Absor. elec., Iluminación", "Absorbe agua", 22.5, 1.2, "50%", "50%", "Agua salada"),
                    new cPokimon("192", "Luvdisc", "Agua", "", "Nado rápido", "Hidratación", 8.7, 0.6, "25%", "75%", "Agua salada"),
                    new cPokimon("193", "Horsea", "Agua", "Volador", "Nado rápido, Francotirador", "Humedad", 8, 0.4, "50%", "50%", "Agua salada"),
                    new cPokimon("194", "Seadra", "Bicho", "", "Punto tóxico, Francotirador", "Humedad", 25, 1.2, "50%", "50%", "Agua salada"),
                    new cPokimon("195", "Kingdra", "Agua", "Dragon", "Nado rápido, Francotirador", "Humedad", 152, 1.8, "50%", "50%", "Agua salada"),
                    new cPokimon("196", "Bagon", "Dragon", "", "Cabeza roca", "Potencia bruta", 42.1, 0.6, "50%", "50%", "Campo"),
                    new cPokimon("197", "Shelgon", "Dragon", "", "Cabeza roca", "Funda", 110.5, 1.1, "50%", "50%", "Caverna"),
                    new cPokimon("198", "Salamence", "Dragon", "Voladora", "Intimidación", "Autoestima", 102.6, 1.5, "50%", "50%", "Campo"),
                    new cPokimon("199", "Beldum", "Acero", "Psiquico", "Cuerpo puro", "Metal liviano", 95.2, 0.6, "Sin género", "", "Campo"),
                    new cPokimon("200", "Metang", "Acero", "Psiquico", "Cuerpo puro", "Metal liviano", 202.5, 1.2, "Sin género", "", "Campo"),
                    new cPokimon("201", "Metagross", "Acero", "Psiquico", "Cuerpo puro", "Metal liviano", 550, 1.6, "Sin género", "", "Campo"),
                    new cPokimon("202", "Regirock", "Roca", "", "Cuerpo puro", "Robustez", 230, 1.7, "Sin género", "", "Caverna"),
                    new cPokimon("203", "Regice", "Hielo", "", "Cuerpo puro", "Gélido", 175, 1.8, "Sin género", "", "Caverna"),
                    new cPokimon("204", "Registeel", "Acero", "", "Cuerpo puro", "Metal liviano", 205, 1.9, "Sin género", "", "Caverna"),
                    new cPokimon("205", "Latias", "Dragon", "Psiquico", "Levitación", "", 40, 1.4, "0%", "100%", "Agua dulce"),
                    new cPokimon("206", "Latios", "Dragon", "Psiquico", "Levitación", "", 60, 2, "100%", "0%", "Agua dulce"),
                    new cPokimon("207", "Kyogre", "Agua", "", "Llovizna", "", 352, 4.5, "Sin género", "", "Agua salada"),
                    new cPokimon("208", "Groudon", "Tierra", "", "Sequía", "", 950, 3.5, "Sin género", "", "Campo"),
                    new cPokimon("209", "Rayquaza", "Dragon", "Volador", "Bucle aire", "", 206.5, 7, "Sin género", "", "Raro"),
                    new cPokimon("210", "Jirachi", "Acero", "Psiquico", "Dicha", "", 1.1, 0.3, "Sin género", "", ""),
                    new cPokimon("211", "Deoxys", "Psiquico", "", "Presión", "", 60.8, 1.7, "Sin género", "", "Raro")
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

    }

    class AdaptadorPokemons extends ArrayAdapter<cPokimon> {

        private Context context;

        public AdaptadorPokemons(Context context, cPokimon[] datos) {
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
            escollirColor(pokemon.getTipo1(), item, tv);


            tv.setText(pokemon.getTipo1());

            tv = (TextView) item.findViewById(R.id.tvTipo2);
            escollirColor(pokemon.getTipo2(), item, tv);

            tv.setText(pokemon.getTipo2());

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

        public void escollirColor(String tipo, View item, TextView tv) {
            String hexColor = "";

            switch (tipo) {
                case "Planta":

                    tv.setBackgroundColor(Color.parseColor("#73C457"));

                    break;
                case "Fuego":

                    tv.setBackgroundColor(Color.parseColor("#DF4E2F"));

                    break;
                case "Lucha":

                    tv.setBackgroundColor(Color.parseColor("#B95943"));

                    break;
                case "Agua":

                    tv.setBackgroundColor(Color.parseColor("#329BFE"));

                    break;
                case "Siniestro":

                    tv.setBackgroundColor(Color.parseColor("#71584A"));
                    tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                    break;
                case "Normal":

                    tv.setBackgroundColor(Color.parseColor("#C2B4B2"));

                    break;
                case "Bicho":

                    tv.setBackgroundColor(Color.parseColor("#A7B33B"));

                    break;
                case "Tierra":

                    tv.setBackgroundColor(Color.parseColor("#DEC054"));

                    break;
                case "Volador":

                    tv.setBackgroundColor(Color.parseColor("#6A9BE8"));

                    break;
                case "Veneno":

                    tv.setBackgroundColor(Color.parseColor("#884A7A"));
                    tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                    break;
                case "Psiquico":

                    tv.setBackgroundColor(Color.parseColor("#D06B8D"));

                    break;
                case "Dragon":

                    tv.setBackgroundColor(Color.parseColor("#5A5478"));
                    tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                    break;
                case "Roca":

                    tv.setBackgroundColor(Color.parseColor("#BCAA63"));

                    break;
                case "Hada":

                    tv.setBackgroundColor(Color.parseColor("#FDABFD"));

                    break;
                case "Fantasma":

                    tv.setBackgroundColor(Color.parseColor("#6E6DAD"));
                    tv.setTextColor(Color.parseColor("#FFFFFFFF"));

                    break;
                case "Electrico":

                    tv.setBackgroundColor(Color.parseColor("#F4CB5C"));

                    break;
                case "Hielo":

                    tv.setBackgroundColor(Color.parseColor("#7EDAFD"));

                    break;
                case "Acero":

                    tv.setBackgroundColor(Color.parseColor("#B2A8BC"));

                    break;
                default:

                    tv.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            }
        }
    }
}
