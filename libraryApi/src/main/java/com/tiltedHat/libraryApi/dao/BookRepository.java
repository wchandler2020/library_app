package com.tiltedHat.libraryApi.dao;

import com.tiltedHat.libraryApi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
