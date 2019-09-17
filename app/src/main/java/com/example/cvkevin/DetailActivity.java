package com.example.cvkevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvTitle, tvDesc;
    public static String EXTRA_TITLE = "Extra_Title";
    public static String EXTRA_DESC = "Extra_Desc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle(getIntent().getStringExtra(EXTRA_TITLE));

        tvTitle = findViewById(R.id.tit_modul);
        tvDesc = findViewById(R.id.det_desc);

        tvTitle.setText(getIntent().getStringExtra(EXTRA_TITLE));
        tvDesc.setText(getIntent().getStringExtra(EXTRA_DESC));
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
