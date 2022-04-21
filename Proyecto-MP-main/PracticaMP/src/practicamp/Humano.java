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
public class Humano extends Esbirro{
   private String name;
    private int salud;
    private int lealtad;

 
    public Humano (String nombre, int hp){
    this.name=nombre;
    this.salud=hp;
    this.lealtad=0;//valor inicial
    }
        @Override
    public boolean esHumano(){
     return true;
    }
    public int getLealtad() {
        return lealtad;
    }

    public void setLealtad(int lealtad) {
        this.lealtad = lealtad;
    }

}
