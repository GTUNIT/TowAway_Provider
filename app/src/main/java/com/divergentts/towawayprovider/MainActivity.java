package com.divergentts.towawayprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void signup(View view) {
        Intent welcome = new Intent(this, com.divergentts.towawayprovider.Welcome.class);
        startActivity(welcome);

        
    }

    public void login(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("ONCREATE METHOD");
        // check if the provider exists by querying the Towaway database

        ConnectDB connectdb = new ConnectDB();
        connectdb.connecttaw();

    }
}