
public abstract class Conta implements IConta 
{

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	private static final int Agencia_Padrao = 0001;
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = Conta.Agencia_Padrao;
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
		saldo += valor;
	}
	@Override
	public void transferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfosComuns()
	{
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d",  this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

	
	

	
}
