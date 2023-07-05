package com.example.circuito.Controller;

import com.example.circuito.Entity.Inscricao;
import com.example.circuito.Service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping("inscricao")
    public Inscricao salvarInscricao(@RequestBody Inscricao inscricao) {
        return inscricaoService.salvarInscricao(inscricao);
    }

    @GetMapping("inscricao/{id}")
    public Inscricao buscarInscricao(@PathVariable Long id) {
        return inscricaoService.buscarInscricao(id);
    }

    @GetMapping("incricoes")
    public List<Inscricao> listaInscricao() {
        return inscricaoService.listaInscricao();
    }
}








