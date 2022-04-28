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

    public Debilidad(String name, int valor) {
        this.name = name;
        this.valor = valor;
    }

    @Override
    public String getName() {
        return name;
    }
}
