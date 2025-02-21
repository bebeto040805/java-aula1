package Desafios;
import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o capital");
		double C = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros");
		double taxa = sc.nextDouble();
		
		System.out.println("Digite o tempo (meses)");
		double meses = sc.nextDouble();
		
		double juros = C * taxa * meses;
		
		double montante = C + juros;
		System.out.println("Seu juros é: " + juros + " e seu montante final é:  " + montante);
		
	}

}
