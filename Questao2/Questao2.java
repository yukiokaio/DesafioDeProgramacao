package Questao2;

import java.util.Scanner;


public class Questao2 {
	public static void main(String[] args) {
		
		int qt = 0,tam, i;
		boolean maiusculo = false, minusculo = false;
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Digite a senha: ");
		String senha = scanner.next(); //Recebe a senha digitada
		scanner.close();//Fecha o scanner
		    
		tam = senha.length(); // Recebe o tamanho da senha digitda
		
		for (i = 0; i < tam; i++) {// "For" percorrendo a senha
			char c = senha.charAt(i);// "c" recebe o caractere da posi��o i
			if (Character.isUpperCase(c) && maiusculo == false) { //Verifica se o caractere � mai�sculo e se ele j� foi encontrado
				qt++; //Se for, adiciona +1 a vari�vel qt
				maiusculo = true; // "maisculo" recebe true
			}
			if (Character.isLowerCase(c) && minusculo == false){ //Verifica se o caractere � min�sculo e se ele j� foi encontrado
				qt++; //Se for, adiciona +1 a vari�vel qt
				minusculo = true; // "min�sculo " recebe true
			}
			if (maiusculo == true && minusculo == true) // Se ambos j� foram encontrados, isso previne continuar buscando outros caracteres
			{
				break;//"For" � parado
			}
		}
		
		if (senha.matches(".*\\d.*")) { //Verifica se h� digitos na senha
			qt++; //Se for, adiciona +1 a vari�vel qt
			
		}
		    
		if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")  
				|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*") 
				|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) { 
			//Verifica se h� algum caractere especial
			qt++;//Se for, adiciona +1 a vari�vel qt
			
		}
		
		if(tam >= 6) {//Verifica o tamanho da senha
			qt = 4 - qt; // C�lculo para verificar quantos caracteres faltam para a senha ser segura
			System.out.println("Falta/Faltam " + qt + " caractere(es) para a senha ser segura" ); 
			// Imprime a quantidade de caracteres que faltam para a senha ser segura
			
		}else {
			qt = qt + 6 - (qt + tam); // C�lculo para verificar quantos caracteres faltam para a senha ser segura, caso a senha tenha menos que 6 caracteres
			System.out.println("Falta/Faltam " + qt + " caractere(es) para a senha ser segura"); 
			//Imprime a quantidade de caracteres que faltam para a senha ser segura
			
		}
	
	}
	    
}
