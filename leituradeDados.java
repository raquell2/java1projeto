import java.util.Scanner;

public class leituradeDados {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um valor inteiro(int):");
        int entradaInt = scan.nextInt();
        System.out.printf("Digite um valor real(double):");
        double entradaDouble = scan.nextDouble();
        System.out.printf("Digite um valor logico(boolean):");
        boolean entradaBooelan = scan.nextBoolean();
        System.out.printf("Digite uma palavra (String):");
        String entradaPalavra = scan.next();
    }
}