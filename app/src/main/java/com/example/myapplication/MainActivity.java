package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List <FIsh> fishes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFishesData();

        FishAdapter fishAdapter = new FishAdapter(fishes, this);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.recycler);

        recyclerView.setAdapter(fishAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void setFishesData() {

        fishes.add(new FIsh( "Карп,", "Саза́н, или обыкновенный карп, — вид пресноводных лучепёрых рыб семейства карповых. Методом селекции получены культурные формы.",
                "100000", R.drawable.carp_lol));
        fishes.add(new FIsh("Карась", "Караси — род лучепёрых рыб семейства карповых.", "400000", R.drawable.carassius_gibelio_2008_));
        fishes.add(new FIsh("Окунь", "Речно́й о́кунь, или обыкнове́нный окунь, — вид лучепёрых рыб рода пресноводных окуней семейства окунёвых. Речной окунь широко распространён в пресных водоёмах Европы и Северной Азии, завезён в Африку, Австралию и Новую Зеландию.",
                " 1092092", R.drawable.ocun ));

    }
}