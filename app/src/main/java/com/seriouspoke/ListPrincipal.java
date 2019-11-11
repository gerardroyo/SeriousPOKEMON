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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_principal);

        // Personalitzem el caption
        setTitle("Pokedex HOENN");

        // Mostrem el botó enrera que cal capturar en l'envent onOptionsItemSelected
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Construim l'adaptador utilitzant un layout per defecte de Android.
        AdaptadorAmigos adaptador = new AdaptadorAmigos(this, Amigos);

        // Assignem al listview l'adaptador creat
        ListView lst = (ListView)findViewById(R.id.listCustom);
        lst.setAdapter(adaptador);

    }

}

class AdaptadorAmigos extends ArrayAdapter<cPokimon> {

    public AdaptadorAmigos(Context context, cPokimon[] datos) {
        super(context, R.layout.layout_amigo, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.layout_amigo, null);

        cAmigo amigo = (cAmigo) getItem(position);

        TextView edt = (TextView)item.findViewById(R.id.edtNombre);
        edt.setText(amigo.getNombre());

        edt = (TextView)item.findViewById(R.id.edtApellidos);
        edt.setText(amigo.getApellidos());

        edt = (TextView)item.findViewById(R.id.edtTelefono);
        edt.setText(amigo.getTelefono());
        return(item);
    }
}
