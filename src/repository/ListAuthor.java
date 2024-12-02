package repository;

import model.Author;

import java.util.ArrayList;
import java.util.List;

public class ListAuthor {
    private static final List<Author> authorList = new ArrayList<>();

    public static void setAuthorList(Author author){
        authorList.add(author);
    }

    public static List<Author> getAuthorList(){
        return authorList;
    }
}
