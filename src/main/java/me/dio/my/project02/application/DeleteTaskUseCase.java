package me.dio.my.project02.application;

import me.dio.my.project02.dominio.ExceptionTaskNotID;
import me.dio.my.project02.dominio.TaskID;
import me.dio.my.project02.dominio.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskUseCase {
    private final TaskRepository repository;

    public DeleteTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public void execute(TaskID id){
        if(repository.findID(id).isEmpty()){
            throw new ExceptionTaskNotID(id.toString());
        }

        repository.delete(id);
    }
}
