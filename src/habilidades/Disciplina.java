/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habilidades;

/**
 *
 * @author PcCom
 */
public class Disciplina extends Habilidad {
    private String name;
    private int ataque;
    private int defensa;
    private int coste;
    
    public Disciplina(String nombre, int at, int def,int cost){
        this.ataque = at;
        this.defensa = def;
        this.name = nombre;
        this.coste = cost;
    }   
    
    public int getMin(){
        return this.coste;
    }    
}
