/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.io.Serializable;

/**
 *
 * @author PcCom
 */
public class Arma extends Equipo implements Serializable {

    private String name;
    private int modAtaque;
    private int modDefensa;
    private int manos;

    public Arma(String nombre, int at, int def, int manos) {
        this.name = nombre;
        this.modAtaque = at;
        this.modDefensa = def;
        this.manos = manos;
    }

    public int getManos() {
        return this.manos;
    }

    public String getName() {
        return name;
    }

    public int getModDefensa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
