package it.digi.doma;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FormPagerAdapter extends FragmentStatePagerAdapter {
    public FormPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentForm1();
        } else if (position == 1) {
            return new FragmentForm2();
        } else if (position == 2) {
            return new FragmentForm3();
        }

        return new FragmentForm1();
    }

    @Override
    public int getCount() {
        return 3;
    }
}