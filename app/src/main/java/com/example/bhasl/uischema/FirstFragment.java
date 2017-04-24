package com.example.bhasl.uischema;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

//First Fragment
public class FirstFragment extends Fragment {
    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static com.example.bhasl.uischema.FirstFragment newInstance(int page, String title) {
        com.example.bhasl.uischema.FirstFragment fragmentFirst = new com.example.bhasl.uischema.FirstFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ImageView slideview = (ImageView) view.findViewById(R.id.hit);
        Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(www.xpatloop.com/UserFiles/SouthWest_Burger.jpg).getContent());
        slideview.setImageBitmap(bitmap);

        return view;
    }
}