package desafioSerVivo.SerVivo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int mainMenu;
		String vivosMenu;
		
		SerVivo listaAnimalia = new SerVivo();
		SerVivo listaFungi = new SerVivo();
		SerVivo listaPlantae = new SerVivo();
		SerVivo listaMonera = new SerVivo();
		SerVivo listaProtista = new SerVivo();
		
		
		
		while(flag ) {
			
			System.out.println("\nO que deseja fazer?");
			System.out.println("[1]-Cadastrar novo ser vivo \n[2]-Ver listas \n[3]-Sair\n");
			mainMenu = scan.nextInt();
			
			if(mainMenu == 1) {
				System.out.println("Animalia / Fungi / Plantae / Monera / Protista");
				vivosMenu = scan.next();
				
				switch(vivosMenu.toLowerCase()) {
				
				case "animalia":
					listaAnimalia.cadastraSer(1);
					break;
				
//				case "fungi":
//					listaFungi.cadastraSer(2);
//					break;
					
				case "plantae":
					listaPlantae.cadastraSer(3);
					break;
					
//				case "monera":
//					listaMonera.cadastraSer(4);
//					break;
//					
//				case "protista":
//					listaProtista.cadastraSer(5);
//					break;
					
				
				default:
					System.out.println("Reino inválido.");
					break;
			
				} 
					
				} else if (mainMenu == 2) {
					System.out.println("Cadastros Animalia:");
					listaAnimalia.mostraSeres(1);
					System.out.println("\nCadastros Fungi:");
					listaFungi.mostraSeres(2);
					System.out.println("\nCadastros Plantae:");
					listaPlantae.mostraSeres(3);
					System.out.println("\nCadastros Monera:");
					listaMonera.mostraSeres(4);
					System.out.println("\nCadastros Protista:");
					listaProtista.mostraSeres(5);
					
				} else if (mainMenu == 3) {
					System.out.println("Programa encerrado");
					flag = false;
					
				} else {
					System.out.println("Opção inválida.");
				}
			
			
		}
		
		
		
	}

}
