package xyz.fengqing11.springbootmongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.fengqing11.springbootmongodb.pojo.Book;

import java.util.List;

public interface BookDao extends MongoRepository<Book, Integer> {
    List<Book> findByAuthorContains(String author);

    Book findByNameEquals(String name);
}
