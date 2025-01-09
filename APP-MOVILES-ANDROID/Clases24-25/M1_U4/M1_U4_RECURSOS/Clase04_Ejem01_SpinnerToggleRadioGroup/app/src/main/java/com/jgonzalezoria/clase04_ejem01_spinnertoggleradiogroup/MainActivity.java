package com.jgonzalezoria.clase04_ejem01_spinnertoggleradiogroup;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ly_principal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ((ToggleButton)findViewById(R.id.tb_encendido)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Snackbar.make(compoundButton, "El estado del botón es: " + b, Snackbar.LENGTH_LONG).show();
            }
        });

        ((RadioGroup)findViewById(R.id.rg_opciones)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Snackbar.make(radioGroup, "El id del botón seleccionado es: " + i, Snackbar.LENGTH_LONG).show();
                /*
                switch (i){
                    case R.id.rb_opcion1:
                        Snackbar.make(radioGroup, "Ha seleccionado la opción 1", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.rb_opcion2:
                        Snackbar.make(radioGroup, "Ha seleccionado la opción 2", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.rb_opcion3:
                        Snackbar.make(radioGroup, "Ha seleccionado la opción 3", Snackbar.LENGTH_LONG).show();
                        break;
                    default:
                        Snackbar.make(radioGroup, "Ha seleccionado la opción por defecto", Snackbar.LENGTH_LONG).show();
                }

                 */
            }
        });

        ((Spinner)findViewById(R.id.spinner)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Snackbar.make(adapterView, "El elemento seleccionado es: " + adapterView.getItemAtPosition(i), Snackbar.LENGTH_LONG).show();

                Log.d("depurando", ((TextView)view).getText().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}