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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModAtaque() {
        return modAtaque;
    }

    public void setModAtaque(int modAtaque) {
        this.modAtaque = modAtaque;
    }

    public int getModDefensa() {
        return modDefensa;
    }

    public void setModDefensa(int modDefensa) {
        this.modDefensa = modDefensa;
    }

    public int getManos() {
        return manos;
    }

    public void setManos(int manos) {
        this.manos = manos;
    }

   

}
