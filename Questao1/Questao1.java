package Questao1;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i, j, k;
		System.out.println("Digite a quantidade de asteriscos: ");
	    int qt = scanner.nextInt(); //Recebe a quantidade de asteriscos 
	    scanner.close(); // Fecha o scanner
	    
	    for (i = 1; i <= qt; i++) { //'for' come�ando de 1 at� qt
	        for (j = qt; j >= 1; j--) {//'for' come�ando de qt at� 1 
	        	if (j == i) {//Verificando se j � igual a i naquela posi��o 
	        		for (k = i; k >= 1; k--) { //"for" para imprimir a quantidade de asteriscos daquela posi��o
	        			System.out.print("*");// Imprime asteriscos
	        		}
	            } else if (j != i) { //Verificando se j � diferente de i naquela posi��o e dando espa�os
	                System.out.print(" "); // D� espa�os
	            }
	        }
	        System.out.println(); // Pula linha
	    }
	}
}
