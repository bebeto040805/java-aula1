package aula2;
import java.util.Scanner;
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "pedromilho";
		String senhaSalva = "1234";
		
		System.out.println("Digite seu login");
		String login = sc.nextLine();
		System.out.println("Digite sua senha");
		String senha = sc.nextLine();
		
		if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
			System.out.println("Acesso permitido");
		}else {
			System.out.println("acesso negado");
		}
	}

}
