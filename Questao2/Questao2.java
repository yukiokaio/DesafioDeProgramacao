import java.util.Scanner; // Importando Scanner

public class Questao2 {
	public static void main(String[] args) {
		
		int qt = 0,tam, i; //Declarando variáveis inteiras
		boolean maiusculo = false, minusculo = false; // Declarando variáveis booleanas 
		
		Scanner scanner = new Scanner(System.in);//Cria um objeto Scanner	
		
		System.out.println("Digite a senha: ");
		String senha = scanner.next(); //Recebe a senha digitada
		scanner.close();//Fecha o scanner
		    
		tam = senha.length(); // Recebe o tamanho da senha digitda
		
		for (i = 0; i < tam; i++) {// "For" percorrendo a senha
			char c = senha.charAt(i);// "c" recebe o caractere da posição i
			if (Character.isUpperCase(c) && maiusculo == false) { //Verifica se o caractere é maiúsculo e se ele já foi encontrado
				qt++; //Se for, adiciona +1 a variável qt
				maiusculo = true; // "maisculo" recebe true
			}
			if (Character.isLowerCase(c) && minusculo == false){ //Verifica se o caractere é minúsculo e se ele já foi encontrado
				qt++; //Se for, adiciona +1 a variável qt
				minusculo = true; // "minúsculo " recebe true
			}
			if (maiusculo == true && minusculo == true) // Se ambos já foram encontrados, isso previne continuar buscando outros caracteres
			{
				break;//"For" é parado
			}
		}
		
		if (senha.matches(".*\\d.*")) { //Verifica se há digitos na senha
			qt++; //Se for, adiciona +1 a variável qt
			
		}
		    
		if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")  
				|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*") 
				|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) { 
			//Verifica se há algum caractere especial
			qt++;//Se for, adiciona +1 a variável qt
			
		}
		
		if(tam >= 6) {//Verifica o tamanho da senha
			qt = 4 - qt; // Cálculo para verificar quantos caracteres faltam para a senha ser segura
			System.out.println("Falta/Faltam " + qt + " caractere(es) para a senha ser segura" ); 
			// Imprime a quantidade de caracteres que faltam para a senha ser segura
			
		}else {
			qt = qt + 6 - (qt + tam); // Cálculo para verificar quantos caracteres faltam para a senha ser segura, caso a senha tenha menos que 6 caracteres
			System.out.println("Falta/Faltam " + qt + " caractere(es) para a senha ser segura"); 
			//Imprime a quantidade de caracteres que faltam para a senha ser segura
			
		}
	
	}
	    
}
