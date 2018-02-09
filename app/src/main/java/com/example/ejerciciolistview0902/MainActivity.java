package com.example.ejerciciolistview0902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEjercicios;

    TextView tvejercicio, tvrep, tvrepmax;
    ImageView ivimagen;

    ArrayList<Ejercicio> lista_ejercicios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvejercicio = (TextView)findViewById(R.id.tvIEjercicio);
        tvrep = (TextView)findViewById(R.id.tvIRep);
        tvrepmax = (TextView)findViewById(R.id.tvIRepmax);

        ivimagen = (ImageView)findViewById(R.id.ivIimagen);


        cargarDatos();

        lvEjercicios=(ListView)findViewById(R.id.lvEjercicios);

        AdaptadorEjercicio adaptadorEjercicio = new AdaptadorEjercicio(this, lista_ejercicios);
        lvEjercicios.setAdapter(adaptadorEjercicio);

        lvEjercicios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ejercicio ejer =((Ejercicio)parent.getItemAtPosition(position));
                String nombre = ejer.getNombre();
                tvejercicio.setText("Ejercicio: "+nombre);
                String rep =ejer.getRep();
                tvrep.setText("Rep. habitual: "+rep);
                String repmax =ejer.getRepmax();
                tvrepmax.setText("RM: "+repmax);
                String imagen =ejer.getImagen();
               int idImg= getApplicationContext().getResources().getIdentifier(imagen, "drawable",getApplicationContext().getPackageName());
            ivimagen.setImageResource(idImg);
            }
        });

    }

    private void cargarDatos(){
        lista_ejercicios.add(new Ejercicio("Dominada","Sin peso", "10kg", "dominada"));
        lista_ejercicios.add(new Ejercicio("Snatch","30kg", "40kg", "snatch"));
        lista_ejercicios.add(new Ejercicio("Power clean","40kg", "55kg", "clean"));
        lista_ejercicios.add(new Ejercicio("Jerk","35kg", "55kg", "jerk"));
        lista_ejercicios.add(new Ejercicio("Balón pared","7kg", "12kg", "balon"));

    }
}
