package com.java.global_exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.global_exception.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
