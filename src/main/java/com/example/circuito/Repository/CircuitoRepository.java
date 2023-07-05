package com.example.circuito.Repository;

import com.example.circuito.Entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository   extends JpaRepository<Circuito, Long> {
}
