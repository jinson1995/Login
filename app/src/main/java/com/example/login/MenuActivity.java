package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView txtusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        txtusuario = findViewById(R.id.txtusuario);
        Bundle bundle = getIntent().getExtras();
        String usuario = bundle.getString("usuario");

        txtusuario.setText("Hola : " + usuario);
    }
}
