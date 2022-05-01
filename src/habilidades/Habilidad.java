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

    public void Habilidad(String nombre, int at, int def) {
        this.ataque = at;
        this.defensa = def;
        this.name = nombre;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public String getName() {
        return this.name;
    }
    
}
