package com.example.gio.bigproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Copyright by Gio.
 * Created on 4/14/2017.
 */

class ViewPagerMarkerAdapter extends FragmentStatePagerAdapter{
    private int count = MockData.RESULT_COUNT;

    public ViewPagerMarkerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ViewPagerMarker().getPosition(position);
    }

    @Override
    public int getCount() { return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return String.valueOf(position);
    }

    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
