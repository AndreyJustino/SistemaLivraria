import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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