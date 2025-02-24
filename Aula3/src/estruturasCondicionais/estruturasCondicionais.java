package estruturasCondicionais;
import java.util.Scanner;
public class estruturasCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media>=7 && media<=10) {
			System.out.println("Aprovado, sua nota foi: " + media);
		} else if (media>=0 && media <5) {
			System.out.println("Reprovado, sua nota foi: " + media);
			
		}
		if (media>=5 && media<7) {
			
		System.out.println("Recuperação, sua nota foi: " + media);
		System.out.println("Digite a nota da recuperação: ");
		double n1 = sc.nextDouble();
		
		double fim = (n1 + media)/2;
		
		
			if (fim >=7) {
				System.out.println("Aprovado, sua nota foi: " + fim);
			}else {
				System.out.println("Reprovado, sua nota foi: " + fim);
			}
	}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
