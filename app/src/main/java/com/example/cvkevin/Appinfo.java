package com.example.cvkevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class Appinfo extends AppCompatActivity {

    public static String EXTRA_TITLE = "Extra_Title";
    public static String EXTRA_DESC  = "Extra_desc";
    private RecyclerView rc_mod;
    private ArrayList<Modul> list = new ArrayList<>();
    private TextView tx_tit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appinfo);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        this.setTitle("App Info");

        tx_tit = findViewById(R.id.title_modul);

        rc_mod = findViewById(R.id.rc_modul);
        rc_mod.setHasFixedSize(true);

        list.addAll(List_modul.getListData());
        showModul();



    }

    private void showModul() {

        rc_mod.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(list);
        rc_mod.setAdapter(recyclerAdapter);

    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
