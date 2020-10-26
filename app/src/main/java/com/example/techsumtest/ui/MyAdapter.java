package com.example.techsumtest.ui;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.techsumtest.R;

import java.util.List;

public class MyAdapter extends PagerAdapter {

    List<Integer> list;

    public MyAdapter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public int getCount() {

        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater= LayoutInflater.from(container.getContext());
        View view=inflater.inflate(R.layout.my_image_view,container,false);
        ImageView image=view.findViewById(R.id.image_view);
        image.setImageResource(list.get(position));

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);

        container.removeView((View) object);
    }
}
