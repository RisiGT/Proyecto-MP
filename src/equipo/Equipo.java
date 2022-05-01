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
public abstract class Equipo implements Serializable {

    private String name;
    private int modAtaque;
    private int modDefensa;//¿Ponemos que esto sea un int o un modificador?

    public void Equipo(String nombre, int at, int def) { // CREO QUE HABRIA QUE PONERLE VOID
        this.name = nombre;
        this.modAtaque = at;
        this.modDefensa = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModAtaque() {
        return modAtaque;
    }

    public void setModAtaque(int modAtaque) {
        this.modAtaque = modAtaque;
    }

    public int getModDefensa() {
        return modDefensa;
    }

    public void setModDefensa(int modDefensa) {
        this.modDefensa = modDefensa;
    }

    
}
