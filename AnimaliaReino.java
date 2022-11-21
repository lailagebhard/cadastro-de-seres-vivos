package desafioSerVivo.SerVivo;

import java.util.ArrayList;

public class AnimaliaReino extends SerVivo{
	
	
	ArrayList<AnimaliaEspecie> listaAnimalia = new ArrayList<>();
	private String reino = "Animalia";

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}
	
}
