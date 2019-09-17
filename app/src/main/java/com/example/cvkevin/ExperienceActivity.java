package com.example.cvkevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExperienceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        this.setTitle("Experience");

    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
