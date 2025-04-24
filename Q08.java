import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        while (numero != 1 && numero != 2 && numero != 3) {
            System.out.print("Digite o número 1, 2 ou 3: ");
            numero = entrada.nextInt();
        }
        System.out.println("Fim do programa.");
    }
}