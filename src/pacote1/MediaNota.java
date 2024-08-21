package pacote1;

import java.io.IOException;
import java.util.Scanner;

public class MediaNota {
	public static void main(String args[]) throws IOException {
		mediaNota();
	}
	
	public static void mediaNota() throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("====Insira o nome do(a) aluno(a)====");
		
		String nome = s.nextLine();
		
		System.out.println("====Insira a primeira nota do aluno====");
		
		int nota1 = s.nextInt();
		
		System.out.println("====Insira a segunda nota do aluno====");
		int nota2 = s.nextInt();
		
		System.out.println("====Insira a terceira nota do aluno====");
		int nota3 = s.nextInt();
		
		System.out.println("====Insira a quarta nota do aluno====");
		int nota4 = s.nextInt();
		
		int notas = nota1 + nota2 + nota3 + nota4;
		
		int mediaFinal = notas/4; 
		
		if (mediaFinal > 6) {
			System.out.println("O(A) " + nome + " teve a nota final igual a  " + mediaFinal + 
					", portanto está aprovado(a).");
		} else if (mediaFinal <= 5 && mediaFinal >= 3) {
			System.out.println("O(A) " + nome + " teve a nota final igual a " + mediaFinal + 
					", portanto está de recuperação.");
		} else {
			System.out.println("O(A) " + nome + " teve a nota final igual a " + mediaFinal + 
					", portanto está Reprovado(a).");
		}
	}
}
