/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author PcCom
 */
public class NotificadorCombate {
    private ArrayList<Usuario> subscriptores;

    public NotificadorCombate() {
    }
    public void Subscribirse(Usuario u){
        subscriptores.add(u);
    }
    public void Desubscribirse(Usuario u){
        subscriptores.remove(u);
    }
    public void Actualizar(ResultadosCombate res) throws IOException, FileNotFoundException, ClassNotFoundException{
        BaseDatos b = new BaseDatos();
        b.deserializePro("Usuario");
      for  (int i=0 ;i<subscriptores.size(); i++)  {
          subscriptores.get(i).añadirCombateAjenos(res);
          b.actualizarUsuario(subscriptores.get(i));
      }
        b.deserializePro("Usuarios");
    }
    public boolean pertenece(Usuario u){
        if (subscriptores.contains(u)){
            return true;
        }
        else return false;
    }
}

