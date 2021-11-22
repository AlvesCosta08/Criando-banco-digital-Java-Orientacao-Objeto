
public class Main {

	public static void main(String[] args) {
		Cliente alves = new Cliente();
		alves.setNome("Alves Costa");
		IConta cc = new ContaCorrente(alves);
		IConta poupanca =new ContaPoupanca(alves);
		cc.depositar(850);
		
		
		cc.transferir(130,poupanca);
	
		cc.impreimirExtrato();
		poupanca.impreimirExtrato();

	}

}
