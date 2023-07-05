package com.example.circuito.Service;

import com.example.circuito.Entity.Circuito;
import com.example.circuito.Repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {
    @Autowired
    private CircuitoRepository circuitoRepository;

    public List<Circuito> listaCircuito() {
        return circuitoRepository.findAll();
    }

    public Circuito salvarCircuito(Circuito circuito) {
        return circuitoRepository.save(circuito);
    }

    public Circuito buscarCircuito(Long id) {
        return circuitoRepository.findById(id).get();
    }
}