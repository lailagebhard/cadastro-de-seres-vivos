package desafioSerVivo.SerVivo;

import java.util.ArrayList;
import java.util.Scanner;

public class SerVivo {
	
	Scanner scan = new Scanner(System.in);
	String filo;
	String classe;
	String ordem;
	String familia;
	String genero;
	String especie;
	int mainMenu;
	
	
	ArrayList<AnimaliaEspecie> listaAnimalia = new ArrayList<>();
//	ArrayList<FungiEspecie> listaFungi = new ArrayList<>();
	ArrayList<PlantaeEspecie> listaPlantae = new ArrayList<>();
//	ArrayList<MoneraEspecie> listaMonera = new ArrayList<>();
//	ArrayList<ProtistaEspecie> listaProtista = new ArrayList<>();
	
	
	public SerVivo() {
		super();
	}
	
	public void Menu() {
		System.out.println("O que deseja fazer?");
		System.out.println("[1]-Cadastrar novo ser vivo \n[2]-Ver seres cadastrados \n[3]-Sair");
		mainMenu = scan.nextInt();
	}
	
	public void entradaDados() {
		System.out.println("Filo: ");
		filo = scan.next();
		
		System.out.println("Classe: ");
		classe = scan.next();
	
		System.out.println("Ordem: ");
		ordem = scan.next();
	
		System.out.println("Familia: ");
		familia = scan.next();
	
		System.out.println("Genero: ");
		genero = scan.next();
		
		System.out.println("Especie: ");		
		especie = scan.next();
	}
	
	public void cadastraSer(int reino) {
		switch (reino) {
		
		case 1:
			this.entradaDados();
			listaAnimalia.add(new AnimaliaEspecie());
			this.listaAnimalia.get(listaAnimalia.size()-1).setFilo(filo);
			this.listaAnimalia.get(listaAnimalia.size()-1).setClasse(classe);
			this.listaAnimalia.get(listaAnimalia.size()-1).setOrdem(ordem);
			this.listaAnimalia.get(listaAnimalia.size()-1).setFamilia(familia);
			this.listaAnimalia.get(listaAnimalia.size()-1).setGenero(genero);
			this.listaAnimalia.get(listaAnimalia.size()-1).setEspecie(especie);
			break;
		
		case 2:
//			this.entradaDados();
//			listaFungi.add(new FungiEspecie());
//			this.listaFungi.get(listaFungi.size()-1).setFilo(filo);
//			this.listaFungi.get(listaFungi.size()-1).setClasse(classe);
//			this.listaFungi.get(listaFungi.size()-1).setOrdem(ordem);
//			this.listaFungi.get(listaFungi.size()-1).setFamilia(familia);
//			this.listaFungi.get(listaFungi.size()-1).setGenero(genero);
//			this.listaFungi.get(listaFungi.size()-1).setEspecie(especie);
//			break;
		
		case 3:
			this.entradaDados();
			listaPlantae.add(new PlantaeEspecie());
			this.listaPlantae.get(listaPlantae.size()-1).setFilo(filo);
			this.listaPlantae.get(listaPlantae.size()-1).setClasse(classe);
			this.listaPlantae.get(listaPlantae.size()-1).setOrdem(ordem);
			this.listaPlantae.get(listaPlantae.size()-1).setFamilia(familia);
			this.listaPlantae.get(listaPlantae.size()-1).setGenero(genero);
			this.listaPlantae.get(listaPlantae.size()-1).setEspecie(especie);
			break;
//		
//		case 4:
//			this.entradaDados();
//			listaMonera.add(MoneraEspecie());
//			this.listaMonera.get(listaMonera.size()-1).setFilo(filo);
//			this.listaMonera.get(listaMonera.size()-1).setClasse(classe);
//			this.listaMonera.get(listaMonera.size()-1).setOrdem(ordem);
//			this.listaMonera.get(listaMonera.size()-1).setFamilia(familia);
//			this.listaMonera.get(listaMonera.size()-1).setGenero(genero);
//			this.listaMonera.get(listaMonera.size()-1).setEspecie(especie);
//			break;
			
//		case 5:
//			this.entradaDados();
//			listaProtista.add(ProtistaEspecie());
//			this.listaProtista.get(listaProtista.size()-1).setFilo(filo);
//			this.listaProtista.get(listaProtista.size()-1).setClasse(classe);
//			this.listaProtista.get(listaProtista.size()-1).setOrdem(ordem);
//			this.listaProtista.get(listaProtista.size()-1).setFamilia(familia);
//			this.listaProtista.get(listaProtista.size()-1).setGenero(genero);
//			this.listaProtista.get(listaProtista.size()-1).setEspecie(especie);
//			break;
		default:
			break;
		}
	}

