package es.iejandula.evaluacionalumnado.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NotaId implements Serializable {
    private String alumnoEmailEvaluador;
    private String alumnoEmailEvaluado;
    private Long evaluacionId;

    public NotaId(String alumnoEmailEvaluador, String alumnoEmailEvaluado, Long evaluacionId) {
        this.alumnoEmailEvaluador = alumnoEmailEvaluador;
        this.alumnoEmailEvaluado = alumnoEmailEvaluado;
        this.evaluacionId = evaluacionId;
    }
    public NotaId(){}

    public String getAlumnoEmailEvaluador() {
        return alumnoEmailEvaluador;
    }

    public void setAlumnoEmailEvaluador(String alumnoEmailEvaluador) {
        this.alumnoEmailEvaluador = alumnoEmailEvaluador;
    }

    public String getAlumnoEmailEvaluado() {
        return alumnoEmailEvaluado;
    }

    public void setAlumnoEmailEvaluado(String alumnoEmailEvaluado) {
        this.alumnoEmailEvaluado = alumnoEmailEvaluado;
    }

    public Long getNotaId() {
        return evaluacionId;
    }

    public void setNotaId(Long notaId) {
        this.evaluacionId = notaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaId notaId1 = (NotaId) o;
        return Objects.equals(alumnoEmailEvaluador, notaId1.alumnoEmailEvaluador) && Objects.equals(alumnoEmailEvaluado, notaId1.alumnoEmailEvaluado) && Objects.equals(evaluacionId, notaId1.evaluacionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumnoEmailEvaluador, alumnoEmailEvaluado, evaluacionId);
    }
}
