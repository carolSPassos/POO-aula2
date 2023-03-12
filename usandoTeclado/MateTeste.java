package usandoTeclado;

import java.util.Scanner;

public class MateTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mate m = new Mate();
        System.out.println("numero1");
        int x = sc.nextInt();

        System.out.println("numero2");
        int y = sc.nextInt();

        System.out.println(m.total);
    }
}
