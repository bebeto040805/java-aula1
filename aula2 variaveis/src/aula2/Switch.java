package aula2;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o valor da compra");
		double valorCompra = sc.nextDouble();
		
		System.out.println("metodo pagamento");
		System.out.println("1- Dinheiro/pix");
		System.out.println("2- Débito");
		System.out.println("3- Crédito");
		int metodoPagamento = sc.nextInt();
		int parc = sc.nextInt();
		
		double vf = sc.nextDouble();
		
		switch(metodoPagamento) {
		
		case 1:
			
			double valorFinal = valorCompra * 0.9;
			System.out.println("O valor da compra fico: " + valorFinal);
			
			System.out.println("Métodos de parcelamento: ");
			System.out.println("1- a vista");
			System.out.println("2- 2x ");
			System.out.println("3- 3x: ");


		
			switch(parc) {
			case 1:
				System.out.println(valorFinal);
				break;
				
			case 2:
				 vf = valorFinal+ valorFinal * 0.05;
				System.out.println(valorFinal);
				break;
				
				
			case 3:
				vf = valorFinal+ valorFinal * 0.10;
				System.out.println(valorFinal);
				break;
			}
	
			break;
		case 2:
			valorFinal = valorCompra * 0.95;
			System.out.println("O valor da compra fico: " + valorFinal);
			break;
		case 3:
			 valorFinal = valorCompra * 0.9;
			System.out.println("O valor da compra fico: " + valorFinal);
			break;
		
		case 4:
			 valorFinal = valorCompra * 0.9;
			System.out.println("O valor da compra fico: " + valorFinal);
			break;
			
			
		}
		System.out.println(metodoPagamento);
		}
		
		
		

	}
	


