import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DAM on 11/11/16.
 */
public class Main {

    public static void main(String[] args) {
        List<Funciones> misFunciones = new ArrayList<>();
        Usuario usuario = new Usuario("Carlos", "sanchez", 1.77, 77.3);
        misFunciones.add(usuario);

        Personajes personaje = new Personajes("Scalibur", 20, 20);
        misFunciones.add(personaje);

        for (Funciones u : misFunciones) {
            System.out.println("nombre \n" + u.DameNombre() + " poder \n " + u.CalcularPoder());
        }

    }
}
