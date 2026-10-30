package me.dio.my.project02.application;

import me.dio.my.project02.application.input.CreateTaskInput;
import me.dio.my.project02.application.output.TaskOutput;
import me.dio.my.project02.dominio.TaskRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CreateTaskUseCaseTest {
    @Mock
    TaskRepository repository;
    @InjectMocks
    CreateTaskUseCase taskUseCase;

    @Test
    void  createTaskSucesso(){
        var input = new CreateTaskInput("Estudando JAVA", Optional.of("Finaliza modulo"));

        TaskOutput output = taskUseCase.execute(input);

    }

}