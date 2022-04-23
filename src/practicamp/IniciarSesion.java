/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import interfaces.GUIIniSesion;

/**
 *
 * @author PcCom
 */
public class IniciarSesion extends Menu {
    private String nombre;
    private String password;

    public String getNombre(){
        return nombre;
    }

    public String getPassword(){
        return password;
    }
    
    @Override
    public void presentarMenu(){
        //creo q sobra
    }

    @Override
    public void doOperation(){
        GUIIniSesion m= new GUIIniSesion(); 
        m.setVisible(true);  
        while (m.isActive()==true){}
        this.nombre=m.getNombre();
        this.password=m.getPassword();
        m.dispose();
    }
}
