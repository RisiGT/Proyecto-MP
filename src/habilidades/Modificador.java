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
    private int tipo;

    public void Modificador(String nombre, int val, int tipo) {
        this.name = nombre;
        this.valor = val;
        this.tipo = tipo;
    }

    public String getName() {
        return this.name;
    }

    public int getValor() {
        return this.valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
