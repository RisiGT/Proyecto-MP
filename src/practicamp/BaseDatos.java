/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import equipo.Arma;
import equipo.Armadura;
import habilidades.Debilidad;
import habilidades.Disciplina;
import habilidades.Don;
import habilidades.Fortaleza;
import habilidades.Talento;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import personajes.Demonio;
import personajes.Ghoul;
import personajes.Humano;

/**
 *
 * @author PcCom
 */
public class BaseDatos implements Serializable {

    List<Usuario> listausuarios;
    List<Disciplina> listadisciplinas;
    List<Don> listadones;
    List<Talento> listatalentos;
    List<Fortaleza> listafortalezas;
    List<Debilidad> listadebilidades;
    List<Armadura> listaArmaduras;
    List<Arma> listaArmas;
    List<Operador> listaoperadores;
    List<Humano> listahumanos;
    List<Ghoul> listaghouls;
    List<Demonio> listademonios;
    List<String> listabaneados;
    List<Desafio> listadesafios;

    public BaseDatos() {
        listausuarios = new ArrayList<Usuario>();
        listadisciplinas = new ArrayList<Disciplina>();
        listadones = new ArrayList<Don>();
        listatalentos = new ArrayList<Talento>();
        listafortalezas = new ArrayList<Fortaleza>();
        listadebilidades = new ArrayList<Debilidad>();
        listaArmaduras = new ArrayList<Armadura>();
        listaArmas = new ArrayList<Arma>();
        listaoperadores = new ArrayList<Operador>();
        listahumanos = new ArrayList<Humano>();
        listaghouls = new ArrayList<Ghoul>();
        listademonios = new ArrayList<Demonio>();
        listabaneados = new ArrayList<String>();
        listadesafios = new ArrayList<Desafio>();
    }

