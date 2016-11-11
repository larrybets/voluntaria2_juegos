/**
 * Created by DAM on 11/11/16.
 */
public class Mascotas implements Funciones {

    private String tipo;
    private int nivelEntrenamiento;

    public Mascotas(String tipo, int nivelEntrenamiento) {
        this.tipo = tipo;
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    @Override
    public String DameNombre() {
        return null;
    }

    @Override
    public double CalcularPoder() {
        return 0;
    }
}
