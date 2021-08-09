package AtividadesAula6;

public class Cachorro extends Animal{
	
	public Cachorro (String nome, int idade, boolean som, boolean correr)
	{
		super(nome, idade, som, correr);
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nIdade: "+getIdade()+"\nEle emite som? "+isSom()+"\nEle corre?"+isCorrer());
	}

	
	

}
