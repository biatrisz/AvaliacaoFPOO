package Pessoa;

public class principal {

	public static void main(String[] args) {
		pessoa pessoa =  new pessoa ("luana");
		System.out.println("nome: " + pessoa.getNome());

		Física física = new Física ("luana", "32144", "3084023482");
		System.out.println("rg: " + física.getRg());
		System.out.println("cpf: " + física.getCpf());
	}

}
