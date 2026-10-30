package me.dio.my.project02.application;

import me.dio.my.project02.application.input.CreateTaskInput;
import me.dio.my.project02.application.output.TaskOutput;
import me.dio.my.project02.dominio.Task;
import me.dio.my.project02.dominio.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase {
    private final TaskRepository repository;

    public CreateTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(CreateTaskInput input){
        Task task = new Task(input.titulo(), input.descricao());
        var save = repository.save(task);
        return TaskOutput.from(save);
    }


}
