/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import interfaces.GUIRegistrarse;

/**
 *
 * @author PcCom
 */
public class Registrarse extends Menu {
    private int opcion;

    public int getOpcion(){
        return opcion;
    }
    
    @Override
    public void presentarMenu(){
        //pedir todas las cosas
    }

    @Override
    public void doOperation(){
        int opcion=0;
        GUIRegistrarse m=new GUIRegistrarse(); 
        m.setVisible(true);      
        //opcion=m.getOpcion();
        this.opcion=opcion;
    }
}
