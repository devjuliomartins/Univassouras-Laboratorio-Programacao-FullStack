package br.com.juliomartins.livraria;

import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<String> books;

    public BookController() {
        books = new ArrayList<>();
        books.add("Código Limpo");
        books.add("Python para Principiantes");
        books.add("O Programador Pragmático");
    }

    @GetMapping
    public List<String> listarLivros() {
        return books;
    }
}