    public void SerializePro(String nombre) throws FileNotFoundException, IOException {
        String fic = "D:\\" + nombre + "s.txt"; 
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fic));
        switch (nombre) {
            case "Usuario":
                salida.writeObject(this.listausuarios);
                salida.close();
                break;
            case "Operator":
                salida.writeObject(this.listaoperadores);
                salida.close();
                break;
            case "Disciplina":
                salida.writeObject(this.listadisciplinas);
                salida.close();
                break;
            case "Don":
                salida.writeObject(this.listadones);
                salida.close();
                break;
            case "Talento":
                salida.writeObject(this.listatalentos);
                salida.close();
                break;
            case "Fortaleza":
                salida.writeObject(this.listafortalezas);
                salida.close();
                break;
            case "Debilidad":
                salida.writeObject(this.listadebilidades);
                salida.close();
                break;
            case "Arma":
                salida.writeObject(this.listaArmas);
                salida.close();
                break;
            case "Armadura":
                salida.writeObject(this.listaArmaduras);
                salida.close();
                break;
            case "Humano":
                salida.writeObject(this.listahumanos);
                salida.close();
                break;
            case "Ghoul":
                salida.writeObject(this.listaghouls);
                salida.close();
                break;
            case "Demonio":
                salida.writeObject(this.listademonios);
                salida.close();
                break;
            case "Ban":
                salida.writeObject(this.listabaneados);
                salida.close();
                break;
            case "Desafio":
                salida.writeObject(this.listadesafios);
                salida.close();
                break;
        }

    }

    @SuppressWarnings({"unchecked", "unchecked"})
    public void DeserializePro(String nombre) throws FileNotFoundException, IOException, ClassNotFoundException {
        String fic = "D:\\" + nombre + "s.txt";
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fic));

        switch (nombre) {
            case "Usuario":
                listausuarios = (List<Usuario>) entrada.readObject();
                break;
            case "Operator":
                listaoperadores = (List<Operador>) entrada.readObject();
                ;
                break;
            case "Disciplina":
                listadisciplinas = (List<Disciplina>) entrada.readObject();
                break;
            case "Don":
                listadones = (List<Don>) entrada.readObject();
                break;
            case "Talento":
                listatalentos = (List<Talento>) entrada.readObject();
                break;
            case "Fortaleza":
                listafortalezas = (List<Fortaleza>) entrada.readObject();
                break;
            case "Debilidad":
                listadebilidades = (List<Debilidad>) entrada.readObject();
                break;
            case "Arma":
                listaArmas = (List<Arma>) entrada.readObject();
                break;
            case "Armadura":
                listaArmaduras = (List<Armadura>) entrada.readObject();
                break;
            case "Humano":
                listahumanos = (List<Humano>) entrada.readObject();
                break;
            case "Ghoul":
                listaghouls = (List<Ghoul>) entrada.readObject();
                break;
            case "Demonio":
                listademonios = (List<Demonio>) entrada.readObject();
                break;
            case "Ban":
                listabaneados = (List<String>) entrada.readObject();
                break;
            case "Desafio":
                listadesafios = (List<Desafio>) entrada.readObject();
        }
    }

    public List<Usuario> getListausuarios() {
        return listausuarios;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listadisciplinas;
    }

    public List<Don> getListaDones() {
        return listadones;
    }

    public List<Talento> getListaTalentos() {
        return listatalentos;
    }

    public List<Fortaleza> getListaFortalezas() {
        return listafortalezas;
    }

    public List<Debilidad> getListaDebilidades() {
        return listadebilidades;
    }

    public List<Armadura> getListaArmaduras() {
        return listaArmaduras;
    }

    public List<Arma> getListaArmas() {
        return listaArmas;
    }

    public List<Operador> getListaoperadores() {
        return listaoperadores;
    }

    public List<Humano> getListahumanos() {
        return listahumanos;
    }

    public List<Ghoul> getListaghouls() {
        return listaghouls;
    }

    public List<Demonio> getListademonios() {
        return listademonios;
    }

    public List<String> getListabaneados() {
        return listabaneados;
    }

    public List<Desafio> getListadesafios() {
        return listadesafios;
    }

    public boolean pertenece(String nombre) {
        if (this.listausuarios == null) {
        } else {
            for (Usuario list : listausuarios) {
                if (list.getNombre().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceBaneado(String nombre) {
        if (this.listabaneados == null) {
        } else {
            for (String list : listabaneados) {
                if (list.equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Usuario getUsuario(String nombre) {
        for (Usuario usuario : listausuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    public Operador getOperador(String nombre) {
        for (Operador operador : listaoperadores) {
            if (operador.getNombre().equals(nombre)) {
                return operador;
            }
        }
        return null;
    }

    public boolean perteneceOperador(String nombre) {
        if (this.listaoperadores == null) {
        } else {
            for (Operador list : listaoperadores) {
                if (list.getNombre().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceDisciplina(String nombre) {
        if (this.listadisciplinas == null) {
        } else {
            for (Disciplina list : listadisciplinas) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceDon(String nombre) {
        if (this.listadones == null) {
        } else {
            for (Don list : listadones) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceTalento(String nombre) {
        if (this.listatalentos == null) {
        } else {
            for (Talento list : listatalentos) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceDebilidades(String nombre) {
        if (this.listadebilidades == null) {
        } else {
            for (Debilidad list : listadebilidades) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceFortalezas(String nombre) {
        if (this.listafortalezas == null) {
        } else {
            for (Fortaleza list : listafortalezas) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceArma(String nombre) {
        if (this.listaArmas == null) {
        } else {
            for (Arma list : listaArmas) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceArmadura(String nombre) {
        if (this.listaArmas == null) {
        } else {
            for (Arma list : listaArmas) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceHumano(String nombre) {
        if (this.listahumanos == null) {
        } else {
            for (Humano list : listahumanos) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceGhoul(String nombre) {
        if (this.listaghouls == null) {
        } else {
            for (Ghoul list : listaghouls) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perteneceDemonio(String nombre) {
        if (this.listademonios == null) {
        } else {
            for (Demonio list : listademonios) {
                if (list.getName().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean yaDesafiado(String nombre) {
        if (this.listadesafios == null) {
        } else {
            for (Desafio list : listadesafios) {
                if (list.getDesafiado().getNombre().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean okIni(String nombre, String password) {
        for (Usuario list : listausuarios) {
            if ((list.getNombre().equals(nombre)) && (list.getPassword().equals(password))) {
                return true;
            }
        }
        return false;
    }

    public boolean okIniOperador(String nombre, String password) {
        for (Operador list : listaoperadores) {
            if ((list.getNombre().equals(nombre)) && (list.getPassword().equals(password))) {
                return true;
            }
        }
        return false;
    }

    public void actualizarUsuario(Usuario u) {
        for (Usuario list : listausuarios) {
            if ((list.getNombre().equals(u.getNombre()))) {
                listausuarios.remove(list);
                listausuarios.add(u);
                break;
            }
        }
    }
        public void RechazarDesafio(String desafiado) throws IOException {
        for (Desafio list : listadesafios) {
            if ((list.getDesafiado().getNombre().equals(desafiado))) {
                listausuarios.remove(list);              
            }
        }
        SerializePro("Desafio");
    }

}
