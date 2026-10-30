package me.dio.my.project02.dominio;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import java.util.Optional;

@Entity
@Getter
@Setter
public class Task {
    private TaskID id;
    private String titulo;
    private Optional<String> descricao;
    private TaskStatus status;

    public Task(String titulo, Optional<String> descricao) {
        Assert.notNull(titulo, "Titulo não pode se null");
        this.id = new TaskID();
        this.titulo = titulo;
        this.status = TaskStatus.PENDENTE;
        this.descricao = descricao;
    }

    public void update(Optional<String> titulo, Optional<String> descricao, Optional<TaskStatus> status){
        titulo.ifPresent(this::setTitulo);
        descricao.ifPresent(d -> this.setDescricao(Optional.of(d)));
        status.ifPresent(this::setStatus);
    }
}
