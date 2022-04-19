package com.example.musicapp.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    //dùng để add vào các fragment
    private ArrayList<Fragment> arrayFragment = new ArrayList<>();
    //hiển thị title cho fragment khi vuốt
    private ArrayList<String> arrayTitle = new ArrayList<>();

    public MainViewPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        //trả về vị trí fragment khi click vào
        return arrayFragment.get(position);
    }

    @Override
    public int getCount() {
        //trả về kích thước fragment
        return arrayFragment.size();
    }

    //hàm để add vào fragment
    public void addFragment(Fragment fragment, String title) {
        arrayFragment.add(fragment);
        arrayTitle.add(title);
    }
    //hàm hiển thị tên page trên tab

    @Nullable
    @androidx.annotation.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrayTitle.get(position);
    }

}
