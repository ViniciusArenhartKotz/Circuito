package com.example.circuito.Repository;

import com.example.circuito.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonistaRepository  extends JpaRepository<Maratonista, Long> {
}
