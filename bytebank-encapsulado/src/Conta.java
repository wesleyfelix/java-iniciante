class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta: " + this.numero);
		
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor ){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);;
			return true;
		}
		return false;
	}
		
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(agencia <=0) {
			System.out.println("N�o � permitido valor menor ou igual a zero");
			return;
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int numero) {
		if(agencia <=0) {
			System.out.println("N�o � permitido valor menor ou igual a zero");
			return;
		}
		this.agencia = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
}
	