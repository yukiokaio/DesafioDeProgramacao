import java.util.Scanner; // Importando Scanner

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Cria um objeto Scanner
		int i, j, k, qt = 1; // Declarando variáveis inteiras
		while (qt != 0){
			System.out.println("Digite a quantidade de asteriscos: (Digite 0 para finalizar)");
			int qt = scanner.nextInt(); //Recebe a quantidade de asteriscos 

			for (i = 1; i <= qt; i++) { //'for' começando de 1 até qt
				for (j = qt; j >= 1; j--) {//'for' começando de qt até 1 
					if (j == i) {//Verificando se j é igual a i naquela posição 
						for (k = i; k >= 1; k--) { //"for" para imprimir a quantidade de asteriscos daquela posição
							System.out.print("*");// Imprime asteriscos
						}
					 } else if (j != i) { //Verificando se j é diferente de i naquela posição e dando espaços
						System.out.print(" "); // Dá espaços
				    }
				}
				System.out.println(); // Pula linha
			}
		}
		scanner.close(); // Fecha o scanner
		System.out.println("Programa Finalizado");
	}
}