	public void mostraSeres(int reino) {
		switch (reino) {
		case 1:
			for (int i = 0; i < listaAnimalia.size(); i++) {
				System.out.println("--===--===--===--===--");
				System.out.println("Reino: "+listaAnimalia.get(i).getReino());
				System.out.println("Filo: "+listaAnimalia.get(i).getFilo());
				System.out.println("Classe: "+listaAnimalia.get(i).getClasse());
				System.out.println("Ordem: "+listaAnimalia.get(i).getOrdem());
				System.out.println("Família: "+listaAnimalia.get(i).getFamilia());
				System.out.println("Gênero: "+listaAnimalia.get(i).getGenero());
				System.out.println("Espécie: "+listaAnimalia.get(i).getEspecie());
			}
			break;
//		case 2:
//			for (int i = 0; i < listaFungi.size(); i++) {
//				System.out.println("--===--===--===--===--");
//				System.out.println("Reino: "+listaFungi.get(i).getReino());
//				System.out.println("Filo: "+listaFungi.get(i).getFilo());
//				System.out.println("Classe: "+listaFungi.get(i).getClasse());
//				System.out.println("Ordem: "+listaFungi.get(i).getOrdem());
//				System.out.println("Família: "+listaFungi.get(i).getFamilia());
//				System.out.println("Gênero: "+listaFungi.get(i).getGenero());
//				System.out.println("Espécie: "+listaFungi.get(i).getEspecie());
//			}
//			break;
		case 3:
			for (int i = 0; i < listaPlantae.size(); i++) {
				System.out.println("--===--===--===--===--");
				System.out.println("Reino: "+listaPlantae.get(i).getReino());
				System.out.println("Filo: "+listaPlantae.get(i).getFilo());
				System.out.println("Classe: "+listaPlantae.get(i).getClasse());
				System.out.println("Ordem: "+listaPlantae.get(i).getOrdem());
				System.out.println("Família: "+listaPlantae.get(i).getFamilia());
				System.out.println("Gênero: "+listaPlantae.get(i).getGenero());
				System.out.println("Espécie: "+listaPlantae.get(i).getEspecie());
			}
			break;
//		case 4:
//			for (int i = 0; i < listaMonera.size(); i++) {
//				System.out.println("--===--===--===--===--");
//				System.out.println("Reino: "+listaMonera.get(i).getReino());
//				System.out.println("Filo: "+listaMonera.get(i).getFilo());
//				System.out.println("Classe: "+listaMonera.get(i).getClasse());
//				System.out.println("Ordem: "+listaMonera.get(i).getOrdem());
//				System.out.println("Família: "+listaMonera.get(i).getFamilia());
//				System.out.println("Gênero: "+listaMonera.get(i).getGenero());
//				System.out.println("Espécie: "+listaMonera.get(i).getEspecie());
//			}
//			break;
//		case 5:
//			for (int i = 0; i < listaProtista.size(); i++) {
//				System.out.println("--===--===--===--===--");
//				System.out.println("Reino: "+listaProtista.get(i).getReino());
//				System.out.println("Filo: "+listaProtista.get(i).getFilo());
//				System.out.println("Classe: "+listaProtista.get(i).getClasse());
//				System.out.println("Ordem: "+listaProtista.get(i).getOrdem());
//				System.out.println("Família: "+listaProtista.get(i).getFamilia());
//				System.out.println("Gênero: "+listaProtista.get(i).getGenero());
//				System.out.println("Espécie: "+listaProtista.get(i).getEspecie());
//			}
//			break;
		default:
			break;
		}
	}
	
	
	
	
}