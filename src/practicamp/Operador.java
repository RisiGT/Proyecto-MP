/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

/**
 *
 * @author PcCom
 */
public class Operador extends Persona {
    private String nombre;
    private String password;
    private String nick;

    @Override
    public boolean isDev(){
        return true;
    }
}
