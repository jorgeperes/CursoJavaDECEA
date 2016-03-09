package aula08;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		/*
		 * Adição (+);
		 * Subtração (-);
		 * Multiplicação (*);
		 * Divisão (/);
		 * Módulo (%) - resto da divisão;
		 * 
		 */

			int soma = 2 + 10;
			int subtração = 15 - 5;
			int multiplicação = 2 * 8;
			int divisão = 25 / 5;
			int modulo  = 5 % 2;
			
			System.out.println(soma);
			System.out.println(subtração);
			System.out.println(multiplicação);
			System.out.println(divisão);
			System.out.println(modulo);
			
			int notaAluno1 = 99;
			int notaAluno2 = 80;
			int notaAluno3 = 53;
			
			int totalGeral = notaAluno1 + notaAluno2 + notaAluno3;
			System.out.println("Total geral: " + totalGeral);
			
			
			int mediaGeral = (notaAluno1 + notaAluno2 + notaAluno3) / 3;
			System.out.println("Media geral: " + mediaGeral);
			
			
			
	}

}
