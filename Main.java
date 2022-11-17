package desafioSerVivo.SerVivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SerVivo listaSeres = new SerVivo();
		
		listaSeres.cadastraSer(1, "filo", "classe", "ordem", "familia", "genero", "especie");
		listaSeres.cadastraSer(1, "filo111", "classe1111", "orde111m", "famil111a", "ge111nero", "es111pecie");
		listaSeres.cadastraSer(1, "fil222o", "cl2222sse", "ord222em", "fami222lia", "gene2222ro", "especi2222e");
		
		
		listaSeres.mostraSeres(1);
		
		
	}

}
