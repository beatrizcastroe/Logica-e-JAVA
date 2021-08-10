package AtividadesAula6;

import java.util.Scanner;

public class Animal {
	
	private String nome;
	private int idade;
	private boolean correr;
	private boolean sobe;
	
	public Animal (String nome, int idade, boolean correr)
	{
		super ();
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o nome do animal: ");
        this.setNome(leia.nextLine());
        System.out.println("Insira a idade do animal: ");
        this.setIdade(leia.nextInt());
		this.correr = correr;
	}
	public Animal (String nome, boolean sobe, int idade)
	{
		super ();
		this.nome = nome;
		this.setSobe(sobe);
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	public boolean isSobe() {
		return sobe;
	}
	public void setSobe(boolean sobe) {
		this.sobe = sobe;
	}
}
