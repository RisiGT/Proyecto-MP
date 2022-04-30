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
public class Armadura extends Equipo implements Serializable {

    private String name;
    private int modAtaque;
    private int modDefensa;

    public Armadura(String nombre, int at, int def) {
        name = nombre;
        modAtaque = at;
        modDefensa = def;
    }

    public String getName() {
        return name;
    }

}
