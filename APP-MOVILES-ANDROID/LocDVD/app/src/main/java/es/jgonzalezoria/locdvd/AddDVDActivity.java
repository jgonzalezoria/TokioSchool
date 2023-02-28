package es.jgonzalezoria.locdvd;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddDVDActivity extends Activity {

    EditText editTituloPelicula;
    EditText editAnyo;
    EditText editResumen;
    Button btnAddActor;
    Button btnOK;
    LinearLayout addActoresLayout;

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
        addActoresLayout = (LinearLayout) findViewById(R.id.addDVD_addActorLayout);

        //Declaración del OnClickListener
        btnAddActor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                addActor(null);
            }
        });

        //¿es una recreación tras una rotación de pantalla?
        if(savedInstanceState != null){
            String [] actores = savedInstanceState.getStringArray("actores");
            for(String s: actores){
                addActor(s);
            }
        }
        else{
            //ningún actor introducido, se muestra un componente editText vacío
            addActor(null);
        }

    }

    @Override
    public void onSaveInstanceState (Bundle savedInstanceState){
        String [] actores = new String[addActoresLayout.getChildCount()];
        for(int i = 0;i < addActoresLayout.getChildCount();i++){
            View child = addActoresLayout.getChildAt(i);
            if(child instanceof EditText){
                actores[i] = ((EditText)child).getText().toString();
            }
        }
        savedInstanceState.putStringArray("actores", actores);
        super.onSaveInstanceState(savedInstanceState);
    }

    private void addActor(String content){
        EditText editNewActor = new EditText(this);
        editNewActor.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME|InputType.TYPE_TEXT_FLAG_CAP_WORDS);
        if(content != null){
            editNewActor.setText(content);
        }
        addActoresLayout.addView(editNewActor);
    }

}
