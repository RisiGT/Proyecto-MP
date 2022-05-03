/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.io.Serializable;
import personajes.Personaje;

/**
 *
 * @author pcris
 */
public class Desafio implements Serializable {

    private Usuario desafiante;
    private Usuario desafiado;
    private int oro;
    private Personaje personajeDesafiante;
    private Personaje personajeDesafiado;
    private int estado; //0 si el desafio esta enviado, 1 si lo ha aceptado el otro, 2 si lo ha validado el operador

    public Desafio(Usuario desafiante, Usuario desafiado, int oro, Personaje personajeDesafiante) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.oro = oro;
        this.personajeDesafiante = personajeDesafiante;
        estado = 0;
    }

    public int oroPorRechazar() {
        int oroPorRechazar = oro / 10;
        return oroPorRechazar;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public Usuario getDesafiante() {
        return desafiante;
    }

    public Usuario getDesafiado() {
        return desafiado;
    }

    public int getEstado() {
        return estado;
    }

    public Personaje getPersonajeDesafiante() {
        return personajeDesafiante;
    }

    public Personaje getPersonajeDesafiado() {
        return personajeDesafiado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setPersonajeDesafiado(Personaje personajeDesafiado) {
        this.personajeDesafiado = personajeDesafiado;
    }

}
