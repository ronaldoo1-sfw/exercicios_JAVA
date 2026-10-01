/*I1)_ Construa um programa que permita ao usuário entrar comdeterminadafrase, depois permita “escolher”
uma letra qualquer e: casoaletraescolhidaesteja na frase (seja maiúscula ou minúscula) diga quantas vezes ela apareceu
e em que posição da frase. Senão, apareça uma frase informando que esta letra não existe na frase.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercicioI1 {

    public static void main(String[] arg) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String f = "";
		String x = "";
        
        System.out.println("Digite uma frase: ");
        try {
            f = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
		
		System.out.println("Digite a letra que deseja saber quantas vezes apareceu: ");
        try {
            x = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
		
		int contador = 0;
		if(f != null && x != null && !x.isEmpty()){
			String fMinuscula = f.toLowerCase();
			char letra = Character.toLowerCase(x.charAt(0));
    
			for (int i = 0; i < fMinuscula.length(); i++) {
				if (fMinuscula.charAt(i) == letra) {
				contador++;
				}
			}
		}
		
		System.out.println("\n\n A frase anterior tem "+f.length()+"caracteres");
		
		if (contador == 0) {
            System.out.println("Nenhuma letra '" + x + "' foi encontrada na frase.");
        } else {
            System.out.println("A letra '" + x + "' apareceu " + contador + " vez(es).");
        }
	}
}