import models.Ayudante;
import models.Entrenador;
import models.Federacion;
import models.Futbolista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Federacion afa = new Federacion("Asociación de Fútbol Argentino", "18/10/1899",
                "3", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        try{
            afa.agregarFutbolista(new Futbolista("Emiliano", "Martínez", "30", "1", "Arquero"));
            afa.agregarFutbolista(new Futbolista("Nicolás", "Otamendi", "35", "2", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Nicolás", "Tagliafico", "29", "3", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Gonzalo", "Montiel", "25", "4", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Leandro", "Paredes", "32", "5", "Mediocampista"));
            afa.agregarFutbolista(new Futbolista("Cuti", "Romero", "24", "6", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Rodrigo", "De Paul", "28", "7", "Mediocampista"));
            afa.agregarFutbolista(new Futbolista("Enzo", "Fernández", "23", "8", "Mediocampista"));
            afa.agregarFutbolista(new Futbolista("Julián", "Álvarez", "22", "9", "Delantero"));
            afa.agregarFutbolista(new Futbolista("Lionel", "Messi", "35", "10", "Delantero"));
            afa.agregarFutbolista(new Futbolista("Ángel", "Di María", "35", "11", "Delantero"));
            afa.agregarFutbolista(new Futbolista("Franco", "Armani", "33", "12", "Arquero"));
            afa.agregarFutbolista(new Futbolista("Germán", "Pezzela", "30", "13", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Lisandro", "Martínez", "24", "14", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Nicolás", "González", "24", "15", "Mediocampista"));
            afa.agregarFutbolista(new Futbolista("Alexis", "Mac Allister", "26", "16", "Mediocampista"));
            afa.agregarFutbolista(new Futbolista("Giovani", "Lo Celso", "28", "17", "Mediocampista"));
            afa.agregarFutbolista(new Futbolista("Thiago", "Almada", "25", "18", "Mediocampista"));
            afa.agregarFutbolista(new Futbolista("Marcos", "Acuña", "30", "19", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Lautaro", "Martínez", "27", "20", "Delantero"));
            afa.agregarFutbolista(new Futbolista("Ángel", "Correa", "30", "21", "Delantero"));
            afa.agregarFutbolista(new Futbolista("Nicolás", "Molina", "25", "22", "Defensor"));
            afa.agregarFutbolista(new Futbolista("Alejandro", "Gómez", "34", "23", "Delantero"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            afa.agregarEntrenador(new Entrenador("Lionel", "Scaloni", "43", "4-4-2", "Moderado"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        afa.agregarAyudante(new Ayudante("Pablo", "Aimar", "42", "Táctica"));
        afa.agregarAyudante(new Ayudante("Walter", "Samuel", "45", "Defensa"));
        afa.agregarAyudante(new Ayudante("Roberto", "Ayala", "44", "Defensa"));

        System.out.println(afa.toString());
    }
}