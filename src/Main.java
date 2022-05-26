import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cliente senhorX = new Cliente();
		
		String Xnome = scan.nextLine();
		
		senhorX.setNome(Xnome);
		
		Conta cc = new ContaCorrente(senhorX);
		Conta poupanca = new ContaPoupanša(senhorX);
		
		
		
		float a,b;
		
		System.out.println("Digite o valor do deposito: ");
		a = scan.nextInt();
		cc.depositar(a);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println("Digite o valor da transferencia para a poupanša: ");
		b = scan.nextInt();
		
		do {
			if(b > a)
			{
				System.out.println("quantidade de transferencia e maior do que seu saldo");
				b = 0;
				System.out.println("Digite o valor da transferencia para a poupanša: ");
				b = scan.nextInt();
			}
			
			
		}while(b > a);
		
		cc.transferir(b, poupanca);
		
		//Cobrar imposto? <-------------------------
		
		if(a >= 1904 && a <= 2827)
		{
			System.out.println("Imposto cobrado: 7,5% ");
			float x = a * 7.5f/ 100;
			cc.sacar(x);
			System.out.println("Total cobrado:- " + x);
		}
		if(a >= 2828 && a <= 3750)
		{
			System.out.println("Imposto cobrado: 15% ");
			float x = a * 15f/ 100;
			cc.sacar(x);
			System.out.println("Total cobrado:- " + x);
		}
		if(a >= 3751 && a <= 4664)
		{
			System.out.println("Imposto cobrado: 22,5% ");
			float x = a * 22.5f/ 100;
			cc.sacar(x);
			System.out.println("Total cobrado:- " + x);
		}
		if(a >= 4665)
		{
			System.out.println("Imposto cobrado: 27,5% ");
			float x = a * 27.5f/ 100;
			cc.sacar(x);
			System.out.println("Total cobrado:- " + x);
		}
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		if(b >= 0)
		{
			System.out.println("Saldo trasnferido com sucesso!!!");
			
		}
		else
		{
			System.out.println("QUE!!!");
		}
		
		
		
		
	}

}
