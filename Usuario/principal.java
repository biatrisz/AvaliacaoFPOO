package Usuario;

public class principal {

	public static void main(String[] args) {
		usuario usuario = new usuario (12, "Beatriz", 123444,"SIM", "7787873");
		System.out.println("Usuario");
		System.out.println("id: " + usuario.getId());
		System.out.println("nome: " + usuario.getNome());
		System.out.println("senha: " + usuario.getPassword());
		System.out.println("permissao: " + usuario.getPermissao());
		System.out.println("usuario: " + usuario.getUsuario());

	}

}
