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
public abstract class Modificador implements Serializable {

    private String name;
    private int valor;

    public void Modificador(String nombre, int val) {
        this.name = nombre;
        this.valor = val;
    }

    public String getName() {
        return this.name;
    }

    public int getValor() {
        return this.valor;
    }

}
