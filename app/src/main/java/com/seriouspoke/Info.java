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
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Personalitzem el caption
        setTitle("Pokedex HOENN");

        Bundle bundleNum = getIntent().getExtras();
        final String numPokedex = bundleNum.getString("numPokedex");

        Bundle bundleNom = getIntent().getExtras();
        final String nombre = bundleNom.getString("nombre");

        Bundle bundleT1 = getIntent().getExtras();
        final String tipo1 = bundleT1.getString("t1");

        Bundle bundleT2 = getIntent().getExtras();
        final String tipo2 = bundleT2.getString("t2");

    }

}
