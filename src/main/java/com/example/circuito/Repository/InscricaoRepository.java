package com.example.circuito.Repository;

import com.example.circuito.Entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository   extends JpaRepository<Inscricao, Long> {
}
