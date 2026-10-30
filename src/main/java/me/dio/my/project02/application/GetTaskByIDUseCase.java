package me.dio.my.project02.application;

import me.dio.my.project02.application.output.TaskOutput;
import me.dio.my.project02.dominio.ExceptionTaskNotID;
import me.dio.my.project02.dominio.TaskID;
import me.dio.my.project02.dominio.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class GetTaskByIDUseCase {
    private final TaskRepository repository;

    public GetTaskByIDUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(TaskID id){
        return repository.findID(id).map(TaskOutput::from).orElseThrow(() -> new ExceptionTaskNotID("ID não encontrado"));
    }
}
