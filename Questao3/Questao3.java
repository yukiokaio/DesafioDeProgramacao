package Questao3;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Digite a palavra: ");
		String palavra = scanner.next();//Recebe a string digitada
		scanner.close(); //Fecha o scanner
		
		System.out.println("O n�mero de anagramas �/s�o: " + numeroDeAnagramas(palavra)); //Imprime o n�mero de anagramas
		
	}
	public static boolean temAnagramas(String palavra1, String palavra2) {//Fun��o que retorna se uma substring � ou n�o anagrama
		//"palavra1" e "palavra2" s�o substrings de palavra.
	       if(palavra1.length() != palavra2.length()) { 
	    	   return false; //O n�mero de caracteres precisa ser o mesmo, se n�o for isso previne todo o processo e retorna diretamente false
	       }
	       int count = 0;
	       boolean[] pulando = new boolean[palavra2.length()]; //Vetor para pularmos os caracteres j� verificados
	       for(int i = 0; i < palavra1.length(); i++) {
	           for(int j = 0; j < palavra2.length(); j++) {
	               if((palavra1.charAt(i) == palavra2.charAt(j)) && (!pulando[j])) { // Aqui acontece a compara��o de caracteres e se j� foram verificados para cada posi��o i e j
	                   count++; //Se atender a compara��o, count recebe +1
	                   pulando[j] = true; // E pulando recebe true para que n�o sejam mais contados em count
	                   break; //Para o for de dentro
	               }
	           }
	       }
	       if (count == palavra2.length()) { //Aqui verifica se count � igual ao tamanho da substring palavra2(sendo ela do mesmo tamanho de palavra1 como j� verificado)
	    	   return true; //Se tiverem o mesmo tamanho, quer dizer que � anagrama, e retorna true
	       }else {
	    	   return false; //Se n�o tiverem, retorna false
	       }
	}
	    
	public static int numeroDeAnagramas(String palavra) {//Fun��o que retorna a quantidade de anagramas de uma palavra
		ArrayList<String> lista = new ArrayList<>(); //Declara um ArrayList do tipo String
	        for(int i = 0; i < palavra.length(); i++) {
	            for(int j = i + 1; j <= palavra.length(); j++) { // "For" percorrendo  a palavra passada como par�metro
	                lista.add(palavra.substring(i, j)); // Recupera cada substring de uma string e armazena em uma lista
	            }
	        }
	        
	        int anagramas = 0;
	        for(int i = 0; i < lista.size(); i++) {
	            for(int j = i + 1; j < lista.size(); j++) { //"For" para percorrer a lista com as substrings
	                if(temAnagramas(lista.get(i), lista.get(j))) { //Verificando se existe anagramas nas substrings sendo passadas para "temAnagramas"
	                	anagramas++; //Se houver, anagragramas recebe +1
	                }
	            }
	        }
	        return anagramas; //Quantidade de anagramas de uma palavra
	    }
	
}
