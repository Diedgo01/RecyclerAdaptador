package com.example.recycleradaptador.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleradaptador.DetallePersonaje;
import com.example.recycleradaptador.R;
import com.example.recycleradaptador.datos.datosPersonajes;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class personajeAdaptador extends RecyclerView.Adapter<personajeAdaptador.ViewHolder> {

    private ArrayList<datosPersonajes> personajes;
    private Context context;
    private String[] titulos;


    public personajeAdaptador(Context context, ArrayList<datosPersonajes> personajes) {
        this.context = context;
        this.personajes = personajes;
        this.titulos = context.getResources().getStringArray(R.array.personajes_titulos);
    }

    @NonNull
    @Override
    public personajeAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_personajes, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull personajeAdaptador.ViewHolder holder, int position) {
        datosPersonajes personajes1 = personajes.get(position);
    holder.txt_nombre.setText(personajes1.getNombre());
    holder.txt_ocupa.setText(personajes1.getOcupacion());
    holder.txt_grado.setText(personajes1.getGrado());
    Picasso.get().load(personajes1.getImagen()).into(holder.img_personaje);
    holder.txt_titulo.setText(titulos[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetallePersonaje.class);
                intent.putExtra("nombre", personajes1.getNombre());
                intent.putExtra("ocupacion", personajes1.getOcupacion());
                intent.putExtra("grado", personajes1.getGrado());
                intent.putExtra("imagen", personajes1.getImagen());
                intent.putExtra("descripcion", personajes1.getDescripcion());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return personajes.size()  ;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_personaje;
        TextView txt_nombre, txt_ocupa, txt_grado, txt_titulo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_personaje = itemView.findViewById(R.id.img_personaje);
            txt_nombre = itemView.findViewById(R.id.txt_nombre);
            txt_ocupa = itemView.findViewById(R.id.txt_ocupa);
            txt_grado = itemView.findViewById(R.id.txt_grado);
            txt_titulo = itemView.findViewById(R.id.txt_titulo);
        }
    }
}
