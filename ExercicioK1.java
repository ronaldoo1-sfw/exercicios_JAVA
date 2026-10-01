//K1)_ Faça o mesmo procedimento do exercício anterior, porémdestavezestará usando uma matriz bidimensional

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercicioK1{

    public static void main(String[] arg) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        int linha = 0;
        int coluna = 0;
		
        System.out.println("Digite quantas linhas a matriz terá: ");
        try {
            linha = Integer.parseInt(cd.readLine());
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
		
		System.out.println("Digite quantas colunas a matriz terá: ");
        try {
            coluna = Integer.parseInt(cd.readLine());
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
		
		int[][] matriz = new int[linha][coluna];
	
		System.out.println("\nDigite os valores para a matriz:");
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.print("Posição [" + i + "][" + j + "]: ");
                try {
                    matriz[i][j] = Integer.parseInt(cd.readLine());
                } catch (IOException | NumberFormatException e) {
                    System.out.println("Valor inválido. Digite um número inteiro.");
                    j--;
                }
            }
        }

        System.out.println("\nOs valores na ordem inversa são: ");
        for(int i = linha - 1; i >= 0; i--){
            for (int j = coluna - 1; j >= 0; j--) {
                System.out.println("Posição [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
		
	}
}