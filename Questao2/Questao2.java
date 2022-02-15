import java.util.Scanner; // Importando Scanner

public class Main {
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);//Cria um objeto Scanner	
		String senha = "";//Declarando variável
			
		while (senha.equals("1") != true) { //Loop para programa ficar rodando
			System.out.println("Digite a senha: (Digite 1 para finalizar)");
			senha = scanner.next(); //Recebe a senha digitada
			System.out.println("Falta/Faltam " + contarCaracteres(senha) + " caractere(es) para a senha ser segura"); 
			// Imprime a quantidade de caracteres faltando para a senha ser segura
		}
		scanner.close();//Fecha o scanner
		System.out.println("Programa finalizado! ");
		
	}

	public static int contarCaracteres(String senha) {
		int qt = 0,tam, i; //Declarando variáveis inteiras
		boolean maiusculo = false, minusculo = false; // Declarando variáveis booleanas 
		
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
		
		qt = 4 - qt; //Cálculo para saber quantos critérios não foram atendidos
		int temp = Math.max(0, 6 - qt - tam); // Declaração de variável temporária para cálculo de posições não preenchidas
		qt += temp; // Valor final da quantidade de caracteres faltando para a senha ser segura
		
		return qt; // Retornando a quantidade de caracteres faltando para a senha ser segura
	}
    
}
