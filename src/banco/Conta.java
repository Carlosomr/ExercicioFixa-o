package banco;

public class Conta {
		private int numeroConta;
	    private String nome;
	    private double saldo;
	    
		public Conta(int numeroConta, String nome) {
			this.numeroConta = numeroConta;
			this.nome = nome;
		}

		public Conta(int numeroConta, String nome, double inicialdeposito) {
			this.numeroConta = numeroConta;
			this.nome = nome;
			deposito(inicialdeposito); //chamando metodo deposito e encapsulando//
		}

		public int getNumeroConta() {
			return numeroConta;
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getSaldo() {
			return saldo;
		}
		
		public void deposito (double quantidade) {
			saldo = saldo + quantidade;
		}
		
		public void saque (double quantidade) {
			saldo = saldo - quantidade - 5.0;
		}
		public String toString() {
			return "Conta "
					+ numeroConta
					+ ", nome: "
					+ nome
					+ ", Saldo: $ "
					+ String.format("%.2f", saldo);
		}
			

}

	    


