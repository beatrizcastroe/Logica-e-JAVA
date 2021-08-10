package AtividadesAula6;

public class Preguica extends Animal implements Som{

	private boolean sobe;
	
	public Preguica (String nome, int idade, boolean sobe)
	{
		super (nome, idade, sobe);
		this.sobe = sobe;
	}
	
	public boolean isSobe() {
		return sobe;
	}
	
	public void setSobe(boolean sobe) {
		this.sobe = sobe;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome da Preguiça: "+getNome()+"\nIdade: "+getIdade()+"\nEle sobre em arvores? "+isSobe());
		reproduzirSom();
	}

	@Override
	public void reproduzirSom() {
		System.out.println("Seu som é:");
		System.out.println("\nZZzzzzZZZZzz");
		
	}
}
