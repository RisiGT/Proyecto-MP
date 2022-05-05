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
private     String ganador; //false si gana el desafiante true si gana el desafiado
private     ArrayList<Ronda> listaRondas = new ArrayList<Ronda>();
private     ArrayList<Esbirro> listaEsbirrosPers1 = new ArrayList<Esbirro>(); //esbirros que han sobrevivido del desafiante
private     ArrayList<Esbirro> listaEsbirrosPers2 = new ArrayList<Esbirro>(); //esbirros que han sobrevivido del desafiado
private int oroApostado;
private int oroDesafiado;
private String desafiante;
private String desafiado;

    public Combate() {
    }

    public void setOroApostado(int oroApostado) {
        this.oroApostado = oroApostado;
    }

    public void setOroDesafiado(int oroDesafiado) {
        this.oroDesafiado = oroDesafiado;
    }

    public int getOroApostado() {
        return oroApostado;
    }

    public int getOroDesafiado() {
        return oroDesafiado;
    }

    public String getGanador() {
        return ganador;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }
    
    public void setGanador(String ganador){
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
