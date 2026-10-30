package me.dio.my.project02.application;

import me.dio.my.project02.application.input.UpdateTaskInput;
import me.dio.my.project02.application.output.TaskOutput;
import me.dio.my.project02.dominio.ExceptionTaskNotID;
import me.dio.my.project02.dominio.Task;
import me.dio.my.project02.dominio.TaskID;
import me.dio.my.project02.dominio.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateTaskUseCase {
    private final TaskRepository repository;

    public UpdateTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput exxecutre(TaskID taskID, UpdateTaskInput updateTaskInput){
        Task task = repository.findID(taskID).orElseThrow(() -> new ExceptionTaskNotID(taskID.toString()));
        task.update(updateTaskInput.titulo(), updateTaskInput.descricao(), updateTaskInput.status());
        var save = repository.save(task);
        return TaskOutput.from(save);
    }
}
