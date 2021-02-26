package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Email").toUpperCase();
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Email tem que ser @").toUpperCase();
		}
		System.out.println("Email: " + email);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
