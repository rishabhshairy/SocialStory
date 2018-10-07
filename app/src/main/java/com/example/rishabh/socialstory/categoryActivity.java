package com.example.rishabh.socialstory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class categoryActivity extends AppCompatActivity {
    ArrayList<String> als;
    ArrayAdapter<String> adapter;
    ListView listView;
    Animation sequential;
    TextView categoryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        als=new ArrayList<>();
        als.add("Hello");
        als.add("Friends");
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,als);
        listView=findViewById(R.id.lview1);

        listView.setAdapter(adapter);

        //animating TextView
        categoryText=findViewById(R.id.categoryText1);
        sequential=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
        categoryText.startAnimation(sequential);

    }
}
