import entities.Author;
import entities.Book;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Author autor1 = new Author("J.K. Rowling", LocalDate.of(1965, 7, 31));
        Author autor2 = new Author("George R.R. Martin", LocalDate.of(1948, 9, 20));


        Book livro1 = new Book("Harry Potter e a Pedra Filosofal", autor1, true,
                LocalDate.of(2024, 11, 1), LocalDate.of(2024, 12, 2));

        Book livro2 = new Book("A Guerra dos Tronos", autor2, false,
                LocalDate.of(2024, 10, 15), LocalDate.of(2024, 11, 25));

        Scanner sc = new Scanner(System.in);

        char answer = 'S';

        while (answer == 'S'){
            System.out.print("Gostaria de ver os livros disponiveis?");
            answer = sc.next().toUpperCase().charAt(0);

            /*Local que vai fica a renderização do livro*/

            System.out.print("Qual o ID do livro que você deseja?: ");
            int id = sc.nextInt();

            System.out.print("Confirme o nome do livro em questão: ");
            String name = sc.nextLine();

        }

        System.out.println("Fim da aplicação.");

        sc.close();
    }
}