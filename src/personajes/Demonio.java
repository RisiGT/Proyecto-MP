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
public class Demonio extends Esbirro {
    private String name;
    private int salud; 
    private String pacto;
    private Esbirro Esabirros[] = new Esbirro[50];//Esto hay que hacerlo con una lista
    
    public Demonio(String nombre, int hp, String pact){
        this.name=nombre;
        this.pacto=pact;
        this.salud=hp;
    }    
    
    public void addEsbirro(Esbirro esb){
        //Esbirros.add(esb);
    }
    
    public Esbirro getEsbirro(int num){
        return this.Esabirros[num];
    }
    
    @Override
    public boolean esHumano(){
        return false;
    }   
}
