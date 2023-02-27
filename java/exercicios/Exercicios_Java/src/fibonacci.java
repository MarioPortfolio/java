/* Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor
 *  sempre ser� a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 *   escreva um programa na linguagem que desejar onde, informado um n�mero, ele calcule a 
 *   sequ�ncia de Fibonacci e retorne uma mensagem avisando se o n�mero informado pertence ou n�o a sequ�ncia.

IMPORTANTE:
Esse n�mero pode ser informado atrav�s de qualquer entrada de sua prefer�ncia ou pode ser previamente definido no c�digo;
*/

import java.util.Scanner;

	public class fibonacci {
		
		public static void main(String[] args) {
			
			int n1 = 0, n2 = 1, n3 = 0, n;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite um n�mero inteiro positivo: ");
			n = input.nextInt();
			
			while (n > n3) {
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			
			}
			
			if (n == 0) {
				System.out.println("O n�mero est� na sequ�ncia de fibonacci");
			} else if (n == n3) {
				System.out.println("O n�mero est� na sequ�ncia de fibonacci.");
			} else {
				System.out.println("Este n�mero n�o pertence a sequ�ncia");
					
			}
			
			input.close();
		}

		}	

