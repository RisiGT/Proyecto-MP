package practicamp;

import personajes.Personaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Usuario extends Persona implements Serializable {

    private String nombre;
    private String password;
    private String nick;
    private String LNNLL;
    private List<Personaje> personajes = new ArrayList<>();
    private int oro;
    private boolean estado; //true baneado, false normal

    public Usuario(String nombre, String pass, String nick) {
        this.LNNLL = this.CrearLNNLL();
        this.nombre = nombre;
        this.estado = false;
        this.password = pass;
        this.nick = nick;
        this.oro = 1000;//oro inicial
        this.personajes = new ArrayList<>();
    }

    public void RestarOro(int oroPerdido) {
        if ((oro - oroPerdido) >= 0) {
            oro = oro - oroPerdido;
        } else {
            oro = 0;
        }
    }

    @Override
    public boolean isDev() {
        return false;
    }

    public String CrearLNNLL() {
        String code = "";
        Integer aux;
        Character aux2;
        Random rand = new Random();
        aux2 = (char) (rand.nextInt(26) + 'a');
        code = aux2.toString();
        aux = rand.nextInt(9);
        code = code + aux.toString();
        aux = rand.nextInt(9);
        code = code + aux.toString();
        aux2 = (char) (rand.nextInt(26) + 'a');
        code = code + aux2.toString();
        aux2 = (char) (rand.nextInt(26) + 'a');
        code = code + aux2.toString();
        return code;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPassword() {
        return password;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public Personaje getPersonaje(String nombre) {
        for (Personaje personaje : personajes) {
            if (personaje.getNombre().equals(nombre)) {
                return personaje;
            }
        }
        return null;
    }
    public void actualizarPersonaje(Personaje p) {
        for (Personaje list : personajes) {
            if ((list.getNombre().equals(p.getNombre()))) {
                personajes.remove(list);
                personajes.add(p);
                break;
            }
        }
    }
    public int getOro() {
        return oro;
    }

}
