package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class ListBook {

    private static final List<Book> bookList = new ArrayList<>();

    public static void setBookList(Book book){
        bookList.add(book);
    }

    public static List<Book> getBookList(){
        return bookList;
    }

}
