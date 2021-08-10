package AtividadesAula6;

public class Cavalo extends Animal implements Som{
	
	public Cavalo (String nome, int idade, boolean correr)
	{
		super(nome, idade, correr);
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade: "+getIdade()+"\nEle corre? "+isCorrer());
		reproduzirSom();
	}

	@Override
	public void reproduzirSom() {
		System.out.println("Seu som é:");
		System.out.println("RING RING POCOTÓ POCOTÓ");
	}	

}
