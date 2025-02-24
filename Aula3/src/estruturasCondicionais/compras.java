package estruturasCondicionais;
import java.util.Scanner;
public class compras {

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
			 valorFinal = valorCompra * 0.9;
			System.out.println("O valor da compra fico: " + valorFinal);
			break;
		}



	}

}
