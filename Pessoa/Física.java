package Pessoa;

public class Física extends pessoa {
	private String cpf;
	private String rg;
	 public Física(String nome) {
			super(nome);
		}

	    public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public Física(String nome, String rg, String cpf) {
			super(nome);
			this.rg = rg;
			this.cpf = cpf;
		}	
	}