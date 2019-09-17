package com.example.cvkevin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cr1, cr2, cr3, cr4, cr5, cr6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cr1 = findViewById(R.id.profile);
        cr2 = findViewById(R.id.contact);
        cr3 = findViewById(R.id.experience);
        cr4 = findViewById(R.id.skill);
        cr5 = findViewById(R.id.porto);
        cr6 = findViewById(R.id.info);


        cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });

        cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ExperienceActivity.class);
                startActivity(intent);

            }
        });

        cr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SkillActivity.class);
                startActivity(intent);

            }
        });

        cr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PortofolioActivity.class);
                startActivity(intent);

            }
        });

        cr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Appinfo.class);
                startActivity(intent);

            }
        });


    }
}
