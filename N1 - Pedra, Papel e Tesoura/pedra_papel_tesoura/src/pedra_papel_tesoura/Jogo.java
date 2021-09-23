package pedra_papel_tesoura;

public class Jogo {
	
	private String comp1;
	private String player1;
	
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getComp1() {
		return comp1;
	}
	public void setComp1(String comp1) {
		this.comp1 = comp1;
	}
	public String respostaFinal(int comp, int player) 
	{
		
		if(comp==1 && player==2) {
			return "Player venceu";
		}
		else if(comp==1 && player==3) {
			return "Computador venceu";
		}
		else if(comp==2 && player==1) {
			return "Computador venceu";
		}
		else if(comp==2 && player==3) {
			return "Player venceu";
		}
		else if(comp==3 && player==1) {
			return "Player venceu";
		}
		else if(comp==3 && player==2) {
			return "Computador venceu";
		}
		else if(comp==player) {
			return "Empate";
		}
		return "Jogo Invalidado pelo VAR";
	}
	public void respostaComp(int escolha) 
	{
		switch(escolha) {
		case 1:
			setComp1("Pedra");
			break;
		case 2:
			setComp1("Papel");
			break;
		case 3:
			setComp1("Tesoura");
			break;
		}
	}
	public void respostaPlayer(int escolhaPlayer) 
	{
		
		switch(escolhaPlayer) {
		case 0:
			setPlayer1("Inválido");
			break;
		case 1:
			setPlayer1("Pedra");
			break;
		case 2:
			setPlayer1("Papel");
			break;
		case 3:
			setPlayer1("Tesoura");
			break;
		default:
			setPlayer1("Inválido");
			break;
		}
	}
	

}
