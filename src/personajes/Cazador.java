/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.util.ArrayList;
import java.util.List;
import equipo.Arma;
import equipo.Armadura;
import habilidades.Debilidad;
import habilidades.Fortaleza;
import habilidades.Talento;
import java.io.Serializable;

/**
 *
 * @author PcCom
 */
public class Cazador extends Personaje implements Serializable {

    private String nombre;
    private Talento habilidadEspecial;
    List<Arma> Armas = new ArrayList<>();
    private Arma ArmasActivas[] = new Arma[2];
    List<Armadura> Armaduras = new ArrayList<>();
    private Armadura ArmaduraActiva;
    ArrayList<Esbirro> Esbirros  = new ArrayList<Esbirro>();//Esto hay que hacerlo con una lista
    private int oro;
    private int salud;
    private int poder;
    List<Debilidad> Debilidades = new ArrayList<>();
    List<Fortaleza> Fortalezas = new ArrayList<>();
    private int Voluntad;
    
    public Cazador(String nombre, int salud, int poder, Arma arma, Armadura armadura, List<Debilidad> deb, List<Fortaleza> fort) {
        this.nombre = nombre;
        this.ArmasActivas[1] = arma;
        this.ArmaduraActiva = armadura;
        this.Debilidades = deb;
        this.Fortalezas = fort;
        this.salud = salud;
        this.poder = poder;
    }

    public void setHabilidadEspecial(Talento habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Esbirro> getEsbirros() {
        return Esbirros;
    }

    public void setEsbirros(ArrayList<Esbirro> Esbirros) {
        this.Esbirros = Esbirros;
    }

    public int getVoluntad() {
        return Voluntad;
    }

    public void setVoluntad(int Voluntad) {
        this.Voluntad = Voluntad;
    }
    

    public Talento getHabilidadEspecial() {
        return habilidadEspecial;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArmas(List<Arma> Armas) {
        this.Armas = Armas;
    }

    public void setArmasActivas(Arma[] ArmasActivas) {
        this.ArmasActivas = ArmasActivas;
    }

    public void setArmaduras(List<Armadura> Armaduras) {
        this.Armaduras = Armaduras;
    }

    public void setArmaduraActiva(Armadura ArmaduraActiva) {
        this.ArmaduraActiva = ArmaduraActiva;
    }

   

    public void setOro(int oro) {
        this.oro = oro;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setDebilidades(List<Debilidad> Debilidades) {
        this.Debilidades = Debilidades;
    }

    public void setFortalezas(List<Fortaleza> Fortalezas) {
        this.Fortalezas = Fortalezas;
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

    @Override
    public List<Arma> getArmas() {
        return Armas;
    }

    @Override
    public List<Armadura> getArmaduras() {
        return Armaduras;
    }

    @Override
    public int getTipo() {
        return 3;
    }

}
