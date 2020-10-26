package com.example.techsumtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.techsumtest.ui.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {


    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().hide();

        viewPager = findViewById(R.id.view_pager);


        List<Integer> imagelist=new ArrayList<>();
        imagelist.add(R.drawable.branding);
        imagelist.add(R.drawable.choose);
        imagelist.add(R.drawable.money);
        imagelist.add(R.drawable.socialmedia);
        imagelist.add(R.drawable.usher);


       MyAdapter myAdapter=new MyAdapter(imagelist);
        viewPager.setAdapter(myAdapter);

    }
}