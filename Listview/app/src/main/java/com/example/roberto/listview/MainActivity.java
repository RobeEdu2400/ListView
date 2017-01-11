package com.example.roberto.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Titular[] datos =
            new Titular[]{
                    new Titular("Título 1", "Subtítulo largo 1"),
                    new Titular("Título 2", "Subtítulo largo 2"),
                    new Titular("Título 3", "Subtítulo largo 3"),
                    new Titular("Título 4", "Subtítulo largo 4"),
                    };
    final int[] imagenes ={
            R.mipmap.c,
            R.mipmap.go,
            R.mipmap.java,
            R.mipmap.javascript
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//...

        AdaptadorTitulares adaptador =
                new AdaptadorTitulares(this, datos,imagenes);

        ListView lstOpciones = (ListView)findViewById(R.id.LstOpciones);

        lstOpciones.setAdapter(adaptador);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Titular Nombre= (Titular)parent.getAdapter().getItem(position);

                String Titulo1 =Nombre.getTitulo();

                Toast.makeText(getApplicationContext(),"Has clickeado el cliente"+Titulo1,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
