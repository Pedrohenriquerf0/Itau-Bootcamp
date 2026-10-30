package me.dio.my.project02.infrastructure.repository;

import me.dio.my.project02.dominio.Task;
import me.dio.my.project02.dominio.TaskID;
import me.dio.my.project02.dominio.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
    private Map<TaskID, Task> storage = new HashMap<>();
    @Override
    public Task save(Task task) {
        storage.put(task.getId(), task);
        return task;
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Task> findID(TaskID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public void delete(TaskID id) {
        storage.remove(id);
    }
}
