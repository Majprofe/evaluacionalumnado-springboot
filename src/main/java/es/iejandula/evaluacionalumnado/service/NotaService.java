package es.iejandula.evaluacionalumnado.service;

import es.iejandula.evaluacionalumnado.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService {
    @Autowired
    private NotaRepository notaRepository;
}
