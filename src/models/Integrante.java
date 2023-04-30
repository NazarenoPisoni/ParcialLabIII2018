package models;

public class Integrante {
    private String nombre;
    private String apellido;
    private String edad;

    public Integrante() {
    }

    public Integrante(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void viajar(){
        System.out.println(getNombre() + " " + getApellido() + " está viajando.");
    }

    public void concentrar(){
        System.out.println(getNombre() + " " + getApellido() + " está concentrando.");
    }

    public void jugar(){
        System.out.println(getNombre() + " " + getApellido() + " está jugando el partido.");
    }

    public void prepararEntrenamiento(){
        System.out.println(getNombre() + " " + getApellido() + " está preparando el entrenamiento.");
    }
}
