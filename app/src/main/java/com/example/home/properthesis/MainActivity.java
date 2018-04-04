package com.example.home.properthesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseReference mlogin = FirebaseDatabase.getInstance().getReference();
    }


    public void login(View v) {


    }

    public void register(View v){

        FirebaseDatabase mlogin = FirebaseDatabase.getInstance();
        DatabaseReference myRef = mlogin.getReference("joey");

        myRef.setValue("5");

        Intent myIntent = new Intent(MainActivity.this,
                register.class);
        startActivity(myIntent);

    }
}
