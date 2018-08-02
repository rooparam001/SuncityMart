package com.viet.rooparam.suncitymart;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GettingStartedActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started);

        viewPager = findViewById(R.id.getting_started_viewpager);
        setViewPager(viewPager);

    }

    private void setViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new GettingStartedFragment());
        viewPager.setAdapter(viewPagerAdapter);
    }
}
