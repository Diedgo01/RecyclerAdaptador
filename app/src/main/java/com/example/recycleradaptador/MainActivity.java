package com.example.recycleradaptador;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleradaptador.adaptadores.personajeAdaptador;
import com.example.recycleradaptador.datos.datosPersonajes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ArrayList<datosPersonajes> personajes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.m_rcv);
        cargarDatos();
        personajeAdaptador adaptador = new personajeAdaptador(this, personajes);
        recyclerView.setAdapter(adaptador);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void cargarDatos(){
        String[] nombres = getResources().getStringArray(R.array.personajes_nomb);
        String[] ocupaciones = getResources().getStringArray(R.array.personajes_ocupa);
        String[] grados = getResources().getStringArray(R.array.personajes_gra);
        String[] imagenes = {
                "https://www.apolline.art/sites/default/files/styles/blog_detail/public/field/image/jujutsu-kaisen-vol-1.jpg?itok=_g7ivWvK",
                "https://animeonlineflix.com/wp-content/uploads/2024/06/Why-gojo-always-wear-blindfold.webp",
                "https://i.pinimg.com/originals/65/c7/d4/65c7d4ce7bdcf56022e3034895fdc01d.jpg",
                "https://i.pinimg.com/1200x/93/54/5d/93545d75ca02bf8a808dd8a87b517c2d.jpg",
                "https://i0.wp.com/codigoespagueti.com/wp-content/uploads/2023/12/jujutsu-kaisen-sukuna-es-maldicion.jpg?w=1280&ssl=1",
                "https://i0.wp.com/codigoespagueti.com/wp-content/uploads/2023/07/jujutsu-kaisen-suguru-geto-quien-es.jpg?w=1280&ssl=1",
                "https://elcomercio.pe/resizer/v2/DWU3MWWRLJF5HAV74FHSZPOV4Y.jpg?auth=066317ee7d836717003df1349a5cdb7ee55bf85172be61dfc64a8d2654908bc1&width=1200&height=810&quality=90&smart=true",
                "https://animeonlineflix.com/wp-content/uploads/2024/07/Kugisaki-resonance.webp",
                "https://animeonlineflix.com/wp-content/uploads/2024/06/Todo-Aoi.webp",
                "https://www.fayerwayer.com/resizer/v2/IX45YXDVCBGBBJTMOZB56WPWLM.jpg?smart=true&auth=072994ce85cd4c579a9f4354f4cd2466de486f4ae1b2a872f1456fd485455d93&width=1440&height=808"
        };
        String[] descripciones = {
                "Yuji Itadori es un chico increíblemente fuerte y valiente. Siempre está dispuesto a arriesgarlo todo por sus amigos y su sentido del deber es inquebrantable. ¡Es el tipo de héroe que todos quisiéramos ser!",
                "Gojo Satoru es el hechicero más poderoso y carismático. Con su técnica de maldición ilimitada y su actitud despreocupada, siempre roba el espectáculo. ¡Es imposible no admirarlo!",
                "Megumi Fushiguro es serio y reservado, pero su habilidad para manipular sombras es simplemente asombrosa. Siempre está listo para proteger a los demás, y su lealtad es inquebrantable.",
                "Nanami Kento es el profesional por excelencia. Con su habilidad para manipular sangre y su enfoque meticuloso, siempre mantiene la calma en las situaciones más difíciles. ¡Es un verdadero modelo a seguir!",
                "Ryōmen Sukuna es el rey de las maldiciones, y su poder es absolutamente aterrador. Cada vez que aparece, sabes que las cosas se van a poner intensas. ¡Es el villano que todos amamos odiar!",
                "Suguru Getō, antes un hechicero respetado, ahora usa sus habilidades para el mal. Su inteligencia y astucia lo hacen un enemigo formidable, y su historia es una de las más trágicas.",
                "Yūta Okkotsu es leal y valiente, con una habilidad impresionante para manipular sombras. Siempre está dispuesto a luchar por lo que cree, y su crecimiento como personaje es inspirador.",
                "Nobara Kugisaki es decidida y combativa, con habilidades de resonancia que la hacen única. Su determinación y espíritu luchador son inquebrantables, y siempre aporta una energía increíble al equipo.",
                "Aoi Todo es fuerte y confiado, con una técnica de maldición que le permite manipular la energía a su alrededor. Su fuerza bruta y su amor por la lucha lo hacen un personaje inolvidable.",
                "Maki Zenin es disciplinada y táctica, con un control preciso de la energía que la hace dominar en combate. Su determinación para superar las expectativas y su habilidad en batalla son excepcionales."
        };

        for (int i = 0; i < nombres.length; i++) {
            personajes.add(new datosPersonajes(imagenes[i], nombres[i], ocupaciones[i], grados[i], descripciones[i]));
        }
    }
}