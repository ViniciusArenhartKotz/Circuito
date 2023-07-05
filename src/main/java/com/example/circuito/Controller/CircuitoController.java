package com.example.circuito.Controller;

import com.example.circuito.Entity.Circuito;
import com.example.circuito.Service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CircuitoController {

    @Autowired
    private CircuitoService circuitoService;

    @PostMapping("circuito")
    public Circuito salvarCircuito(@RequestBody Circuito circuito) {
        return circuitoService.salvarCircuito(circuito);
    }

    @GetMapping("circuito/{id}")
    public Circuito buscarCircuito(@PathVariable Long id) {
        return circuitoService.buscarCircuito(id);
    }

    @GetMapping("circuitos")
    public List<Circuito> listaCircuito() {
        return circuitoService.listaCircuito();
    }
}



