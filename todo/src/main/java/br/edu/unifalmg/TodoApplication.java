package br.edu.unifalmg;

import br.edu.unifalmg.impl.FileChoreRepository;
import br.edu.unifalmg.repository.ChoreRepository;
import br.edu.unifalmg.service.ChoreService;

import java.nio.file.Path;
import java.time.LocalDate;

public class TodoApplication {

    public static void main(String[] args) {

        Path testFilePath = null;
        ChoreRepository repository;
        repository = new FileChoreRepository(testFilePath);
        ChoreService service = new ChoreService(repository);
        service.loadChores();
        service.addChore("Testing write on file feature", LocalDate.now());
        System.out.println("Tamanho da lista de chores: " + service.getChores().size());
        service.saveChores();
    }

}