package es.iejandula.evaluacionalumnado.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Nota {
    @EmbeddedId
    private NotaId id;
    //Mapa para guardar las calificaciones
    @ElementCollection
    @MapKeyColumn(name = "pregunta_id")  // La columna para la clave (por ejemplo, id de la pregunta)
    @Column(name = "respuesta")          // La columna para el valor (respuesta)
    private Map<Integer, Integer> respuestas = new LinkedHashMap<>();

    //Relación con alumnoEvaluador
    @ManyToMany
    @MapsId("alumnoEmailEvaluador")
    @JoinTable(
            name = "nota_alumno",
            joinColumns = @JoinColumn(name = "nota_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Nota> alumnosEvualuadores;

    //Relación con alumnoEvaluado
    @ManyToMany
    @MapsId("alumnoEmailEvaluado")
    @JoinTable(
            name = "nota_alumno",
            joinColumns = @JoinColumn(name = "nota_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Nota> alumnosEvualuados;

    //Relación con evaluación
    @ManyToOne
    @MapsId("notaId")
    @JoinColumn(name = "evaluacion_id")
    private Evaluacion evaluacion;



    //Constructores, Getters and Setters
    public Nota() {}

    public Nota(NotaId id, Map<Integer, Integer> respuestas) {
        this.id = id;
        this.respuestas = respuestas;
    }

    public NotaId getId() {
        return id;
    }

    public void setId(NotaId id) {
        this.id = id;
    }

    public Map<Integer, Integer> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Map<Integer, Integer> respuestas) {
        this.respuestas = respuestas;
    }

    public double notaMedia() {
        // Convierte valores a double y calcula el promedio
        return this.respuestas.values().stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);  // Devuelve 0 si el mapa está vacío
    }
}

