import model.Author;
import model.Book;
import model.Library;
import repository.ListAuthor;
import repository.ListBook;
import repository.ListLend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Author autor1 = new Author("J.K. Rowling", LocalDate.of(1965, 7, 31));
        Author autor2 = new Author("George R.R. Martin", LocalDate.of(1948, 9, 20));
        Author autor3 = new Author("J.R.R. Tolkien", LocalDate.of(1892, 1, 3));
        Author autor4 = new Author("Agatha Christie", LocalDate.of(1890, 9, 15));
        Author autor5 = new Author("Stephen King", LocalDate.of(1947, 9, 21));

        ListAuthor.setAuthorList(autor1);
        ListAuthor.setAuthorList(autor2);
        ListAuthor.setAuthorList(autor3);
        ListAuthor.setAuthorList(autor4);
        ListAuthor.setAuthorList(autor5);

        Book livro1 = new Book("Harry Potter e a Pedra Filosofal", autor1, true,
                LocalDate.of(2024, 11, 1), LocalDate.of(2024, 12, 2));
        Book livro2 = new Book("A Guerra dos Tronos", autor2, true,
                LocalDate.of(2024, 10, 15), LocalDate.of(2024, 11, 25));
        Book livro3 = new Book("O Senhor dos Anéis: A Sociedade do Anel", autor3, true,
                LocalDate.of(2024, 10, 20), LocalDate.of(2024, 11, 30));
        Book livro4 = new Book("Assassinato no Expresso do Oriente", autor4, true,
                LocalDate.of(2024, 10, 22), LocalDate.of(2024, 12, 1));
        Book livro5 = new Book("O Iluminado", autor5, true,
                LocalDate.of(2024, 11, 5), LocalDate.of(2024, 12, 2));

        ListBook.setBookList(livro1);
        ListBook.setBookList(livro2);
        ListBook.setBookList(livro3);
        ListBook.setBookList(livro4);
        ListBook.setBookList(livro5);

        Library library = new Library(ListBook.getBookList(), ListAuthor.getAuthorList(), ListLend.getLendList());

        Scanner sc = new Scanner(System.in);

        char answer = 'S';

        while (answer == 'S'){

            System.out.println("O que deseja fazer: " +
                    "\nAdicionar um novo Livro? [1]" +
                    "\nListar todos os livros? [2]" +
                    "\nRealizar empréstimo de um livro? [3]" +
                    "\nEncerrar sistema? [0]");

            int option = sc.nextInt();

            System.out.println("--------------------------------------------------------------");

            switch (option){
                case 1:
                    sc.nextLine();

                    System.out.println("Primeiro vamos cadastrar o autor:");

                    System.out.print("Qual o nome do autor?");
                    String nameAuthor = sc.nextLine();

                    System.out.print("Qual a data de nascimento completa?");
                    String date = sc.next();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate birth = LocalDate.parse(date, formatter);

                    boolean resultName = false;
                    boolean resultBirth = false;
                    for(Author value : library.getAuthors()){
                        resultName = Objects.equals(value.getName(), nameAuthor);
                        resultBirth = Objects.equals(value.getBirth(), birth);

                        if (resultName && resultBirth){
                            break;
                        }
                    }

                    Author author;

                    if (!resultName && !resultBirth){
                        author = new Author(nameAuthor, birth);
                        ListAuthor.setAuthorList(author);
                        library.setAuthors(ListAuthor.getAuthorList());
                    }

                    System.out.println("--------------------------------------------------------------");

                    System.out.println("Agora vamos cadastrar o livro:");

                    System.out.print("Qual o titulo do livro? ");
                    sc.nextLine();
                    String title = sc.nextLine();

                    boolean resultTitle = false;
                    for(Book value: library.getBooks()){
                        resultTitle = Objects.equals(value.getTitle(), title);

                        if (resultTitle){
                            break;
                        }
                    }

                    Book book;

                    if(!resultTitle){
                        book = new Book(title, new Author(nameAuthor, birth), true, LocalDate.now(), LocalDate.now());
                        ListBook.setBookList(book);
                        library.setBooks(ListBook.getBookList());
                    }else{
                        System.out.println("Livro ja cadastrado!");
                    }

                    System.out.println("--------------------------------------------------------------");

                    break;
                case 2:

                    System.out.println("Livros disponiveis:");
                    for (Book value : ListBook.getBookList()){

                        System.out.println("--------------------------------------------------------------");

                        System.out.println(
                                "ID: " + value.getId() + ", \n" +
                                        "Titulo: " + value.getTitle() + ", \n" +
                                        "Autor: " + value.getAuthor().getName() + ", \n" +
                                        "Disponivel: " + value.getAvailable());
                    }

                    System.out.println("--------------------------------------------------------------");

                    break;
                case 3:
                    //...
                    break;
                case 0:
                    answer = 'N';
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

            /*
            System.out.print("Qual o ID do livro que você deseja?: ");
            int id = sc.nextInt();

            System.out.print("Confirme o nome do livro em questão: ");
            String name = sc.nextLine();

            */

            if (answer == 'N'){
                break;
            }

            System.out.print("Gostaria de ver as opções?[S/N] ");
            answer = sc.next().toUpperCase().charAt(0);

        }

        System.out.println("Fim da aplicação.");

        sc.close();
    }
}