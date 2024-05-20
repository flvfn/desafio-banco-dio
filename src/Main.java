
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente iago = new Cliente();
		iago.setNome("Iago");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Conta cc2 = new ContaCorrente(iago);
		Conta cp2 = new ContaPoupanca(iago);

		cc2.depositar(1000);
		cc2.transferir(75, cc);
		cc2.transferir(950, cp2);
		cc2.sacar(300);

		cc2.imprimirExtrato();
		cp2.imprimirExtrato();

		cc.depositar(100);
		cc.transferir(500, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
