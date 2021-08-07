package AtividadesAula5;

public class Cliente {
	
	private String nome;
	private String cidade;
	private String pais;
	
	public Cliente (String n, String c, String p)
	{
		this.setNome(n);
		this.setCidade(c);
		this.setPais(p);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	public void imprimirInfo() {
		System.out.println(nome+" É UM NOVO CLIENTE DA FORNECEDORA DA CIDADE DE "+cidade+" DO PAÍS " +pais);
	}
	
	
	

}
