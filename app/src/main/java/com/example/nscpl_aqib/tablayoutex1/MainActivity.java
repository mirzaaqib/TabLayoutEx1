package com.example.nscpl_aqib.tablayoutex1;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        createViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        createTabIcons();
    }


    public void createViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter=new ViewPagerAdapter (getSupportFragmentManager());
        adapter.addFrag(new Fragment1(), "Name");
         adapter.addFrag(new Fragment2(), "Course");
        adapter.addFrag(new Fragment3(), "Dept");
        adapter.addFrag(new Fragment4(), "College");
        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentTitleList.size();
        }
        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public void createTabIcons() {
        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Name");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_mood_black_24dp, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);
        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Course");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_font_download_black_24dp, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);
        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Deptt");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_location_city_black_24dp, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
        TextView tabFourth = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabFourth.setText("College");
        tabFourth.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_domain_black_24dp, 0, 0);
        tabLayout.getTabAt(3).setCustomView(tabFourth);
    }

}
