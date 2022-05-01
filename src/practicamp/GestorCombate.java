/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamp;

import java.util.ArrayList;
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
    defensa1=p1.getArmaduraActiva().getModDefensa()+p1.getArmaActiva().getModDefensa()+p1.getHabilidadespecial().getDefensa();
    defensa2=p2.getArmaduraActiva().getModDefensa()+p2.getArmaActiva().getModDefensa()+p2.getHabilidadespecial().getDefensa();
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
    //gana el desafiado 
 }
 else if (salud2!=0){
    //gana el desafiante
 }
}    
 public Ronda nuevaRonda(){ 
     Ronda ronda = new Ronda();
     poder1=pers1.getPoder()+pers1.getArmaActiva().getModAtaque()+pers1.getArmaduraActiva().getModAtaque()-pers1.getDebilidades().get(1).getValor()+pers1.getFortalezas().get(1).getValor();
        if (pers1.getTipo()==1){//es un vampiro
            Vampiro v = (Vampiro) pers1;
             if (v.getPtosSangre()>5){
                 poder1=poder1+5;
                 v.setPtosSangre(v.getPtosSangre()-v.getHabilidadespecial().getCoste());
                 pers1=v;
             }}
             else if (pers1.getTipo()==2){//es un licantropo
            Licantropo l = (Licantropo) pers1;
            poder1=poder1+l.getRabia();
             if (l.getRabia()>l.getHabilidadespecial().getMin()){
                 poder1=poder1+l.getHabilidadespecial().getAtaque();
                 l.setRabia(l.getRabia()-l.getHabilidadespecial().getMin());
                 pers1=l;
             }}  
             else {
                 Cazador c = (Cazador) pers1;                 
                 poder1=poder1+c.getVoluntad();
                 poder1=poder1+c.getHabilidadespecial().getAtaque();
                 pers1=c;
             }                
        poder2=pers2.getPoder()+pers2.getArmaActiva().getModAtaque()+pers2.getArmaduraActiva().getModAtaque()-pers2.getDebilidades().get(1).getValor()+pers2.getFortalezas().get(1).getValor();
        if (pers2.getTipo()==1){//es un vampiro
            Vampiro v = (Vampiro) pers2;
             if (v.getPtosSangre()>5){
                 poder2=poder2+5;
                 v.setPtosSangre(v.getPtosSangre()-v.getHabilidadespecial().getCoste());
                 pers2=v;
             }}
             else if (pers2.getTipo()==2){//es un licantropo
            Licantropo l = (Licantropo) pers2;
            poder2=poder2+l.getRabia();
             if (l.getRabia()>l.getHabilidadespecial().getMin()){
                 poder2=poder2+l.getHabilidadespecial().getAtaque();
                 l.setRabia(l.getRabia()-l.getHabilidadespecial().getMin());
                 pers2=l;
             }}  
             else {
                 Cazador c = (Cazador) pers2;                 
                 poder2=poder2+c.getVoluntad();
                 poder2=poder2+c.getHabilidadespecial().getAtaque();
                 pers2=c;
             }  
    if (poder1>defensa2){
        poder1=poder1-defensa2;
    }      
    else{
        poder1=0;
    }
    if (poder2>defensa1){
        poder2=poder2-defensa1;
    }      
    else{
        poder2=0;
    }
    
    
    if (listaEsbirrosPers2.isEmpty()){
        if (poder1>salud2){
            salud2=0;
    }    
    else{
       salud2=salud2-poder1; 
    }
    }
    else{
    if (poder1<listaEsbirrosPers2.get(0).getSalud()){
        listaEsbirrosPers2.get(0).setSalud(listaEsbirrosPers2.get(0).getSalud()-poder1);
    }
    else {
        ronda.setEsbirro2(listaEsbirrosPers2.get(0));
        listaEsbirrosPers2.remove(0);
    }
    }
    if (listaEsbirrosPers1.isEmpty()){
    if (poder2>salud1){
            salud1=0;
    }    
    else{
       salud1=salud1-poder2; 
    }    
    }
    else{
    if (poder2<listaEsbirrosPers1.get(0).getSalud()){
        listaEsbirrosPers1.get(0).setSalud(listaEsbirrosPers1.get(0).getSalud()-poder2);
    }
    else{
        ronda.setEsbirro(listaEsbirrosPers1.get(0));
        listaEsbirrosPers1.remove(0);
    } 
    }
    return ronda;
 }
}

