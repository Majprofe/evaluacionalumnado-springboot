package es.iejandula.evaluacionalumnado.service;

import es.iejandula.evaluacionalumnado.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

}
