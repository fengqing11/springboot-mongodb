package xyz.fengqing11.springbootmongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fengqing11.springbootmongodb.dao.BookDao;
import xyz.fengqing11.springbootmongodb.pojo.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookDao bookDao;

    @GetMapping("/test")
    public void test() {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("奥啦i十九点111asdas");
        b1.setAuthor("啊iOS的话111asd");
        books.add(b1);

        Book b2 = new Book();
        b2.setId(2);
        b2.setName("奥i十九点222222asdad");
        b2.setAuthor("啊iOS的话222222222asdad");
        books.add(b2);
        bookDao.insert(books);

        List<Book> books1 = bookDao.findByAuthorContains("啊");
        System.out.println(books1);

        Book book = bookDao.findByNameEquals("奥啦i十九点111asdas");
        System.out.println(book);


    }

}
