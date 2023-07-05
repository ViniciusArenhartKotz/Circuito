package com.example.circuito.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Inscricao {

    @Id
    private Long id;
    private String circuito;

    private double valor_inscricao;

    @ManyToOne
    private Maratonista maratonista;


}
