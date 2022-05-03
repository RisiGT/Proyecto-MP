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
public class Talento extends Habilidad implements Serializable {

    private String name;
    private int ataque;
    private int defensa;
    private int edad;

    public Talento(String nombre, int at, int def, int age) {
        this.ataque = at;
        this.defensa = def;
        this.name = nombre;
        this.edad = age;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return this.edad;
    }
}
