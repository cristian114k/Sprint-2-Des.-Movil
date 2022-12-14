package com.example.sprint2.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sprint2.Entidades.Producto;
import com.example.sprint2.Info;
import com.example.sprint2.R;

import java.util.ArrayList;

public class ProductoAdaptador extends BaseAdapter {

    private Context contexto;
    private ArrayList<Producto> arrayProductos;

    public ProductoAdaptador(Context contexto, ArrayList<Producto> arrayProductos) {
        this.contexto = contexto;
        this.arrayProductos = arrayProductos;
    }

    @Override
    public int getCount() {
        return arrayProductos.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProductos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.contexto);
        view = layoutInflater.inflate(R.layout.plantilla_visualizacion,null);

        ImageView imgP = (ImageView) view.findViewById(R.id.imgPlantilla);
        TextView textNombrePlantilla = (TextView) view.findViewById(R.id.textNombrePlantilla);
        TextView textDescripcionPlantilla = (TextView) view.findViewById(R.id.textDescripcionPlantilla);
        TextView textPrecioPlantilla = (TextView) view.findViewById(R.id.textPrecioPlantilla);

        Producto producto = arrayProductos.get(i);

        imgP.setImageResource(producto.getImagen());
        textNombrePlantilla.setText(producto.getNombre());
        textDescripcionPlantilla.setText(producto.getDescripcion());
        textPrecioPlantilla.setText(String.valueOf(producto.getPrecio()));

        imgP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contexto.getApplicationContext(), Info.class);
                intent.putExtra("nombre",producto.getNombre());
                intent.putExtra("descripcion",producto.getDescripcion());
                intent.putExtra("precio",producto.getPrecio());
                intent.putExtra("imagen",producto.getImagen());
                contexto.startActivity(intent);
            }
        });

        return view;
    }
}
