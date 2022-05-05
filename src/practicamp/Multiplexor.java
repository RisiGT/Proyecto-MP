/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import interfaces.GUIMenuIni;
import inutil.MenuIni;

/**
 *
 * @author PcCom
 */
public class Multiplexor {

    public void start() {
        /*
        MenuIni menuInicial = new MenuIni();
        menuInicial.doOperation();
        */
        GUIMenuIni m = new GUIMenuIni();
        m.setVisible(true);
    }
}
