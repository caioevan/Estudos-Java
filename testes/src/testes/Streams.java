package testes;


public class Streams {

	public static void main(String[] args) {		
		
		String frase1 = "O cria beijou sua mãe";
		String frase2 = "Sua mãe";
		
		System.out.println(subtrairTexto(frase1, frase2));

	}
	
	public static String subtrairTexto (String s1, String s2) {
		String frase1 = s1.toLowerCase();
		String frase2 = s2.toLowerCase();
		
		if(frase1.contains(frase2)) {
			return frase1.replace(frase2, "");
		}
		return null;
	}
}
