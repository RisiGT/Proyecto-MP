/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PcCom
 */
public class NotificadorCombate implements Serializable{
    public ArrayList<Usuario> subscriptores = new ArrayList<Usuario>() ;

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
        b.serializePro("Usuario");
    }
    public boolean pertenece(Usuario u){
        if (!(subscriptores==null)){
         for (Usuario thing : subscriptores) {
                if (thing.getNombre().equals(u.getNombre())) {
                    return true;
                }
                }
                }
        return false;
                }}