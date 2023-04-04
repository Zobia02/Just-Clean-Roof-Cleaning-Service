package com.example.justcleanroof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class roofcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roofcategory);
    }


    public void roofdeliver(View view) {
        Intent i=new Intent(this,roofdilevery.class);
        startActivity(i);

    }

    public void roofdelivery1(View view) {
        Intent a=new Intent(this,roof1.class);
        startActivity(a);
    }
}