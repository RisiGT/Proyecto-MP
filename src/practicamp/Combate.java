/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamp;

import java.util.ArrayList;
import personajes.Esbirro;

/**
 *
 * @author PcCom
 */
public class Combate {
    boolean ganador; //false si gana el desafiante true si gana el desafiado
    ArrayList<Ronda> listaRondas = new ArrayList<Ronda>();
    ArrayList<Esbirro> listaEsbirrosPers1 = new ArrayList<Esbirro>(); //esbirros que han sobrevivido del desafiante
    ArrayList<Esbirro> listaEsbirrosPers2 = new ArrayList<Esbirro>(); //esbirros que han spbrevivido del desafiado

    public Combate() {
    }

    public boolean getGanador() {
        return ganador;
    }
    
    public void setGanador(boolean gan){
        this.ganador = ganador;
    }

    public ArrayList<Ronda> getListaRondas() {
        return listaRondas;
    }

    public ArrayList<Esbirro> getListaEsbirrosPers1() {
        return listaEsbirrosPers1;
    }

    public ArrayList<Esbirro> getListaEsbirrosPers2() {
        return listaEsbirrosPers2;
    }

    public void setListaRondas(ArrayList<Ronda> listaRondas) {
        this.listaRondas = listaRondas;
    }

    public void setListaEsbirrosPers1(ArrayList<Esbirro> listaEsbirrosPers1) {
        this.listaEsbirrosPers1 = listaEsbirrosPers1;
    }

    public void setListaEsbirrosPers2(ArrayList<Esbirro> listaEsbirrosPers2) {
        this.listaEsbirrosPers2 = listaEsbirrosPers2;
    }
    
}
