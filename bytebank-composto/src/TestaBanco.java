
public class TestaBanco {

	public static void main(String[] args) {
		Cliente wesley = new Cliente();
		
		wesley.nome = "Wesley Felix";
		wesley.cpf  = "229.459.158-55";
		wesley.profissao = "programador";
		
		Conta contaDoWesley = new Conta();
		contaDoWesley.deposita(100);
		
		contaDoWesley.titular = wesley;
		
		System.out.println(contaDoWesley.titular.nome);
		System.out.println(contaDoWesley.titular);
		
		System.out.println(wesley);

	}

}
