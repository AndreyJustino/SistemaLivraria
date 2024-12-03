package repository;

import model.Author;

import java.util.ArrayList;
import java.util.List;

public class ListAuthor {
    private final List<Author> authorList = new ArrayList<>();

    public void setAuthorList(Author author){
        authorList.add(author);
    }

    public List<Author> getAuthorList(){
        return authorList;
    }
}
