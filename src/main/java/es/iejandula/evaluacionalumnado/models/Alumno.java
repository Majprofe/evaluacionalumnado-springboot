package es.iejandula.evaluacionalumnado.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alumno {
    @Id
    private String email;
    private String nombre;
    private String apellidos;

    //Relación con notas
    @ManyToMany(mappedBy = "alumnos")
    private List<Nota> notas;

    //Relación con evaluación
    @ManyToMany(mappedBy = "alumnos")
    private List<Evaluacion> evaluaciones;

    //Relación con equipo
    @ManyToMany(mappedBy = "alumnos")
    private List<Equipo> equipos;

    public Alumno () {
    }

    public Alumno(String email, String nombre, String apellidos) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
