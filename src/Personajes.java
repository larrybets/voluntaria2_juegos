/**
 * Created by DAM on 11/11/16.
 */
public class Personajes implements Funciones {
    private String nick;
    private int ataque;
    private int defensa;

    public Personajes(String nick, int ataque, int defensa) {
        this.nick = nick;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }




    @Override
    public String DameNombre() {
        return nick;
    }

    @Override
    public double CalcularPoder() {
        return (ataque/defensa);
    }
}
