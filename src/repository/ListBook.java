package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class ListBook {

    private final List<Book> bookList = new ArrayList<>();

    public void setBookList(Book book){
        bookList.add(book);
    }

    public List<Book> getBookList(){
        return bookList;
    }

}
