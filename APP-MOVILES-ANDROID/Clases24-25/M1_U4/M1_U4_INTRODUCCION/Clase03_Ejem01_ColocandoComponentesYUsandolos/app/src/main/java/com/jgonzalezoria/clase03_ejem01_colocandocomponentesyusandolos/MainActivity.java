package com.jgonzalezoria.clase03_ejem01_colocandocomponentesyusandolos;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d("depurando", "Acaba de entrar");

        ((Button) findViewById(R.id.b_recogerNombre)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText casillaNombre = ((EditText)findViewById(R.id.et_nombre));
                String nombre = casillaNombre.getText().toString();

                Log.d("depurando", "Estoy en el onClick y el nombre es: " + nombre);

                ((TextView)findViewById(R.id.tv_nombre)).setText(nombre);
                casillaNombre.setText("");
            }
        });

        ((Switch)findViewById(R.id.sw_apagado)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d("depurando", "Consigo entrar en el OnCheckedChangeListener");
                ((Button)findViewById(R.id.b_recogerNombre)).setEnabled(b);
            }
        });
    }
}