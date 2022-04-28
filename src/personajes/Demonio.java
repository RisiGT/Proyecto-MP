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
public class Demonio extends Esbirro implements Serializable {

    private String name;
    private int salud;
    private String pacto;
    private Esbirro Esbirros[] = new Esbirro[50];//Esto hay que hacerlo con una lista

    public Demonio(String nombre, int salud, String pact) {
        this.name = nombre;
        this.pacto = pact;
        this.salud = salud;
    }

    public void addEsbirro(Esbirro esb) {
        //Esbirros.add(esb);
    }

    public Esbirro getEsbirro(int num) {
        return this.Esbirros[num];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean esHumano() {
        return false;
    }
}
