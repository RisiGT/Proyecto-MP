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
public abstract class Modificadores {
    private String name;
    private int valor;
 public Modificadores (String nombre, int val){
    this.name=nombre;
    this.valor=val;
 }  
 public String getName(){
     return this.name;
 }
  public int getValor(){
     return this.valor;
 }
 
}
