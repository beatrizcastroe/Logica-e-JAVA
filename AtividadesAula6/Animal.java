package AtividadesAula6;

import java.util.Scanner;

public class Animal {
	
	private String nome;
	private int idade;
	private boolean som;
	private boolean correr;
	
	public Animal (String nome, int idade, boolean som, boolean correr)
	{
		super ();
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o nome do animal: ");
        this.setNome(leia.nextLine());
        System.out.println("Insira a idade do animal: ");
        this.setIdade(leia.nextInt());
		this.som = som;
		this.correr = correr;
	}
	public Animal (String nome, int idade, boolean som)
	{
		super ();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
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

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}
	
	
	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	public void soltaSom()
	{
		if (isSom())
		{
			System.out.println("Sim");
		}
		else 
		{
			System.out.println("Não");
		}
	}
}
