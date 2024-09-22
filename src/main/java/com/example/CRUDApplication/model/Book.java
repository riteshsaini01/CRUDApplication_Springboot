package com.example.CRUDApplication.model;

import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    Private Long id;
    Private String title;
    Private String author;
    


}
