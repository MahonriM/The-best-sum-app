package com.example.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtnum,txtnum2,txtres;
    Button btnsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnum=(EditText) findViewById(R.id.txtnum);
        txtnum2=(EditText) findViewById(R.id.txtnum2);
        txtres=(EditText) findViewById((R.id.txtres));
        btnsuma=(Button) findViewById(R.id.btnsuma);
        btnsuma.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int valo1=Integer.parseInt(String.valueOf(txtnum.getText()));
        int valo2=Integer.parseInt(String.valueOf(txtnum2.getText()));
        int r=valo1+valo2;
        txtres.setText("La suma es"+ r);

    }
}