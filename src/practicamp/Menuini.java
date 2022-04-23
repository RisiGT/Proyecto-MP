/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import interfaces.GUIMenuIni;

/**
 *
 * @author PcCom
 */
public class Menuini extends Menu {
    private int opcion;
    
    @Override
    public void presentarMenu(){
        //creo que esto sobra
    }

    @Override
    public void doOperation(){
        int opcion=0;
        GUIMenuIni m=new GUIMenuIni();
        m.setVisible(true);  
   /*
        while (m.isActive()==true){}
        opcion=m.getOpcion();
        this.opcion=opcion;
        m.dispose();
   */
    }

    public int getOpcion(){
        return this.opcion;
    }

    public Menuini(){
    }
}
