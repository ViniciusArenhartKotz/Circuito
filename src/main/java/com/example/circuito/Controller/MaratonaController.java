package com.example.circuito.Controller;

import com.example.circuito.Entity.Maratona;
import com.example.circuito.Service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MaratonaController {

    @Autowired
    private MaratonaService maratonaService;

    @PostMapping("maratona")
    public Maratona salvarMaratona(@RequestBody Maratona maratona) {
        return maratonaService.SalvarMaratona(maratona);
    }

    @GetMapping("maratona/{id}")
    public Maratona buscarMaratona(@PathVariable Long id) {
        return maratonaService.buscarMaratona(id);
    }

    @GetMapping("maratonas")
    public List<Maratona> listaMaratona() {
        return maratonaService.listaMaratona();
    }
}





