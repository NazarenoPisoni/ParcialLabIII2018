package models;

public class Futbolista extends Integrante {
    private String numeroCamiseta;
    private String puesto;

    public Futbolista(String nombre, String apellido, String edad, String numeroCamiseta, String puesto) {
        super(nombre, apellido, edad);
        this.numeroCamiseta = numeroCamiseta;
        this.puesto = puesto;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "Nombre y Apellido = '" + getNombre() + " " + getApellido() + '\'' +
                ", Edad = '" + getEdad() + '\'' +
                ", Número de Camiseta = '" + numeroCamiseta + '\'' +
                ", Puesto = '" + puesto + '\'' +
                '}';
    }

}




