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

    public abstract boolean esHumano();

    public void setSalud(int i) {
        this.salud = i;
    }

    public abstract int tipo();
}
