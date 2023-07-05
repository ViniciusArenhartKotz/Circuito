package com.example.circuito.Service;

import com.example.circuito.Entity.Maratonista;
import com.example.circuito.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {
    @Autowired
    private MaratonistaRepository maratonistaRepository;

    public Maratonista SalvarMaratonista(Maratonista maratonista) {
        return maratonistaRepository.save(maratonista);
    }

    public List<Maratonista> listaMaratonista() {
        return maratonistaRepository.findAll();
    }

    public Maratonista buscarMaratonista(Long id) {
        return maratonistaRepository.findById(id).get();
    }
}


