

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase objeto de Alumno
 * @author Maikel
 */
public class Alumno {


    private String nombre;

    private String email;

    private ArrayList<String> modulosProfesionalesMatriculado;

    private Date fechaNacimiento;

    /**
     * Crea un objeto de tipo Alumno a partir de los parametros definidos abajo.
     * @param nombre String
     * @param email String
     * @param fechaNacimiento Date
     */
    public Alumno(String nombre, String email, Date fechaNacimiento) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        modulosProfesionalesMatriculado = new ArrayList<>();
    }

    /**
     * Mostrar Obtener el nombre del Alumno
     * @return nombre String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica y/o asigna el nombre del Alumno
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Mostrar Obtener el email del Alumno
     * @return email String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica y/o asigna el email del Alumno
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Mostrar Obtener módulos profesionales en los que el Alumno está matriculado
     * @return Listado de módulos profesionales
     */
    public ArrayList<String> getModulosProfesionalesMatriculado() {
        return modulosProfesionalesMatriculado;
    }

    /**
     * Añade nuevo módulo profesional al Alumno
     * @param moduloProfesional String
     */
    public void addModulosProfesionalesMatriculado(String moduloProfesional) {
        this.modulosProfesionalesMatriculado.add(moduloProfesional);
    }

    /**
     * Mostrar Obtener fecha de nacimiento del Alumno
     * @return fecha nacimiento Date
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Modificar y/o asigna la fecha de nacieminto al Alumno
     * @param fechaNacimiento Date
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     *Resultado en forma de cadena de caracteres del objeto Alumno
     * @return String
     */
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", modulosProfesionalesMatriculado=" + modulosProfesionalesMatriculado +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
