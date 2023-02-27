package es.jgonzalezoria.locdvd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewDVDActivity extends Activity{

    TextView txtTituloDVD;
    TextView txtAnyoDVD;
    TextView txtActor1;
    TextView txtActor2;
    TextView txtResumenPelicula;

    @Override
    protected void onCreate (Bundle savesInstanceState) {

        super.onCreate(savesInstanceState);

        //asignación del archivo de layout
        setContentView(R.layout.activity_viewdvd);

        //obtención de las referencias sobre las componentes
        txtTituloDVD = (TextView) findViewById(R.id.tituloDVD);
        txtAnyoDVD = (TextView) findViewById(R.id.anyoDVD);
        txtActor1 = (TextView) findViewById(R.id.actor1);
        txtActor2 = (TextView) findViewById(R.id.actor2);
        txtResumenPelicula = (TextView) findViewById(R.id.resumenPelicula);
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();

        txtTituloDVD.setText("Las vacaciones del pequeño Nicolas");
        txtAnyoDVD.setText(String.format(getString(R.string.anyo_de_aparicion), 2014));
        txtActor1.setText("Valérie Lemercier");
        txtActor2.setText("Kad Merad");
        String resumen = "Es el fin del año escolar. El momento tan esperado de las vacaciones "
                + "ha llegado. El pequeño Nicolás, sus padres y Memé toman la ruta en dirección "
                + "al mar y se instalan por un tiempo en el Hotel Beau-Rivage. En la playa, "
                + "Nicolás hace pronto nuevos amigos.";
        txtResumenPelicula.setText(resumen);
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}