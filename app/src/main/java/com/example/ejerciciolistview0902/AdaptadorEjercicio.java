package com.example.ejerciciolistview0902;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejerciciolistview0902.Ejercicio;
import com.example.ejerciciolistview0902.R;

import java.util.ArrayList;

/**
 * Created by DIDACT on 09/02/2018.
 */

public class AdaptadorEjercicio extends ArrayAdapter<Ejercicio> {

    ArrayList<Ejercicio> ejercicios;
    Context c;

    public AdaptadorEjercicio(Context c, ArrayList<Ejercicio> ejercicios){
        super(c, R.layout.itemejercicio, ejercicios);
        this.c = c;
        this.ejercicios = ejercicios;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.itemejercicio,null);

        //TextView Ejercicio
        TextView tvejercicio=(TextView)item.findViewById(R.id.tvEjercicio);
        tvejercicio.setText(ejercicios.get(position).getNombre());

        //TextView Rep
        TextView tvpesom=(TextView)item.findViewById(R.id.tvRep);
        tvpesom.setText(ejercicios.get(position).getRep());

        //TextView Repmax
        TextView tvpeso=(TextView)item.findViewById(R.id.tvRepmax);
        tvpeso.setText(ejercicios.get(position).getRepmax());
        

        //ImageView
        String imagen = ejercicios.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen, "drawable",c.getPackageName());

        ImageView iv_imagen = (ImageView)item.findViewById(R.id.ivimagen);

        iv_imagen.setImageResource(idImagen);

        return item;
    }
}
