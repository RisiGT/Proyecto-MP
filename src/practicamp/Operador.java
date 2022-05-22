/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.io.Serializable;

/**
 *
 * @author PcCom
 */
public class Operador extends Persona implements Serializable {

    private String nombre;
    private String password;
    private String nick;

    public Operador(String nombre, String password, String nick) {
        this.nombre = nombre;
        this.password = password;
        this.nick = nick;
    }

    @Override
    public boolean isDev() {
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

}
