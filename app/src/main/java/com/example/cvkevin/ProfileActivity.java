package com.example.cvkevin;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle("Profile");


        ArrayList<Fragment>fragments = new ArrayList<>();

        fragments.add(new BlankFragment());
        fragments.add(new BlankFragment2());

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),fragments);


        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(fragmentAdapter);
        TabLayout tabLayout = findViewById(R.id.tblayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.colorTextLight));
        tabLayout.setTabTextColors(getResources().getColor(R.color.hintColorTextLight), getResources().getColor(R.color.colorTextLight));
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
