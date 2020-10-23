package com.example.exe2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {
    EditText iD_login;
    EditText iD_senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iD_login = (EditText) findViewById(R.id.id_login);
        iD_senha = (EditText) findViewById(R.id.id_senha);


    }

    public void onLoginClick(View view){
        String usuario = iD_login.getText().toString();
        String senha = iD_senha.getText().toString();

        if(usuario.equals("admin") && senha.equals("Ad1m3n")){
            Intent couvert = new Intent(MainActivity.this, EXE2_calc.class);
        }else{

            showMessage("Erro!","Usuario e Senha incorretos");
        }
    }

    private void showMessage(String titulo, String alerta) {
        AlertDialog.Builder diag = new AlertDialog.Builder(this);
        diag.setTitle(titulo);
        diag.setMessage(alerta);
        diag.setNeutralButton("OK", null);
        diag.show();
    }



}