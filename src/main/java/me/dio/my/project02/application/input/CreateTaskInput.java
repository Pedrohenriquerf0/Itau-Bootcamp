package me.dio.my.project02.application.input;

import java.util.Optional;

public record CreateTaskInput(String titulo, Optional<String> descricao) {
}
