
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta ContaDaDaniela = new Conta();
		
		System.out.println(ContaDaDaniela.saldo);
		
		ContaDaDaniela.titular = new Cliente();
		
		System.out.println(ContaDaDaniela.titular);
		
		ContaDaDaniela.titular.nome = "Daniela";
		
		System.out.println(ContaDaDaniela.titular.nome);

	}

}
