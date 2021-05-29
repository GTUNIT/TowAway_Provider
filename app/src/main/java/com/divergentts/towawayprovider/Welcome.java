package com.divergentts.towawayprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    public void begin (View view) {
        Intent providerdetails = new Intent(this, com.divergentts.towawayprovider.ProviderDetails.class);
        startActivity(providerdetails);

    }

    public void back(View view) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }


}