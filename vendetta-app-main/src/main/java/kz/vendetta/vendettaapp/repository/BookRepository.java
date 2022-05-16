package kz.vendetta.vendettaapp.repository;

import kz.vendetta.vendettaapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
