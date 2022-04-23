/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PcCom
 */
public class BaseDatos implements Serializable {
    List<Usuario> listausuarios;
    
    public BaseDatos(){
      listausuarios = null;  
    } 
    
    public void Serialize() throws FileNotFoundException, IOException {
        String fic = "..Archivos\\Usuarios.txt";
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fic));
        salida.writeObject(this.listausuarios);
        salida.close();
    }
    
    public void Deserialize() throws FileNotFoundException, IOException, ClassNotFoundException{
        String fic = "C:..Archivos\\Usuarios.txt";
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fic));
        listausuarios  = (List<Usuario>) entrada.readObject();
    }

    public List<Usuario> getListausuarios(){
        return listausuarios;
    }
        
    public boolean pertenece(String nombre){
        if (this.listausuarios==null){}
        else{
            for(Usuario list: listausuarios){
                if (list.getNombre()==nombre){
                    return true;
                }   
            }
        }
        return false;
    }
    
    public boolean okIni(String nombre, String password){
        for(Usuario list: listausuarios){
            if ((list.getNombre()==nombre) && (list.getPassword()==password)){
                return true;
            }   
        }
        return false; 
    }
}
