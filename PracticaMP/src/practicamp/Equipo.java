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
public abstract class Equipo {
    private String name;
    private int modAtaque;
    private int modDefensa;//¿Ponemos que esto sea un int o un modificador?
    
public Equipo(String nombre, int at, int def){
    this.name=nombre;
    this.modAtaque=at;
    this.modDefensa=def;
}   
public String getName(){
    return this.name;
}
public int getAtaque(){
    return this.modAtaque;
}
public int getDefensa(){
    return this.modDefensa;
}
}
