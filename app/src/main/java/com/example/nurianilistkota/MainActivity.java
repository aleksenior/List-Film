package com.example.nurianilistkota;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> cities;
    private CityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi data kota
        cities = new ArrayList<>();
        cities.add("Upin Ipin");
        cities.add("Adit Sopo Jarwo");
        cities.add("Doraemon");
        cities.add("Ultarmen sesion 7");
        cities.add("spongebob squerpants");
        cities.add("krisna the series");

        // Inisialisasi listview
        listView = findViewById(R.id.lv_cities);

        // Inisialisasi adapter
        adapter = new CityAdapter(this, cities);

        // Set adapter ke listview
        listView.setAdapter(adapter);
    }
}
