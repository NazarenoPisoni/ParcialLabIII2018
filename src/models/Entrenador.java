package models;

public class Entrenador extends Integrante{
    private String sistemaDeJuego;
    private String estilo;


    public Entrenador(String nombre, String apellido, String edad, String sistemaDeJuego, String estilo) {
        super(nombre, apellido, edad);
        this.sistemaDeJuego = sistemaDeJuego;
        this.estilo = estilo;
    }


    public String getSistemaDeJuego() {
        return sistemaDeJuego;
    }

    public void setSistemaDeJuego(String sistemaDeJuego) {
        this.sistemaDeJuego = sistemaDeJuego;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "Nombre y Apellido = '" + getNombre() + " " + getApellido() + '\'' +
                ", Edad = '" + getEdad() + '\'' +
                ", Sistema de Juego = '" + sistemaDeJuego + '\'' +
                ", Estilo = '" + estilo + '\'' +
                '}';
    }
}
