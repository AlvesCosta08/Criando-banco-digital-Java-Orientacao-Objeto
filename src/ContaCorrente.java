
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void impreimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfoComuns();
		
	}


}
