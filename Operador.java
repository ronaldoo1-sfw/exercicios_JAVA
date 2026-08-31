/*b.1)Implemente as outras operações matemática “simples” a saber
Multiplicação (*), divisão (/) e subtração (-), sendo comprimeiro termodaoperaçãoavariável “a”
e o segundo termo a variável “b”, imprimindo seu resultadoacadaoperação.*/

public class Operador {
	
	public static void main(String arg[]){
		
		System.out.println("Impressão de Resultado de Cálculos:");
		System.out.println(" ");
			
		int a = 3,b = 2;
		int c = a + b;
		int d = a - b;
		int	e = a * b;
		int	f = a / b;
		
		System.out.println("O resultado da soma de A e B é: "+ c);
		System.out.println("O resultado da subtração de A e B é: "+ d);
		System.out.println("O resultado da multiplicação de A e B é: "+ e);
		System.out.println("O resultado da divisão de A e B é: "+ f);
	}
}