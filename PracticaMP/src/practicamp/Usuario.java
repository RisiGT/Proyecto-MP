package practicamp;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona{
private String nombre;
private String password;
private String nick;
private String LNNLL;
private List<Personaje> personajes = new ArrayList();
private int oro;
private boolean estado; //true baneado, false normal

public Usuario (String nombre, String nick, String pass){
    //this.LNNLL=(generar aleatoriamente)
    this.nombre=nombre;
    this.estado=false;
    this.password=pass;
    this.nick=nick;
    this.oro=0;//oro inicial
    this.personajes=new ArrayList();
}

    @Override
    public boolean isDev() {
        return false;
    }
}
