package variaveis;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu nome bebeto");
		nome = sc.next();
		System.out.println(nome);
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		System.out.println("A sua idade é " + idade);
		sc.close();
		
		
	}

}
