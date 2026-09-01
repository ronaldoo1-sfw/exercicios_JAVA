//f.1)_ Construa um programa que leia 2 valores inteiros e diga se o 1º é: maior, igual ou menor que o 2º valor.

public class Selec1 {
	
	public static void main(String arg[]){
	
	int x = Integer.parseInt(arg[0]);
	int y = Integer.parseInt(arg[1]);
	

	if(x>y){
	
		System.out.println("O primeiro número é maior que o segundo");
	
	}
	
	else if(x<y){
	
		System.out.println("O segundo número é maior que o primeiro");
	
	}

	
	else{
		
		System.out.println("Os números são iguais");
	
	}
	
	}

}
