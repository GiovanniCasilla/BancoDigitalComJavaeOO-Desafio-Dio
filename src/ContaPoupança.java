
public class ContaPoupanša extends Conta{

	public ContaPoupanša(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato conta poupanša ===");
		super.imprimirInfosComuns();
		
	}


		
	
}
