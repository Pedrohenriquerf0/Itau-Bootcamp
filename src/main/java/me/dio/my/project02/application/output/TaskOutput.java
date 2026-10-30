package me.dio.my.project02.application.output;

import me.dio.my.project02.dominio.Task;

import java.util.Optional;

public record TaskOutput(String id, String titulo, String status, Optional<String> descricao) {
    public static TaskOutput from(Task task){
        return  new TaskOutput(task.getId().id().toString(), task.getTitulo(), task.getStatus().name(), task.getDescricao());
    }
}
