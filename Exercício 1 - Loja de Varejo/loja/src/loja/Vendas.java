package loja;

public class Vendas {

	private String vendasDia;
	private String vendasSemana;
	private String vendasMes;
	
	public String getVendasDia() {
		return vendasDia;
	}
	public void setVendasDia(String vendasDia) {
		this.vendasDia = vendasDia;
	}
	public String getVendasSemana() {
		return vendasSemana;
	}
	public void setVendasSemana(String vendasSemana) {
		this.vendasSemana = vendasSemana;
	}
	public String getVendasMes() {
		return vendasMes;
	}
	public void setVendasMes(String vendasMes) {
		this.vendasMes = vendasMes;
	}
	
	public String toString()
	{
		return String.format("Essa venda foi de numero %s do dia, %s da semana e %s do mês \n", this.vendasDia, this.vendasSemana, this.vendasMes);
	}
}
