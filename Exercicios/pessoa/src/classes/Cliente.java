package classes;

public class Cliente extends Pessoa {
	private int pontuacao = 0;
	
	public Cliente(String nome, String telefone) {
		super(nome, telefone);
	}
	
	public Cliente(String nome, String telefone, int pontuacao) {
		super(nome, telefone);
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return String.format("Cliente:%s, celular=%s,pontuacao=%d", super.getNome(), super.getTelefone(), pontuacao);
	}
}
