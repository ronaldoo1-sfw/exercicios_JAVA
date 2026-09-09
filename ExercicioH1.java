import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercicioH1 {

    public static void main(String[] arg) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        String t = "";

        System.out.println("Entre com um valor inteiro: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
		int x = Integer.parseInt(s);
		
		if((x % 2)==0){
			System.out.println("É Par!");
		}else{
			System.out.println("É Ímpar!");
		}
	}
}