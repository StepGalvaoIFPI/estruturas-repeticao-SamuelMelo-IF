import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int num = Integer.valueOf(entrada.nextLine());
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}