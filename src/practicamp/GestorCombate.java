/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamp;

import java.util.ArrayList;
import java.util.Random;
import personajes.Cazador;
import personajes.Demonio;
import personajes.Esbirro;
import personajes.Licantropo;
import personajes.Personaje;
import personajes.Vampiro;

/**
 *
 * @author PcCom
 */
public class GestorCombate {
    Personaje pers1;
    Personaje pers2;
    int poder1;
    int poder2;
    int defensa1;
    int defensa2;
    int salud1;
    int salud2;
    ArrayList<Esbirro> listaEsbirrosPers1 = new ArrayList<Esbirro>();
    ArrayList<Esbirro> listaEsbirrosPers2 = new ArrayList<Esbirro>();
    ArrayList<Ronda> listaRondas = new ArrayList<Ronda>();
    
public GestorCombate(Personaje p1, Personaje p2){
    pers1=p1;
    pers2=p2;
    defensa1=p1.getArmaduraActiva().getModDefensa()+p1.getArmaActiva().getModDefensa()+p1.getHabilidadEspecial().getDefensa();
    defensa2=p2.getArmaduraActiva().getModDefensa()+p2.getArmaActiva().getModDefensa()+p2.getHabilidadEspecial().getDefensa();
   int i;//variable auxiliar par recorrer la lista 
   int k;//variable para recorrer la lista de esbirros tier 2
    i = p1.getEsbirros().size();
    for (int j=0; j<i; j++){
        if (p1.getEsbirros().get(j).tipo()==1){
           Demonio dem =(Demonio) p1.getEsbirros().get(j);
           k = dem.getListaEsbirros().size();
           for (int m=0; m<k;m++){
           listaEsbirrosPers1.add(dem.getListaEsbirros().get(m));
           }
        }
    }
    for (int j=0; j<i; j++){
         listaEsbirrosPers1.add(p1.getEsbirros().get(j));
    }
    
   i = p2.getEsbirros().size();
    for (int j=0; j<i; j++){
        if (p2.getEsbirros().get(j).tipo()==1){
           Demonio dem =(Demonio) p2.getEsbirros().get(j);
           k = dem.getListaEsbirros().size();
           for (int m=0; m<k;m++){
           listaEsbirrosPers2.add(dem.getListaEsbirros().get(m));
           }
        }
    }
    for (int j=0; j<i; j++){
         listaEsbirrosPers2.add(p2.getEsbirros().get(j));
    }     
 }  
 public void generarCombate(){    
 while((salud1!=0)||(salud2!=0)){
     listaRondas.add(this.nuevaRonda());
 }
 if (salud1!=0){
    //gana el desafiante
 }
 else if (salud2!=0){
    //gana el desafiado
 }
}    
 public Ronda nuevaRonda(){ 
     Ronda ronda = new Ronda();
    int valorAtaque1;
    int valorAtaque2;
    int valorDefensa1;
    int valorDefensa2;
    valorAtaque1=0;
    valorDefensa1=0;
    valorAtaque2=0;
    valorDefensa2=0;
     poder1=pers1.getPoder()+pers1.getArmaActiva().getModAtaque()+pers1.getArmaduraActiva().getModAtaque()-pers1.getDebilidades().get(1).getValor()+pers1.getFortalezas().get(1).getValor();
        if (pers1.getTipo()==1){//es un vampiro
            Vampiro v = (Vampiro) pers1;
             if (v.getPtosSangre()>5){
                 poder1=poder1+5;
                 v.setPtosSangre(v.getPtosSangre()-v.getHabilidadEspecial().getCoste());
                 pers1=v;
             }}
             else if (pers1.getTipo()==2){//es un licantropo
            Licantropo l = (Licantropo) pers1;
            poder1=poder1+l.getRabia();
             if (l.getRabia()>l.getHabilidadEspecial().getMin()){
                 poder1=poder1+l.getHabilidadEspecial().getAtaque();
                 l.setRabia(l.getRabia()-l.getHabilidadEspecial().getMin());
                 pers1=l;
             }}  
             else {
                 Cazador c = (Cazador) pers1;                 
                 poder1=poder1+c.getVoluntad();
                 poder1=poder1+c.getHabilidadEspecial().getAtaque();
                 pers1=c;
             }                
        poder2=pers2.getPoder()+pers2.getArmaActiva().getModAtaque()+pers2.getArmaduraActiva().getModAtaque()-pers2.getDebilidades().get(1).getValor()+pers2.getFortalezas().get(1).getValor();
        if (pers2.getTipo()==1){//es un vampiro
            Vampiro v = (Vampiro) pers2;
             if (v.getPtosSangre()>5){
                 poder2=poder2+5;
                 v.setPtosSangre(v.getPtosSangre()-v.getHabilidadEspecial().getCoste());
                 pers2=v;
             }}
             else if (pers2.getTipo()==2){//es un licantropo
            Licantropo l = (Licantropo) pers2;
            poder2=poder2+l.getRabia();
             if (l.getRabia()>l.getHabilidadEspecial().getMin()){
                 poder2=poder2+l.getHabilidadEspecial().getAtaque();
                 l.setRabia(l.getRabia()-l.getHabilidadEspecial().getMin());
                 pers2=l;
             }}  
             else {
                 Cazador c = (Cazador) pers2;                 
                 poder2=poder2+c.getVoluntad();
                 poder2=poder2+c.getHabilidadEspecial().getAtaque();
                 pers2=c;
             }  
    //Conseguimos el valor de ataque con la mecanica de dados
    for  (int i=0; i<poder1; i++){
        Random rand = new Random();
        int j = rand.nextInt(5)+1;
        if (j>4){
            valorAtaque1=valorAtaque1++;
            
        }
        
    }
    for  (int i=0; i<poder2; i++){
        Random rand = new Random();
        int j = rand.nextInt(5)+1;
        if (j>4){
            valorAtaque2=valorAtaque2++;
            
        }
        
    }
    for  (int i=0; i<defensa1; i++){
        Random rand = new Random();
        int j = rand.nextInt(5)+1;
        if (j>4){
            valorDefensa1=valorDefensa1++;
            
        }
        
    }
    for  (int i=0; i<defensa2; i++){
        Random rand = new Random();
        int j = rand.nextInt(5)+1;
        if (j>4){
            valorDefensa2=valorDefensa2++;
            
        }
        
    }
    
    if (valorAtaque1>=valorDefensa2){
        valorAtaque1=1;
    }      
    else{
        valorAtaque1=0;
    }
    if (valorAtaque2>=valorDefensa1){
        valorAtaque2=1;
    }      
    else{
        valorAtaque2=0;
    }
    
    
    if (listaEsbirrosPers2.isEmpty()){
        salud2=salud2-valorAtaque1;
    }
    else{
    if (1<=listaEsbirrosPers2.get(0).getSalud()-valorAtaque1){
        listaEsbirrosPers2.get(0).setSalud(listaEsbirrosPers2.get(0).getSalud()-valorAtaque1);
    }
    else {
        ronda.setEsbirro2(listaEsbirrosPers2.get(0));
        listaEsbirrosPers2.remove(0);
    }
    }
    if (listaEsbirrosPers1.isEmpty()){
    salud1=salud1-valorAtaque2;    
    }
    else{
    if (1<=listaEsbirrosPers1.get(0).getSalud()-valorAtaque2){
        listaEsbirrosPers1.get(0).setSalud(listaEsbirrosPers1.get(0).getSalud()-valorAtaque2);
    }
    else{
        ronda.setEsbirro(listaEsbirrosPers1.get(0));
        listaEsbirrosPers1.remove(0);
    } 
    }
    if (valorAtaque1==1){
        if (pers1.getTipo()==1){
            Vampiro v = (Vampiro) pers1; 
            v.setPtosSangre(4+v.getPtosSangre());
            pers1=v;
        }
    }
    if (valorAtaque2==1){
        if (pers2.getTipo()==1){
            Vampiro v = (Vampiro) pers2; 
            v.setPtosSangre(4+v.getPtosSangre());
            pers2=v;
        }   
    }
    return ronda;
 }
}

