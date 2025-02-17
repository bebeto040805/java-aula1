package Desafios;
import java.util.Scanner;
public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Celsius");
		int temp = sc.nextInt();
		
		double kelvin = (double) (temp + 273.15);
		
		double F = (double) (temp * 9/5 + 32); 
		
	    System.out.println(temp + "Celsius em Kelvin é: " + kelvin + " e em Fahrenheit é: " + F);


	}

}
