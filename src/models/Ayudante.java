package models;

public class Ayudante extends Integrante{
    private String metodologia;


    public Ayudante(String nombre, String apellido, String edad, String metodologia) {
        super(nombre, apellido, edad);
        this.metodologia = metodologia;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    @Override
    public String toString() {
        return "Ayudante{" +
                "Nombre y Apellido = '" + getNombre() + " " + getApellido() + '\'' +
                ", Edad = '" + getEdad() + '\'' +
                ", Metodología = '" + metodologia + '\'' +
                '}';
    }
}
