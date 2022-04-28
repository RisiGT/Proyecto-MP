/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.io.Serializable;
import personajes.Esbirro;

/**
 *
 * @author PcCom
 */
public class Humano extends Esbirro implements Serializable {

    private String name;
    private int salud;
    private int lealtad;

    public Humano(String nombre, int salud, int lealtad) {
        this.name = nombre;
        this.salud = salud;
        this.lealtad = lealtad;//valor inicial
    }

    @Override
    public boolean esHumano() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getLealtad() {
        return lealtad;
    }

    public void setLealtad(int lealtad) {
        this.lealtad = lealtad;
    }
}
