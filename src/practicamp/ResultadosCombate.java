/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamp;

/**
 *
 * @author PcCom
 */
public class ResultadosCombate {
    String nombre;
    String resultado; //true para ganado
    Combate combate;

    public ResultadosCombate(String nombre, Combate combate) {
        this.nombre = nombre;
        this.combate = combate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGanador() {
        return resultado;
    }

    public void setGanador(String resultado) {
        this.resultado = resultado;
    }

    public Combate getCombate() {
        return combate;
    }

    public void setCombate(Combate combate) {
        this.combate = combate;
    }
}
