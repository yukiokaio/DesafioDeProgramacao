import java.util.Scanner; //Importando Scanner
import java.util.ArrayList; // Importando ArrayList

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Cria um objeto Scanner	
		String palavra = "";
    		while (palavra.equals("1") != true){ //Loop para rodar programa várias vezes
      			System.out.println("Digite a palavra: (Digite 1 para finalizar)");
		  	palavra = scanner.next();//Recebe a string digitada
		  	System.out.println("O número de anagramas é/são: " + numeroDeAnagramas(palavra)); //Imprime o número de anagramas
    		}
    		scanner.close(); //Fecha o scanner
		System.out.println("Programa finalizado!");
		
		
	}
	public static boolean temAnagramas(String palavra1, String palavra2) {//Função que retorna se uma substring é ou não anagrama
		//"palavra1" e "palavra2" são substrings de palavra.
	       if(palavra1.length() != palavra2.length()) { 
	    	   return false; //O número de caracteres precisa ser o mesmo, se não for isso previne todo o processo e retorna diretamente false
	       }
	       int count = 0; //Declarando variável count
	       boolean[] pulando = new boolean[palavra2.length()]; //Vetor para pularmos os caracteres já verificados
	       for(int i = 0; i < palavra1.length(); i++) {
	           for(int j = 0; j < palavra2.length(); j++) {
	               if((palavra1.charAt(i) == palavra2.charAt(j)) && (!pulando[j])) { // Aqui acontece a comparação de caracteres e se já foram verificados para cada posição i e j
	                   count++; //Se atender a comparação, count recebe +1
	                   pulando[j] = true; // E pulando recebe true para que não sejam mais contados em count
	                   break; //Para o for de dentro
	               }
	           }
	       }
	       if (count == palavra2.length()) { //Aqui verifica se count é igual ao tamanho da substring palavra2(sendo ela do mesmo tamanho de palavra1 como já verificado)
	    	   return true; //Se tiverem o mesmo tamanho, quer dizer que é anagrama, e retorna true
	       }else {
	    	   return false; //Se não tiverem, retorna false
	       }
	}
	    
	public static int numeroDeAnagramas(String palavra) {//Função que retorna a quantidade de anagramas de uma palavra
		ArrayList<String> lista = new ArrayList<>(); //Declara um ArrayList do tipo String
	        for(int i = 0; i < palavra.length(); i++) {
	            for(int j = i + 1; j <= palavra.length(); j++) { // "For" percorrendo  a palavra passada como parâmetro
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
