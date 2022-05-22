/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.io.Serializable;
import java.util.ArrayList;
import personajes.Esbirro;

/**
 *
 * @author PcCom
 */
public class Demonio extends Esbirro implements Serializable {

   // private String name;
   // private int salud;
    private String pacto;
   ArrayList<Esbirro> listaEsbirros  = new ArrayList<Esbirro>();//Esto hay que hacerlo con una lista

    public Demonio(String nombre, int salud, String pact) {
    super(nombre,salud);
      //  this.name = nombre;
        this.pacto = pact;
        //this.salud = salud;
    }

    public String getPacto() {
        return pacto;
    }

    public void setPacto(String pacto) {
        this.pacto = pacto;
    }

    public ArrayList<Esbirro> getListaEsbirros() {
        return listaEsbirros;
    }
    
    public void addEsbirro(Esbirro esb) {
        listaEsbirros.add(esb);
    }

    @Override
    public boolean esHumano() {
        return false;
    }

    @Override
    public int tipo() {
        return 1;
    }
}
