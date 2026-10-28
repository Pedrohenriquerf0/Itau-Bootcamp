package me.dio.my.project.service;

import me.dio.my.project.model.Patrimonio;
import me.dio.my.project.repository.PatrimonioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrimonioService {
    private final PatrimonioRepository patrimonioRepository;

    // O Spring injeta o repositório automaticamente aqui
    public PatrimonioService(PatrimonioRepository repository) {
        this.patrimonioRepository = repository;
    }

    public List<Patrimonio> listarTodos(){
        return patrimonioRepository.findAll();
    }

    public Patrimonio cadastra(Patrimonio patrimonio){
        return patrimonioRepository.save(patrimonio);
    }
}
