package br.com.juliomartins.livraria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books;

    public BookController() {
        books = new ArrayList<>();
        books.add(new Book("Código Limpo", "Robert C. Martin"));
        books.add(new Book("Python para Principiantes", "Michael Dawson"));
        books.add(new Book("O Programador Pragmático", "Andrew Hunt e David Thomas"));
    }

    @GetMapping
    public List<Book> listarLivros() {
        return books;
    }
}