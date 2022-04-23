/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import personajes.Esbirro;

/**
 *
 * @author PcCom
 */
public class Ghoul extends Esbirro {
   private String name;
    private int salud;
    private int dependencia;

    public Ghoul (String nombre, int hp){
        this.name=nombre;
        this.salud=hp;
        this.dependencia=0;//valor inicial
    }
    
    @Override
    public boolean esHumano(){
        return false;
    }
    
    public int getDependencia(){
        return dependencia;
    }

    public void setDependencia(int dependencia){
        this.dependencia = dependencia;
    }
}
