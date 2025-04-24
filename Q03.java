import java.util.Scanner;

public class Q03 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu salário: R$");
        double salario = Double.valueOf(entrada.nextLine());
        
        if (salario > 2000){
        double imposto = (0.15 * salario);
        double inss = (0.10 * salario);
        System.out.println("Salario: R$" +salario);
        System.out.println("Imposto: R$" +imposto);
        System.out.println("INSS: R$" +inss);
        }else{
        System.out.println("Salario:" + salario);
        System.out.println("Imposto: R$0.00");
        System.out.println("INSS: R$0.00");
        }
    }
}
