package com.example.musicapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.musicapp.Adapter.MainViewPagerAdapter;
import com.example.musicapp.Fragment.Fragment_Tim_Kiem;
import com.example.musicapp.Fragment.Fragment_Trang_Chu;
import com.example.musicapp.R;

public class MainActivity extends AppCompatActivity {
    //ánh xạ 2 view
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        init();
    }

    private void init() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_Trang_Chu(), "Trang Chủ");
        mainViewPagerAdapter.addFragment(new Fragment_Tim_Kiem(), "Tìm kiếm");
        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
        tabLayout.getTabAt(1).setIcon(R.drawable.icontimkiem);
    }

    private void anhxa() {
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewPager);
    }
}