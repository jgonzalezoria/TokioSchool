package es.jgonzalezoria.locdvd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddDVDActivity extends Activity {

    EditText editTituloPelicula;
    EditText editAnyo;
    EditText editResumen;
    Button btnAddActor;
    Button btnOK;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //asignación del archivo de layout
        setContentView(R.layout.activity_adddvd);

        //obtención de las referencias sobre los componentes
        editTituloPelicula = (EditText) findViewById(R.id.addDVD_titulo);
        editAnyo = (EditText) findViewById(R.id.addDVD_anyo);
        editResumen = (EditText) findViewById(R.id.addDVD_resumen);
        btnAddActor = (Button) findViewById(R.id.addDVD_addActor);
        btnOK = (Button) findViewById(R.id.addDVD_ok);
    }

}
