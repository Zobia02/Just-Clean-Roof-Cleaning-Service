package com.example.justcleanroof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class bookroof1 extends AppCompatActivity {
    Button brush;
    TextView t ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookroof1);
        t=findViewById(R.id.textView11);
        Intent inteNT=getIntent() ;
        String b=inteNT.getStringExtra("sqft");
        int bill=Integer.valueOf(b)*500;
        String B=String.valueOf(bill);
        t.setText(B);
        t.setTextSize(20);
        brush=findViewById(R.id.brush);
        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ibrush=getPackageManager().getLaunchIntentForPackage("com.example.navdrawer");
                startActivity(Ibrush);
            }
        });



    }
}