package br.com.generation.exerciciosherancapolimorfismo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cavalo cavalo1 = new Cavalo();
		Cachorro cachorro1 = new Cachorro();
		Preguica preguica1 = new Preguica();
		
		// Fazer com que o usuário digite o nome 
		// e isso seja impresso abaixo
		// Scanner entrada = new Scanner(System.in);
		
		// System.out.println("Qual o nome do cachorro: ");
		// cachorro1.setNome(entrada.nextLine());
		// System.out.println("Nome: " + cachorro1.getNome());
		
		// faz com que se abra um pop up com a info digitada
		// JOptionPane.showMessageDialog(null, cachorro1.getNome());
		
		//açoes do objeto
		cavalo1.setNome("Pangaré"); // sem os "", imprime o que foi colocado no void
		cavalo1.setIdade(5);
		cavalo1.setCorrer("Sim!");
		cavalo1.setSom("Sim!");
		
		cachorro1.setNome("Mel");
		cachorro1.setIdade(2);
		cachorro1.setCorrer("Sim!");
		cachorro1.setSom("Sim!");
		
		preguica1.setNome("Bia");
		preguica1.setIdade(10);
		preguica1.setSom("Sim!");
		preguica1.setSubirArvore("Sim!");
			
		
		System.out.println("====DADOS DOS ANIMAIS====");
		
		System.out.println("\n====CAVALO====");
		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade do animal: " + cavalo1.getIdade() + " anos");
		System.out.println("Corre? " + cavalo1.getCorrer());
		System.out.println("Emitie som? " + cachorro1.getSom());
		
		System.out.println("\n====CACHORRO====");
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade do animal: " + cachorro1.getIdade() + " anos");
		System.out.println("Corre? " + cachorro1.getCorrer());
		System.out.println("Emitie som? " + cachorro1.getSom());
		
		System.out.println("\n====PREGUIÇA====");
		System.out.println("Nome: " + preguica1.getNome());
		System.out.println("Idade do animal: " + preguica1.getIdade() + " anos");
		System.out.println("Emitie som? " + preguica1.getSom());
		System.out.println("Sobe em árvore? " + preguica1.getSubirArvore());
		
	}

}
