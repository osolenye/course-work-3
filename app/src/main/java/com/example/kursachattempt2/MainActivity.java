package com.example.kursachattempt2;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button buttonRegistration;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickRegistration(View view) {
        buttonRegistration = findViewById(R.id.buttonRegistration);
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

    public void onClickLogin(View view) {
        buttonLogin = findViewById(R.id.buttonLogin);
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}

