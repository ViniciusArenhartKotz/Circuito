package com.example.circuito.Service;

import com.example.circuito.Entity.Maratona;
import com.example.circuito.Repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonaService {

    @Autowired
    private MaratonaRepository maratonaRepository;

    public Maratona buscarMaratona(Long id) {
        return maratonaRepository.findById(id).get();
    }

    public List<Maratona> listaMaratona() {
        return maratonaRepository.findAll();
    }

    public Maratona SalvarMaratona(Maratona maratona) {
        return maratonaRepository.save(maratona);
    }
}