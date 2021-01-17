package com.example.good;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button road, bow, school, popular, temple, hotel, river, send, forest, grave, hospital, hometown, church, factory, harbor, research;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        road = findViewById(R.id.road);
        bow = findViewById(R.id.bow);
        school = findViewById(R.id.school);
        popular = findViewById(R.id.popular);
        temple = findViewById(R.id.temple);
        hotel = findViewById(R.id.hotel);
        river = findViewById(R.id.river);
        send = findViewById(R.id.send);
        forest = findViewById(R.id.forest);
        grave = findViewById(R.id.grave);
        hospital = findViewById(R.id.hospital);
        hometown = findViewById(R.id.hometown);
        church = findViewById(R.id.church);
        factory = findViewById(R.id.factory);
        harbor = findViewById(R.id.harbor);
        research = findViewById(R.id.research);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.road:
                        Intent intent1 = new Intent(MainActivity.this, road.class);
                        startActivity(intent1);
                        break;

                    case R.id.bow:
                        Intent intent2 = new Intent(MainActivity.this , bow.class);
                        startActivity(intent2);
                        break;

                    case R.id.school:
                        Intent intent3 = new Intent(MainActivity.this , school.class);
                        startActivity(intent3);
                        break;

                    case R.id.popular:
                        Intent intent4 = new Intent(MainActivity.this , popular.class);
                        startActivity(intent4);
                        break;

                    case R.id.temple:
                        Intent intent5 = new Intent(MainActivity.this , temple.class);
                        startActivity(intent5);
                        break;

                    case R.id.hotel:
                        Intent intent6 = new Intent(MainActivity.this , hotel.class);
                        startActivity(intent6);
                        break;

                    case R.id.river:
                        Intent intent7 = new Intent(MainActivity.this , river.class);
                        startActivity(intent7);
                        break;

                    case R.id.send:
                        Intent intent8 = new Intent(MainActivity.this , send.class);
                        startActivity(intent8);
                        break;

                    case R.id.forest:
                        Intent intent9 = new Intent(MainActivity.this , forest.class);
                        startActivity(intent9);
                        break;

                    case R.id.grave:
                        Intent intent10 = new Intent(MainActivity.this , grave.class);
                        startActivity(intent10);
                        break;

                    case R.id.hospital:
                        Intent intent11 = new Intent(MainActivity.this , hospital.class);
                        startActivity(intent11);
                        break;

                    case R.id.hometown:
                        Intent intent12 = new Intent(MainActivity.this , hometown.class);
                        startActivity(intent12);
                        break;

                    case R.id.church:
                        Intent intent13 = new Intent(MainActivity.this , church.class);
                        startActivity(intent13);
                        break;

                    case R.id.factory:
                        Intent intent14 = new Intent(MainActivity.this , factory.class);
                        startActivity(intent14);
                        break;

                    case R.id.harbor:
                        Intent intent15 = new Intent(MainActivity.this , harbor.class);
                        startActivity(intent15);
                        break;

                    case R.id.research:
                        Intent intent16 = new Intent(MainActivity.this , research.class);
                        startActivity(intent16);
                        break;
                }
            }
        };

        road.setOnClickListener(onClickListener);
        bow.setOnClickListener(onClickListener);
        school.setOnClickListener(onClickListener);
        popular.setOnClickListener(onClickListener);
        temple.setOnClickListener(onClickListener);
        hotel.setOnClickListener(onClickListener);
        river.setOnClickListener(onClickListener);
        send.setOnClickListener(onClickListener);
        forest.setOnClickListener(onClickListener);
        grave.setOnClickListener(onClickListener);
        hospital.setOnClickListener(onClickListener);
        hometown.setOnClickListener(onClickListener);
        church.setOnClickListener(onClickListener);
        factory.setOnClickListener(onClickListener);
        harbor.setOnClickListener(onClickListener);
        research.setOnClickListener(onClickListener);

    }
}