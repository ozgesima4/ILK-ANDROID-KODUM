package com.simaalcin.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clickImage(View view)
    {
        ImageView imageview=findViewById(R.id.imageView);
        imageview.setImageResource(R.drawable.metalica);
    }


}