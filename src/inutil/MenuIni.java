/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inutil;

import interfaces.GUIMenuIni;

/**
 *
 * @author PcCom
 */
public class MenuIni extends Menu {

    private int opcion;
    
    public MenuIni() {
    }
    
    public int getOpcion() {
        return this.opcion;
    }
    
    @Override
    public void presentarMenu() {
        //creo que esto sobra
    }

    @Override
    public void doOperation() {
        opcion = 0;
        GUIMenuIni m = new GUIMenuIni();
        m.setVisible(true);
    }
}
