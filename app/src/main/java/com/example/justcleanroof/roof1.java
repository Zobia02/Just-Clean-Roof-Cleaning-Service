package com.example.justcleanroof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class roof1 extends AppCompatActivity {
    String sq,adress,contact;
    EditText t,a,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roof1);
        t = findViewById(R.id.editTextTextPersonName);
        a = findViewById(R.id.editTextTextPersonName2);
        c = findViewById(R.id.editTextTextPersonName3);
    }





    public void book(View view) {
        String sq=t.getEditableText().toString();
        String adress=a.getEditableText().toString();
        String contact=c.getEditableText().toString();


        if (sq.isEmpty()){ t.setError("please enter the area!!!");
            t.requestFocus();
            return;



        }
        if (adress.isEmpty()){ a.setError("please enter the  address!!!");
            a.requestFocus();
            return;



        }
        if (contact.isEmpty()){ c.setError("please enter the contact!!!");
            c.requestFocus();
            return;



        }







        Intent i=new Intent(this,bookroof.class);



        i.putExtra("sqft",sq);
        startActivity(i);}

}