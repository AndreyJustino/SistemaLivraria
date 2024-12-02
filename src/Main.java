import model.Author;
import model.Book;
import repository.ListAuthor;
import repository.ListBook;

import java.time.LocalDate;
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
        Book livro2 = new Book("A Guerra dos Tronos", autor2, false,
                LocalDate.of(2024, 10, 15), LocalDate.of(2024, 11, 25));
        Book livro3 = new Book("O Senhor dos Anéis: A Sociedade do Anel", autor3, true,
                LocalDate.of(2024, 10, 20), LocalDate.of(2024, 11, 30));
        Book livro4 = new Book("Assassinato no Expresso do Oriente", autor4, true,
                LocalDate.of(2024, 10, 22), LocalDate.of(2024, 12, 1));
        Book livro5 = new Book("O Iluminado", autor5, false,
                LocalDate.of(2024, 11, 5), LocalDate.of(2024, 12, 2));

        ListBook.setBookList(livro1);
        ListBook.setBookList(livro2);
        ListBook.setBookList(livro3);
        ListBook.setBookList(livro4);
        ListBook.setBookList(livro5);

        Scanner sc = new Scanner(System.in);

        char answer = 'S';

        while (answer == 'S'){

            for (Book value : ListBook.getBookList()){

                System.out.println("--------------------------------------------------------------");

                System.out.println(
                        "ID: " + value.getId() + ", \n" +
                        "Titulo: " + value.getTitle() + ", \n" +
                        "Autor: " + value.getAuthor().getName() + ", \n" +
                        "Disponivel: " + value.getAvailable());
            }

            System.out.println("--------------------------------------------------------------");

            System.out.print("Qual o ID do livro que você deseja?: ");
            int id = sc.nextInt();

            System.out.print("Confirme o nome do livro em questão: ");
            String name = sc.nextLine();

            System.out.print("Gostaria de ver os livros disponiveis?");
            answer = sc.next().toUpperCase().charAt(0);

        }

        System.out.println("Fim da aplicação.");

        sc.close();
    }
}