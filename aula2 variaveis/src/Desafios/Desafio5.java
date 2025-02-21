package Desafios;
import java.util.Scanner;
public class Desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio");
		double raio = sc.nextDouble();
		
		double pi = Math.PI;
		
		double area = pi *Math.pow(raio, 2);
		
		double perimetro = 2 * pi * raio;
		
	System.out.println("A area é de :" + area + " e o perímetro é: " + perimetro ) ;
				

	}

}
