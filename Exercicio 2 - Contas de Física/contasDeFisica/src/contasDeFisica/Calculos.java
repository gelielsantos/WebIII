package contasDeFisica;

public class Calculos {

		public float massa;
		
		public float velocidadeC;
		public float raioC;
		
		public float forcaAplicada;
		public float tempoAplicado;
		
		public float constanteDaMola;
		public float deformacaoDaMola;
		
		public float tempoViagem;
		public float distanciaViagem;
		
		public float posicaoInicial;
		public float tempoCorpo;
		public float velocidadeCorpo;
		
		public float tempoAceleracao;
		public float aceleracao;
	
	public float forcaPeso()
	{
		return this.massa * 10;
	}
	
	public float forcaCentripeta()
	{
		return this.massa * (this.velocidadeC*this.velocidadeC)/this.raioC;
	}
	
	public float impulso()
	{
		return this.forcaAplicada * this.tempoAplicado;
	}
	
	public float forcaElastica ()
	{
		return this.constanteDaMola * this.deformacaoDaMola;
	}
	
	public float velocidadeMedia ()
	{
		return this.distanciaViagem/this.tempoViagem;
	}
	
	public float mru()
	{
		return this.posicaoInicial + this.velocidadeCorpo*this.tempoCorpo;
	}
	
	public float mruv()
	{
		return this.posicaoInicial + this.velocidadeCorpo*this.tempoCorpo + (this.aceleracao*this.tempoAceleracao*this.tempoAceleracao)/2;
	}
	

}

