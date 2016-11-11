/**
 * Created by DAM on 11/11/16.
 */
public class Usuario implements Funciones {
    private String nombre;
    private String apellidos;
    private Double altura;
    private Double peso;

    public Usuario(String nombre, String apellidos, Double altura, Double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellidos() {

        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String DameNombre() {
        return nombre;
    }

    @Override
    public double CalcularPoder() {
        return (peso / altura) * 8;
    }


}
