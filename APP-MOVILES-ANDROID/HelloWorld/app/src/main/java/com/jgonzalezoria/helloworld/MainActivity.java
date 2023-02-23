package com.jgonzalezoria.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText edittextMensaje;
    private Button buttonEnviar;
    private TextView textViewMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittextMensaje = (EditText) findViewById(R.id.edittext_mensaje);
        buttonEnviar = (Button) findViewById(R.id.button_enviar);
        textViewMensaje = (TextView) findViewById(R.id.textview_mensaje);


    }

    @Override
    public void onClick(View v) {
        if(v == buttonEnviar){
            String mensajeRecibido = edittextMensaje.getText().toString();
            textViewMensaje.setText(mensajeRecibido);
            edittextMensaje.setText("");
        }
    }
}