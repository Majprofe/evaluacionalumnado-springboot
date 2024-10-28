package es.iejandula.evaluacionalumnado.repository;

import es.iejandula.evaluacionalumnado.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}
