
public class ContaPoupan�a extends Conta{

	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato conta poupan�a ===");
		super.imprimirInfosComuns();
		
	}


		
	
}
