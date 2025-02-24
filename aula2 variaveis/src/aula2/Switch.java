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
		System.out.println("3- Método parcelamento");
		
		int metodoPagamento = sc.nextInt();
		int parc = sc.nextInt();
		
		switch(metodoPagamento) {
		
		case 1:
			
			double valorFinal = valorCompra * 0.9;
			System.out.println("O valor da compra fico: " + valorFinal);
	
			break;
		case 2:
			valorFinal = valorCompra * 0.95;
			System.out.println("O valor da compra fico: " + valorFinal);
			break;
		case 3:
			
			System.out.println("A vista");
			System.out.println("1- 2x");
			System.out.println("2- 3x");
			
			
			
			int metodoParcelamento = sc.nextInt();
			
			
			switch (metodoParcelamento) {
			case 1: 
				System.out.println("O valor ficou: " + valorCompra);
				break;
				
			case 2: 
				valorFinal = valorCompra * 1.05;
				System.out.println("O valor ficou: " + valorCompra);
				break;
				
			case 3: 
				valorFinal = valorCompra * 1.1;
				System.out.println("O valor ficou: " + valorCompra);
				break;
				
			}
			
			break;
		
			
			
		}
		System.out.println(metodoPagamento);
		}
		
		
		

	}
	


