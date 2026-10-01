/*G1)_ Construa um programa que:
I) Permita o usuário entrar com 2 valores (que sejam armazenados emduas variáveis, porexemplo, “a” e “b”);
II)_ Apresente “menu de opções” com 4 opções:
III)_ Após o usuário escolher uma opção, apareça uma linha informando o resultado do cálculo que foi escolhido:*/

import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;

public class ExercicioG1 {
	
    public static void main(String[] arg) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        
		
        System.out.println("Entre com o primeiro valor: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int a = Integer.parseInt(s);
        
		
        System.out.println("Entre com o segundo valor: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int b = Integer.parseInt(s);
        
        
        System.out.println("Digite a opção desejada:\n1-Somar\n2-Multiplicar\n3-Subtrair\n4-Dividir");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int escolha = Integer.parseInt(s);
        
        System.out.println("Sendo a=" +a + " e b=" +b + " o resultado eh:");
        switch(escolha) {
            case 1:
                System.out.println("A soma é igual a: " +(a + b));
                break;
            case 2:
                System.out.println("A multiplicação é igual a: " +(a * b));
                break;
            case 3:
                System.out.println("A subtração é igual a: " +(a - b));
                break;
            case 4:
                System.out.println("A divisão é igual a: " +(a / b));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}