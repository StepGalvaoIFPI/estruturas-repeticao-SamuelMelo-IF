import java.util.Scanner;

public class Q04 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$");
        double salario = Double.valueOf(entrada.nextLine());

        if (salario < 1000){
            System.out.println("Salario:" + salario);
            System.out.println("Imposto: R$0.00");
            System.out.println("INSS: R$0.00");
        } else if (salario >= 1000 && salario < 2000){
            double imposto = (0.10 * salario);
            double inss = (0.11 * salario);
            System.out.println("Salario: R$" +salario);
            System.out.println("Imposto: R$" +imposto);
            System.out.println("INSS: R$" +inss);
        } else if (salario >= 2000 && salario < 3000){
            double imposto = (0.20 * salario);
            double inss = (0.15 * salario);
            System.out.println("Salario: R$" +salario);
            System.out.println("Imposto: R$" +imposto);
            System.out.println("INSS: R$" +inss);
        } else if (salario >= 3000){
            double imposto = (0.27 * salario);
            double inss = (0.20 * salario);
            System.out.println("Salario: R$" +salario);
            System.out.println("Imposto: R$" +imposto);
            System.out.println("INSS: R$" +inss);
        }
    }
}