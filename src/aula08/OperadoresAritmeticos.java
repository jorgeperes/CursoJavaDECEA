package aula08;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		/*
		 * Adi��o (+);
		 * Subtra��o (-);
		 * Multiplica��o (*);
		 * Divis�o (/);
		 * M�dulo (%) - resto da divis�o;
		 * 
		 */

			int soma = 2 + 10;
			int subtra��o = 15 - 5;
			int multiplica��o = 2 * 8;
			int divis�o = 25 / 5;
			int modulo  = 5 % 2;
			
			System.out.println(soma);
			System.out.println(subtra��o);
			System.out.println(multiplica��o);
			System.out.println(divis�o);
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
