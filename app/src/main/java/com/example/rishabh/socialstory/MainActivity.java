package com.example.rishabh.socialstory;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wel1,wel2,wel3;
    MaterialButton starts;
    Animation sequential,fadein, slideup;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wel1=findViewById(R.id.welcome);
        wel2=findViewById(R.id.welcome2);
        wel3=findViewById(R.id.welcome3);
        i=new Intent(this,categoryActivity.class);
        starts=(MaterialButton) findViewById(R.id.starts);
        starts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(i);

            }
        });

        sequential=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
        fadein=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
        slideup=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup);
        wel1.startAnimation(fadein);
        wel2.startAnimation(fadein);
        wel3.startAnimation(fadein);
        starts.setAnimation(slideup);
    }

}
