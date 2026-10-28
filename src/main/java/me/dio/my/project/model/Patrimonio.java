package me.dio.my.project.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // O Lombok cria todos os Getters, Setters, toString e equals/hashCode invisivelmente
public class Patrimonio {

    @Id // Diz que esse campo é a Chave Primária (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O famoso AUTO_INCREMENT do MariaDB

    private long id;
    private String nome;
    private Double valor;
    private String setor;
}
