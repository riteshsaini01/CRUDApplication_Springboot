package com.example.CRUDApplication.Controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUDApplication.Repo.BookRepo;
import com.example.CRUDApplication.model.Book;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;


@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    
    @GetMapping("/getAllBooks/")
    public ResponseEntity<List<Book>> getAllBooks (){

        try {
            List<Book> bookList = new ArrayList<>();
            bookRepo.findAll().forEach(bookList::add);

            if(bookList.isEmpty()){
                return new ResponseEntity<>(bookList, HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(HttpStatus.OK);
            
        } catch (Exception e) {
           
        }

    }
    
    @GetMapping("/getBookByID/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){

        Optional<Book> bookData = bookRepo.findById(id);

        if(bookData.isPresent()){
            return new ResponseEntity<>(bookData.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping
    public void addBook(){

    }

    @PostMapping
    public void updateBookById(){

    }

    @DeleteMapping
    public void deleteBookById(){

    }

}
