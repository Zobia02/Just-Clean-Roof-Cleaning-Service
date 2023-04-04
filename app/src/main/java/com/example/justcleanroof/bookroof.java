package com.example.justcleanroof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class bookroof extends AppCompatActivity {
    Button wash;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookroof);
        t=findViewById(R.id.textView11);
        Intent inteNT=getIntent() ;
        String b=inteNT.getStringExtra("sqft");
        int bill=Integer.valueOf(b)*550;
        String B=String.valueOf(bill);
        t.setText(B);
        t.setTextSize(20);
        wash=findViewById(R.id.wash);
        wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Iwash=getPackageManager().getLaunchIntentForPackage("com.example.navdrawer");
                startActivity(Iwash);
            }
        });
    }
}