package models;

public class Masajista extends Integrante{
    private String titulo;
    private String aniosExperiencia;

    public Masajista(String nombre, String apellido, String edad, String titulo, String aniosExperiencia) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "Nombre y Apellido = '" + getNombre() + getApellido() + '\'' +
                "Edad = '" + getEdad() + '\'' +
                "Título = '" + titulo + '\'' +
                ", Años de Experiencia = '" + aniosExperiencia + '\'' +
                '}';
    }

    public void asistir(){
        System.out.println(getNombre() + " " + getApellido() + "está asistiendo a un jugador.");
    }
}
