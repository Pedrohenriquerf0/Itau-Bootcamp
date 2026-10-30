package me.dio.my.project02.dominio;

import org.springframework.util.Assert;

import java.util.UUID;

public record TaskID(UUID id) {
    public TaskID{
        Assert.notNull(id,"ID não pode se null");
    }

    public TaskID(){
        this(UUID.randomUUID());
    }
}
