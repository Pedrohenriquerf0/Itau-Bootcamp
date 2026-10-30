package me.dio.my.project02.application;

import me.dio.my.project02.application.output.TaskOutput;
import me.dio.my.project02.dominio.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTaskUseCase {
    private final TaskRepository repository;

    public GetTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public List<TaskOutput> execute(){
        return repository.findAll().stream().map(TaskOutput::from).toList();
    }
}
