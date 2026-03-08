package com.pradeep.students_common.repository;

import java.util.List;

import com.pradeep.students_common.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, String> {
    List<Books> findByTitle(String title);
    List<Books> findByAuthor(String author);
    List<Books> findByIsbn(String isbn);
    List<Books> findByPrice(double price);
    List<Books> findByPublicationYear(int publicationYear);
    //List<Books> findByShortDescription(String shortDescription);

}
