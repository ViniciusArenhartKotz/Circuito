package com.example.circuito.Controller;

import com.example.circuito.Entity.Maratonista;
import com.example.circuito.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MaratonistaController {
    @Autowired
    private MaratonistaService maratonistaService;

    @PostMapping("maratonista")
    public Maratonista salvarMaratonista(@RequestBody Maratonista maratonista) {
        return maratonistaService.SalvarMaratonista(maratonista);
    }

    @GetMapping("maratonista/{id}")
    public Maratonista buscarMaratonista(@PathVariable Long id) {
        return maratonistaService.buscarMaratonista(id);
    }

    @GetMapping("maratonistas")
    public List<Maratonista> listaMaratonista() {
        return maratonistaService.listaMaratonista();
    }
}