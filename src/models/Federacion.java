package models;
import java.util.ArrayList;

import exceptions.MaxEntrenadorException;
import exceptions.MaxFutbolistasException;
import models.*;

public class Federacion {
    private String nombre;
    private String fechaDeFundacion;
    private String cantidadDeMundiales;
    private static final int MAX_FUTBOLISTAS = 23;
    private static final int MAX_ENTRENADORES = 1;
    private ArrayList<Futbolista> listaFutbolistas;
    private ArrayList<Entrenador> listaEntrenadores;
    private ArrayList<Ayudante> listaAyudantes;
    private ArrayList<Masajista> listaMasajistas;

    public Federacion(String nombre, String fechaDeFundacion, String cantidadDeMundiales,
                      ArrayList<Futbolista> listaFutbolistas, ArrayList<Entrenador> listaEntrenadores,
                      ArrayList<Ayudante> listaAyudantes, ArrayList<Masajista> listaMasajistas) {
        this.nombre = nombre;
        this.fechaDeFundacion = fechaDeFundacion;
        this.cantidadDeMundiales = cantidadDeMundiales;
        this.listaFutbolistas = listaFutbolistas;
        this.listaEntrenadores = listaEntrenadores;
        this.listaAyudantes = listaAyudantes;
        this.listaMasajistas = listaMasajistas;
    }

    public void agregarFutbolista(Futbolista fut) throws MaxFutbolistasException {
        if(listaFutbolistas.size() >= MAX_FUTBOLISTAS){
            throw new MaxFutbolistasException("No se pueden agregar más de " + MAX_FUTBOLISTAS + " futbolistas.");
        }else{
            listaFutbolistas.add(fut);
        }
    }
    public void agregarEntrenador(Entrenador e) throws MaxEntrenadorException {
        if(listaEntrenadores.size() >= MAX_ENTRENADORES){
            throw new MaxEntrenadorException("No se puede agregar más de " + MAX_ENTRENADORES + " entrenador.");
        }else{
            listaEntrenadores.add(e);
        }
    }

    public void agregarAyudante(Ayudante a){
        listaAyudantes.add(a);
    }
    public void agregarMasajista(Masajista m){
        listaMasajistas.add(m);
    }
    public void verListaFutbolistas(){
        for(Futbolista f : listaFutbolistas){
            System.out.println(f.toString());
        }
    }
    public void verListaEntrenadores(){
        for(Entrenador e : listaEntrenadores){
            System.out.println(e.toString());
        }
    }
    public void verListaAyudantes(){
        for(Ayudante a : listaAyudantes){
            System.out.println(a.toString());
        }
    }
    public void verListaMasajistas(){
        for(Masajista m : listaMasajistas){
            System.out.println(m.toString());
        }
    }

    @Override
    public String toString() {
        return "Federacion{" +
                "Nombre = '" + nombre + '\'' +
                ", Fecha de Fundación = '" + fechaDeFundacion + '\'' +
                ", Copas Mundiales = '" + cantidadDeMundiales + '\'' +
                ", Lista de Futbolistas = " + listaFutbolistas +
                ", Lista de Entrenadores = " + listaEntrenadores +
                ", Lista de Ayudantes = " + listaAyudantes +
                ", Lista de Masajistas = " + listaMasajistas +
                '}';
    }

    public ArrayList<Futbolista> getListaFutbolistas() {
        return listaFutbolistas;
    }

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public ArrayList<Ayudante> getListaAyudantes() {
        return listaAyudantes;
    }

    public ArrayList<Masajista> getListaMasajistas() {
        return listaMasajistas;
    }
}
