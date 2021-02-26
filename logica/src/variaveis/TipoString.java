package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		//String é um tipo de referência 
		//Exibir somente o nome do usuário do email
		
		String email = "mOnIca.LiMa.aEs@gmail.com";	
		
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Qntd Caracteres: " + email.length ());
		System.out.println("Tem arroba?: " + email.contains("@"));
		System.out.println("Posiçao do @: " + email.indexOf("@"));
		System.out.println("Exibir do 3º ao 5º: " + email.substring(2,5));
		System.out.println("Exibir do 5º até o fim: " + email.substring(4));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Segunda metade: " + email.substring(email.length()/2));
		System.out.println("Nome do usuario: " + email.toLowerCase().substring(0, email.indexOf("@")));
		System.out.println("Comparando primitivos: " + (7==8));
		System.out.println("Comparando Strings: " + email.equals("abc"));
		
		/* Exibir somente o nome do usuário do email
		 * 
		 * 
		 */
		System.out.println("Nome do usuário: " + email.substring(0, email.indexOf("@")));
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
