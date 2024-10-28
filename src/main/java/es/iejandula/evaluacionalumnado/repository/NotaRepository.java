package es.iejandula.evaluacionalumnado.repository;

import es.iejandula.evaluacionalumnado.models.Nota;
import es.iejandula.evaluacionalumnado.models.NotaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, NotaId> {
}
