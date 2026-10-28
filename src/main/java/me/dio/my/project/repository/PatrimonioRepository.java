package me.dio.my.project.repository;

import me.dio.my.project.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {
    // Você diz para o Spring: "Tome conta da classe Patrimonio, onde o ID é um Long"
    // Fim. Os métodos save(), findAll(), findById() e deleteById() já estão prontos aqui dentro.
}
