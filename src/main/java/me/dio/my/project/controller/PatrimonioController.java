package me.dio.my.project.controller;

import me.dio.my.project.model.Patrimonio;
import me.dio.my.project.service.PatrimonioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patrimonios")
public class PatrimonioController {
    private final PatrimonioService service;

    public PatrimonioController(PatrimonioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Patrimonio> buscarEquipamento(){
        return service.listarTodos();
    }

    @PostMapping
    public Patrimonio adicionarEquipamento(Patrimonio patrimonio){
        return service.cadastra(patrimonio);
    }
}
