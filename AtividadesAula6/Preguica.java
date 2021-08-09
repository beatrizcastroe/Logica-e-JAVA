package AtividadesAula6;

public class Preguica extends Animal{

	private boolean sobe;
	
	public Preguica (String nome, int idade, boolean som, boolean sobe)
	{
		super (nome, idade, som);
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
		System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade: "+getIdade()+"\nEle emite som? "+isSom()+"\nEle sobre em arvores?"+isSobe());
	}
}
