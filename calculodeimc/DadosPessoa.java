package calculodeimc;

public class DadosPessoa {

    private double peso;
    private double altura;

    //set e get do peso

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }
    // set e get altura

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    //get do imc

    public double getImcPessoa() {
        double imcPessoa = peso / (altura * altura);
        return imcPessoa;
    }

}
