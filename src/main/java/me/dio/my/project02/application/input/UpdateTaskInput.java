package me.dio.my.project02.application.input;

import me.dio.my.project02.dominio.TaskStatus;

import java.util.Optional;

public record UpdateTaskInput(Optional<String> titulo, Optional<String> descricao, Optional<TaskStatus> status){

}
