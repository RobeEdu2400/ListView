package com.example.roberto.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Roberto on 11/01/2017.
 */

class AdaptadorTitulares extends ArrayAdapter<Titular> {

    Titular[] datos;
    int[] imagenes;
    Context context;

    public AdaptadorTitulares(Context context, Titular[] datos,int[] imagenes) {
        super(context, R.layout.listitem_titular, datos);
        this.datos = datos;
        this.imagenes = imagenes;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listitem_titular, null);

        ImageView imagen = (ImageView)item.findViewById(R.id.icon);
        imagen.setImageResource(imagenes[position]);

        TextView lblTitulo = (TextView) item.findViewById(R.id.LblTitulo);
        lblTitulo.setText(datos[position].getTitulo());


        TextView lblSubtitulo = (TextView) item.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(datos[position].getSubtitulo());

        return (item);
    }
}