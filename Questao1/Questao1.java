import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i, j, k;
		System.out.println("Digite a quantidade de asteriscos: ");
	    int qt = scanner.nextInt(); //Recebe a quantidade de asteriscos 
	    scanner.close(); // Fecha o scanner
	    
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
}
