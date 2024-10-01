package com.example.recycleradaptador;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class DetallePersonaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalle_personaje);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String ocupacion = intent.getStringExtra("ocupacion");
        String grado = intent.getStringExtra("grado");
        String imagen = intent.getStringExtra("imagen");
        String descripcion = intent.getStringExtra("descripcion");

        TextView txtNombre = findViewById(R.id.txt_nombre_detalle);
        TextView txtOcupacion = findViewById(R.id.txt_ocupa_detalle);
        TextView txtGrado = findViewById(R.id.txt_grado_detalle);
        TextView txtDescripcion = findViewById(R.id.txt_descripcion_detalle);
        ImageView imgPersonaje = findViewById(R.id.img_personaje_detalle);

        txtNombre.setText(nombre);
        txtOcupacion.setText(ocupacion);
        txtGrado.setText(grado);
        txtDescripcion.setText(descripcion);
        Picasso.get().load(imagen).into(imgPersonaje);
    }
}