package com.example.rishabh.socialstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
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
        als.add("SchoolActivity");
        als.add("Brush Your Tooth");
        als.add("Play with friends");
        als.add("Birthday");
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,als);
        listView=findViewById(R.id.lview1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    startActivity(new Intent(getApplicationContext(),ImageActivity.class));
                }
                else if(i==1){
                    startActivity(new Intent(getApplicationContext(),BrushToothActivity.class));
                }
                else if(i==2){
                    startActivity(new Intent(getApplicationContext(),PlayGameActivity.class));
                }
                else if(i==3){
                    startActivity(new Intent(getApplicationContext(),BirthdayActivity.class));
                }
            }
        });

        //animating TextView
        categoryText=findViewById(R.id.categoryText1);
        sequential=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
        categoryText.startAnimation(sequential);

    }
}
