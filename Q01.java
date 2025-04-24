import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a velocidade do seu carro em km: ");
		float velocidade = Float.valueOf(entrada.nextLine());
		
		if (velocidade <= 80){
		    System.out.println("VERDE");
		}else{
		    System.out.print("VERMELHO");
		}
	}
}
