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
public class Don extends Habilidad implements Serializable {

//    private String name;
 //   private int ataque;
 //   private int defensa;
    private int min;

    public Don(String nombre, int at, int def, int minimo) {
//        this.ataque = at;
//        this.defensa = def;
//        this.name = nombre;
        super.Habilidad(nombre, at, def);
        this.min = minimo;
    }


    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return this.min;
    }
}
