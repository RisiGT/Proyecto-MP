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
public class Ronda {
    Esbirro Esbirro; //los esbirros del desafiente
    Esbirro Esbirro2; //los esbirros del desafiado

    public Esbirro getEsbirro() {
        return Esbirro;
    }

    public Esbirro getEsbirro2() {
        return Esbirro2;
    }

    public void setEsbirro(Esbirro Esbirro) {
        this.Esbirro = Esbirro;
    }

    public void setEsbirro2(Esbirro Esbirro2) {
        this.Esbirro2 = Esbirro2;
    }
}
