package com.example.imagesend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView im;
    Button b1;
    TextView t1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im = findViewById(R.id.iv);
        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.tv1);
        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);
    }

    public void Bclicked(View v) {
        if ((e1.getText().toString().equals("12345")) && (e2.getText().toString().equals("abc")))
        {
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
        } else
            Toast.makeText(getApplicationContext(), "Wrong number or password", Toast.LENGTH_LONG).show();
    }
}
