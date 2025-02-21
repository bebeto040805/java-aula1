package Desafios;
import java.util.Scanner;
public class desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		double n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota");
		double n3 = sc.nextDouble();
		
		double media = (n1 + n2 + n3)/3;
		if (media >= 6) {
		System.out.println("Você está aprovado, sua média é: " + media);
		} else {
			System.out.println("Você está reprovado, sua média é: " + media);
			
			
		}
		
	}

}
