package Desafios;
import java.util.Scanner;
public class desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Capital inicial");
		double CI = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros");
		double tj = sc.nextDouble();
		
		System.out.println("Digite o número de meses");
		double meses = sc.nextDouble();
		
		double montante = CI * Math.pow((1 + tj), meses);
		
		System.out.println("O montante é: " + montante);
	}

}
