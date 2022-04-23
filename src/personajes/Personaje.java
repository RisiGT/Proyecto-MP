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
import habilidades.Debilidades;
import habilidades.Fortalezas;
import habilidades.Habilidad;

/**
 *
 * @author PcCom
 */
public abstract class Personaje {
    private String nombre;
    private Habilidad Habilidadespecial;
    List<Arma> Armas = new ArrayList();
    private Arma ArmasActivas[] = new Arma[2];
    List<Armadura> Armaduras = new ArrayList();
    private Armadura ArmaduraActiva;
    private Esbirro Esabirros[] = new Esbirro[50];//Esto hay que hacerlo con una lista
    private int oro;
    private int salud;
    private int poder;
    List<Debilidades> Debilidades = new ArrayList();
    List<Fortalezas> Fortalezas = new ArrayList();
}
