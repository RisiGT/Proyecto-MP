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
import habilidades.Fortaleza;
import habilidades.Habilidad;
import java.io.Serializable;

/**
 *
 * @author PcCom
 */
public abstract class Personaje implements Serializable {

    private String nombre;
    private Habilidad habilidadEspecial;
    List<Arma> armas = new ArrayList<>();
//    private Arma ArmasActivas[] = new Arma[2];    Esto es lo que estaba
    private Arma armaActiva;       // Pongo eso para que me funcione
    List<Armadura> armaduras = new ArrayList<>();
    private Armadura armaduraActiva;
    ArrayList<Esbirro> esbirros  = new ArrayList<Esbirro>();
    private int oro;
    private int salud;
    private int poder;
    List<Debilidad> debilidades = new ArrayList<>();
    List<Fortaleza> fortalezas = new ArrayList<>();
    
    public ArrayList<Esbirro> getEsbirros() {
        return esbirros;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public Arma getArma(String nombre) {
        for (Arma arma : armas) {
            if (arma.getName().equals(nombre)) {
                return arma;
            }
        }
        return null;
    }

    public Armadura getArmadura(String nombre) {
        for (Armadura armadura : armaduras) {
            if (armadura.getName().equals(nombre)) {
                return armadura;
            }
        }
        return null;
    }

    public List<Armadura> getArmaduras() {
        return armaduras;
    }

    public void setArmasActivas(Arma ArmasActiva) {
        this.armaActiva = ArmasActiva;
    }

    public void setArmaduraActiva(Armadura ArmaduraActiva) {
        this.armaduraActiva = ArmaduraActiva;
    }

    public abstract int getTipo();

    public List<Debilidad> getDebilidades() {
        return debilidades;
    }

    public List<Fortaleza> getFortalezas() {
        return fortalezas;
    }
    
    public Habilidad getHabilidadespecial() {
        return habilidadEspecial;
    }
    public Arma getArmaActiva() {
        return armaActiva;
    }
    public Armadura getArmaduraActiva() {
        return armaduraActiva;
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

    public void setHabilidadEspecial(Habilidad habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setDebilidades(List<Debilidad> Debilidades) {
        this.debilidades = debilidades;
    }

    public void setFortalezas(List<Fortaleza> Fortalezas) {
        this.fortalezas = fortalezas;
    }
}
