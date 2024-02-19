package Actividad_5_2.Enunciado4;

public class Perro {
    private String nombre;
    private int edad;
    private boolean vacunado;
    private double peso;
    private String colorPelo;
    Perro(String nombre,int edad, boolean vacunado,double peso, String colorPelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.vacunado = vacunado;
        this.peso = peso;
        this.colorPelo = colorPelo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public boolean isBacunado() {
        return vacunado;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", vacunado=" + vacunado +
                ", peso=" + peso +
                ", colorPelo='" + colorPelo + '\'' +
                '}';
    }
}
