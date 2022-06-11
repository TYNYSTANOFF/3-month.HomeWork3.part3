package com.example.a3_monthhomework3part3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList <String> adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loaData();
        AdressAdapter adapter = new AdressAdapter(adress);
        recyclerView.setAdapter(adapter);
    }

    private void loaData () {
        adress = new ArrayList<>();
        adress.add("Kulieva-1");
        adress.add("Kulieva-2");
        adress.add("Kulieva-3");
        adress.add("Kulieva-4");
        adress.add("Kulieva-5");
        adress.add("Kulieva-6");
        adress.add("Kulieva-7");
        adress.add("Kulieva-8");
        adress.add("Kulieva-9");
        adress.add("Kulieva-10");
        adress.add("Kulieva-11");
        adress.add("Kulieva-12");
        adress.add("Kulieva-13");
        adress.add("Kulieva-14");
        adress.add("Kulieva-15");
        adress.add("Kulieva-16");
        adress.add("Kulieva-17");
        adress.add("Kulieva-18");
        adress.add("Kulieva-19");
        adress.add("Kulieva-20");
        adress.add("Kulieva-21");

    }
}