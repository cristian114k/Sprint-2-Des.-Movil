package com.example.sprint2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sprint2.Adaptadores.ProductoAdaptador;
import com.example.sprint2.Entidades.Producto;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {

    private ListView listViewP;
    private ProductoAdaptador productoAdaptador;
    private ArrayList<Producto> arrayP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        arrayP = new ArrayList<>();

        Producto product1 = new Producto("iPhone 11", "128 GB Negro ", 100, R.drawable.producto1);
        Producto product2 = new Producto("SAMSUNG S20 FE", "128 GB 5G Azul", 2000, R.drawable.p2);
        Producto product3 = new Producto("MOTOROLA G22", "128 GB Blanco", 3000, R.drawable.p3);
        Producto product4 = new Producto("iPhone 11", "128 GB Blanco", 3000, R.drawable.p4);
        Producto product5 = new Producto( "OPPO Reno 7", "128 GB Azul", 5000, R.drawable.p5);
        Producto product6 = new Producto( "KALLEY Black G", "64 GB Negro", 6000, R.drawable.p6);
        Producto product7 = new Producto( "XIAOMI 11 Lite NE US", "128 GB Negro", 7000, R.drawable.p7);
        Producto product8 = new Producto( "Vivo V25", "128GB+8GB 5G Dorado+Tws Air", 8000, R.drawable.p8);
        Producto product9 = new Producto( "HONOR X7", "128 GB Gris", 9000, R.drawable.p9);

        arrayP.add(product1);
        arrayP.add(product2);
        arrayP.add(product3);
        arrayP.add(product4);
        arrayP.add(product5);
        arrayP.add(product6);
        arrayP.add(product7);
        arrayP.add(product8);
        arrayP.add(product9);



        productoAdaptador = new ProductoAdaptador(this,arrayP);
        listViewP = (ListView) findViewById(R.id.listViewListado);

        listViewP.setAdapter(productoAdaptador);


    }
}