/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import personajes.Esbirro;
import java.util.ArrayList;
import java.util.List;
import equipo.Arma;
import equipo.Armadura;
import habilidades.Debilidad;
import habilidades.Don;
import habilidades.Fortaleza;
import java.io.Serializable;

/**
 *
 * @author PcCom
 */
public class Licantropo extends Personaje implements Serializable {

    private String nombre;
    private Don Habilidadespecial;

    List<Arma> Armas = new ArrayList<>();
    private Arma ArmasActivas[] = new Arma[2];
    List<Armadura> Armaduras = new ArrayList<>();
    private Armadura ArmaduraActiva;
    ArrayList<Esbirro> Esbirros  = new ArrayList<Esbirro>();///Esto hay que hacerlo con una lista
    private int oro;
    private int salud;
    private int poder;
    List<Debilidad> Debilidades = new ArrayList<>();
    List<Fortaleza> Fortalezas = new ArrayList<>();
    private int tamaño;
    private int rabia;
    
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Licantropo(String nombre, int salud, int poder, Arma arma, Armadura armadura, List<Debilidad> deb, List<Fortaleza> fort) {
        this.nombre = nombre;
        this.ArmasActivas[1] = arma;
        this.ArmaduraActiva = armadura;
        this.Debilidades = deb;
        this.Fortalezas = fort;
        this.salud = salud;
        this.poder = poder;
    }

    public ArrayList<Esbirro> getEsbirros() {
        return Esbirros;
    }

    public void setEsbirros(ArrayList<Esbirro> Esbirros) {
        this.Esbirros = Esbirros;
    }

    public int getRabia() {
        return rabia;
    }

    public void setRabia(int rabia) {
        this.rabia = rabia;
    }

    @Override
    public List<Arma> getArmas() {
        return Armas;
    }

    public String getNombre() {
        return nombre;
    }

    public Don getHabilidadespecial() {
        return Habilidadespecial;
    }

    public Arma[] getArmasActivas() {
        return ArmasActivas;
    }

    public Armadura getArmaduraActiva() {
        return ArmaduraActiva;
    }

   

    public int getOro() {
        return oro;
    }

    public int getSalud() {
        return salud;
    }

    public int getPoder() {
        return poder;
    }

    public List<Debilidad> getDebilidades() {
        return Debilidades;
    }

    public List<Fortaleza> getFortalezas() {
        return Fortalezas;
    }

    public int getTamaño() {
        return tamaño;
    }

    @Override
    public List<Armadura> getArmaduras() {
        return Armaduras;
    }

    public void setHabilidadespecial(Don Habilidadespecial) {
        this.Habilidadespecial = Habilidadespecial;
    }

    @Override
    public int getTipo() {
        return 2;
    }

}
