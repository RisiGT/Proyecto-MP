/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habilidades;

import java.io.Serializable;

/**
 *
 * @author PcCom
 */
public abstract class Habilidad implements Serializable {

    private String name;
    private int ataque;
    private int defensa;
 //   private int coste;
 //   private int min;

    public void Habilidad(String nombre, int at, int def) {
        this.ataque = at;
        this.defensa = def;
        this.name = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getName() {
        return name;
    }

//    public int getCoste() {
//        return coste;
//    }
//    public int getMin() {
//        return min;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
}
