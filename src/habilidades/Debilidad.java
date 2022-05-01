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
public class Debilidad extends Modificador implements Serializable {

    private String name;
    private int valor;
    private int tipo;

    public Debilidad(String name, int valor, int tipo) {
        this.name = name;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
