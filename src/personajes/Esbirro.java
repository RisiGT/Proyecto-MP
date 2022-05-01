/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

/**
 *
 * @author PcCom
 */
public abstract class Esbirro {

    private String name;
    private int salud;

    public String getName() {
        return name;
    }

    public int getSalud() {
        return salud;
    }

    public abstract int tipo();

    public void setName(String name) {
        this.name = name;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
}
