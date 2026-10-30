package me.dio.my.project02.dominio;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Task save(Task task);
    List<Task> findAll();
    Optional<Task> findID(TaskID id);
    void delete(TaskID id);
}
