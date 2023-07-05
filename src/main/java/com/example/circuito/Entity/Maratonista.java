package com.example.circuito.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Maratonista {

    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String grupo_sanguineo;
    private int rg;
    private  int numero_emergencia;
    private int numero_celular;

    @JsonIgnore
    @OneToMany(mappedBy = "maratonista")
    private List<Inscricao> inscricaos;
}
