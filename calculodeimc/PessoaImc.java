package calculodeimc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PessoaImc {
    public static final DecimalFormat df = new DecimalFormat();
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        DadosPessoa p1 = new DadosPessoa();

        System.out.println("peso: ");
        p1.setPeso(dados.nextDouble());

        System.out.println("altura");
        p1.setAltura(dados.nextDouble());

        double imc = p1.getImcPessoa();
        System.out.println("imc: " + df.format((imc)));


    }
}
