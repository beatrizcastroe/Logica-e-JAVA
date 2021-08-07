package AtividadesAula5;

public class Aviao {

		private String nome;
		private String empresa;
		private float distancia;
		
		public Aviao (String n, String e, float d)
		{
			this.setNome(n);
			this.setEmpresa(e);
			this.setDistancia(d);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

		public float getDistancia() {
			return distancia;
		}

		public void setDistancia(float distancia) {
			this.distancia = distancia;
		}
		
		public void imprimirInfo() 
		{
			System.out.println(" "+nome+" é um avião da "+empresa+" e já voou "+distancia+" milhas de distância.");
		}
		
		public void aumentarDistancia(double dist) {
			distancia+=dist;
		}
		
		public void imprimir() {
			System.out.println("~~ MAIS UMA VIAGEM ~~");
			System.out.println(" "+nome+" percorreu "+distancia+" agora.");
		}
		
		
}
