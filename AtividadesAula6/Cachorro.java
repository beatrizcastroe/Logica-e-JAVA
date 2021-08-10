package AtividadesAula6;

public class Cachorro extends Animal implements Som {
	
	public Cachorro (String nome, int idade, boolean correr)
	{
		super(nome, idade, correr);
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nIdade: "+getIdade()+"\nEle corre?"+isCorrer());
		reproduzirSom();
	}

	@Override
	public void reproduzirSom() {
		System.out.println("Seu som é:");
		System.out.println("AU AU AUA AU");
	}	

}
