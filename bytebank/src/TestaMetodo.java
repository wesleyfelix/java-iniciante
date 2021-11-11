
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoWesley = new Conta();
		contaDoWesley.saldo = 100;
		contaDoWesley.deposita(50);
		System.out.println(contaDoWesley.saldo);
		
		double saque = 20;
		boolean conseguiuRetirar = contaDoWesley.saca(saque);
		System.out.println(contaDoWesley.saldo);
		
		System.out.println(conseguiuRetirar? 
				"Saque aprovado de: R$"
				+ saque 
				+" - saldo atual: "
				+ contaDoWesley.saldo: "Sem dinheiro para sacar");
	
		Conta contaDaDaniela = new Conta();
		contaDaDaniela.deposita(1000);
		
		boolean sucessoNaTransferencia = contaDaDaniela.transfere(300, contaDoWesley);
		
		System.out.println(contaDoWesley.saldo);
		System.out.println(contaDaDaniela.saldo);
		
		System.out.println(sucessoNaTransferencia?"Deu certo a transferencia": "Faltou dinheiro");
		
		
		contaDoWesley.titular = "Wesley Felix";
		
		System.out.println(contaDoWesley.titular);
		
	}
}
