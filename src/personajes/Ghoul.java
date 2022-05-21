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
public class Ghoul extends Esbirro implements Serializable {

    private String name;
    private int salud;
    private int dependencia;

    public Ghoul(String nombre, int salud, int dependencia) {
        this.name = nombre;
        this.salud = salud;
        this.dependencia = dependencia;//valor inicial
    }
    
    public int getDependencia() {
        return dependencia;
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }

    @Override
    public boolean esHumano() {
        return false;
    }

    @Override
    public int tipo() {
        return 2;
    }
}
