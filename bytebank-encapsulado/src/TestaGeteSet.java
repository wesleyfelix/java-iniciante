
public class TestaGeteSet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente wesley = new Cliente();
		
		wesley.setNome("Wesley Felix");
		
//		wesley.setCpf("229.459.158-55");
//		
//		wesley.setProfissao("programador");
		
		conta.setTitular(wesley);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(wesley);
		System.out.println(conta.getTitular());
		
	}

}
