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
public class Arma extends Equipo implements Serializable {

    private String name;
    private int modAtaque;
    private int modDefensa;
    private int manos;

    public Arma(String nombre, int at, int def, int manos) {
       super(nombre,at,def);
        this.manos = manos;
    }

 

    public int getManos() {
        return manos;
    }

    public void setManos(int manos) {
        this.manos = manos;
    }

   

}
