
public class TestaCondicional2 {
	
	public static void main(String[] args) {

		System.out.println("testando condicionais\n");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
	
		System.out.println(acompanhado);
		
		if (idade >= 18 && acompanhado ) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}

	}

}
