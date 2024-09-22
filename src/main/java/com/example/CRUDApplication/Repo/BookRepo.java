package com.example.CRUDApplication.Repo;

import com.example.CRUDApplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepositiory<Book , Long> {

}
