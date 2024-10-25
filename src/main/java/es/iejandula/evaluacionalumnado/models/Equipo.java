package es.iejandula.evaluacionalumnado.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    //Relaciones
    //Relación con alumnos
    @ManyToMany
    @JoinTable(
            name = "equipo_alumno",
            joinColumns = @JoinColumn(name = "equipo_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Alumno> alumnos;

    //Relación con evaluación
    @ManyToMany
    @JoinTable(
            name = "equipo_evaluacion",
            joinColumns = @JoinColumn(name = "equipo_id"),
            inverseJoinColumns = @JoinColumn(name = "evaluacion_id")
    )
    private List<Evaluacion> evaluaciones;


    public Equipo() {
    }

    public Equipo(List<Alumno> alumnos, List<Evaluacion> evaluaciones) {
        this.alumnos = alumnos;
        this.evaluaciones = evaluaciones;
    }

    public Long getId() {
        return id;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
}
