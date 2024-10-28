package es.iejandula.evaluacionalumnado.service;

import es.iejandula.evaluacionalumnado.exception.ResourceNotFoundException;
import es.iejandula.evaluacionalumnado.models.Alumno;
import es.iejandula.evaluacionalumnado.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Transactional
    public Alumno crearAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }
    public Alumno consultarAlumno(String email) {
        return alumnoRepository.findById(email)
                .orElseThrow(() -> new ResourceNotFoundException("Alumno no encontrado"));
    }


}
