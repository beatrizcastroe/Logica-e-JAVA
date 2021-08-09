package AtividadesAula6;

public class Cavalo extends Animal {
	
	public Cavalo (String nome, int idade, boolean som, boolean correr)
	{
		super(nome, idade, som, correr);
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade: "+getIdade()+"\nEle emite som? "+isSom()+"\nEle corre?"+isCorrer());
	}	

}
