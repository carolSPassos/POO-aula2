package modificadoresDeAcesso;

import java.util.Scanner;

public class PessoaTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("idade: ");

        p1.setIdade(sc.nextInt());
        System.out.println("idade: " + p1.getIdade());

    }
}
