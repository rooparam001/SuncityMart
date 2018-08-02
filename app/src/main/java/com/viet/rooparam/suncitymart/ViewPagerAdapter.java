package com.viet.rooparam.suncitymart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> mfragmentlist = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentlist.size();
    }

    public void addFragment(Fragment fragment) {
        mfragmentlist.add(fragment);
    }
}
