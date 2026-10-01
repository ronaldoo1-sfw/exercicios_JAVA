/*J1)_ Crie um programa, no qual terá um vetor de inteiros, cujo tamanho será definido pelo valor de uma variável local, que permita ao usuário entrar com os valores. 
Depois, estes valores serão apresentados na ordem inversa à da entrada.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercicioJ1 {

    public static void main(String[] arg) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        int tamanho = 0;
        
        System.out.println("Digite o tamanho do vetor: ");
        try {
            tamanho = Integer.parseInt(cd.readLine());
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
		
		int[] vetor = new int[tamanho];
		
		System.out.println("\nDigite os valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            try {
                vetor[i] = Integer.parseInt(cd.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
                i--;
            }
        }

		System.out.println("\nOS Valores na Ordem Inversa: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
		
	}
}