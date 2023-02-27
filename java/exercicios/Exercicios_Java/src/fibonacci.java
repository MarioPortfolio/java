/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 *  sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 *   escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
 *   sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
*/

import java.util.Scanner;

	public class fibonacci {
		
		public static void main(String[] args) {
			
			int n1 = 0, n2 = 1, n3 = 0, n;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite um número inteiro positivo: ");
			n = input.nextInt();
			
			while (n > n3) {
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			
			}
			
			if (n == 0) {
				System.out.println("O número está na sequência de fibonacci");
			} else if (n == n3) {
				System.out.println("O número está na sequência de fibonacci.");
			} else {
				System.out.println("Este número não pertence a sequência");
					
			}
			
			input.close();
		}

		}	

