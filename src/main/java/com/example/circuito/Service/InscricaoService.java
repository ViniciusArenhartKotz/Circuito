package com.example.circuito.Service;

import com.example.circuito.Entity.Inscricao;
import com.example.circuito.Repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    public Inscricao salvarInscricao(Inscricao inscricao) {
        return inscricaoRepository.save(inscricao);
    }

    public List<Inscricao> listaInscricao() {
        return inscricaoRepository.findAll();
    }

    public Inscricao buscarInscricao(Long id) {
        return inscricaoRepository.findById(id).get();
    }
}