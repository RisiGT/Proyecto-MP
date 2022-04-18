/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

/**
 *
 * @author PcCom
 */
public class Arma extends Equipo{
    private String name;
    private int modAtaque;
    private int modDefensa;
    private boolean manos;
    
public Arma (String nombre, int at, int def, boolean manos){
   super(nombre, at, def);
   this.manos=manos;
}   
public boolean getManos(){
    return this.manos;
}
}
