
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		double saque = 200;
		boolean conseguiuRetirar = conta.saca(saque);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar? 
				"Saque aprovado de: R$"
				+ saque 
				+" - saldo atual: "
				+ conta.saldo: "Sem dinheiro para sacar");
	}
}
