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
    List<Arma> armas = new ArrayList<>();
    private Arma armasActivas[] = new Arma[2];
    List<Armadura> armaduras = new ArrayList<>();
    private Armadura armaduraActiva;
    private Esbirro Esabirros[] = new Esbirro[50];//Esto hay que hacerlo con una lista
    private int oro;
    private int salud;
    private int poder;
    List<Debilidad> debilidades = new ArrayList<>();
    List<Fortaleza> fortalezas = new ArrayList<>();
    private int voluntad;

    public Cazador(String nombre, int salud, int poder, Arma arma, Armadura armadura, List<Debilidad> deb, List<Fortaleza> fort) {
        this.nombre = nombre;
        this.armasActivas[1] = arma;
        this.armaduraActiva = armadura;
        this.debilidades = deb;
        this.fortalezas = fort;
        this.salud = salud;
        this.poder = poder;
    }

    public void setHabilidadEspecial(Talento habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public List<Debilidad> getDebilidades() {
        return debilidades;
    }

    public List<Fortaleza> getFortalezas() {
        return fortalezas;
    }

    public void setArmasActivas(Arma armasActivas) {
        this.armasActivas[1] = armasActivas;
    }
        public void setArmaduraActiva(Armadura ArmaduraActiva) {
        this.armaduraActiva = ArmaduraActiva;
    }

    @Override
    public List<Arma> getArmas() {
        return armas;
    }

    @Override
    public List<Armadura> getArmaduras() {
        return armaduras;
    }

    @Override
    public int getTipo() {
        return 3;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    public int getVoluntad() {
        return voluntad;
    }
}
