package com.LNT.scientificcalc_unitc;

import android.support.v7.app.AppCompatActivity;



import android.media.Image;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> applicationName = new ArrayList<>(Arrays.asList("Scientific Calc","Unit Converter"));

    ArrayList<Integer> imageArray = new ArrayList<Integer>(Arrays.asList(R.drawable.image,R.drawable.download));
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,applicationName, imageArray);
        recyclerView.setAdapter(customAdapter);

    }
}