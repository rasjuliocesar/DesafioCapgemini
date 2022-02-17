package capgemini.questao.dois;

public class MainTwo {

	public static void main(String[] args) {
		String name = "D�bora";
		String password = "Ya3&ab";	
		String rgxNumbers = ".*[0-9].*";
		String lowerCase = ".*[a-z].*";
		String upperCase = ".*[A-Z].*";
		String specialCase = ".*[!@#$%^&*()-+].*";
				
		if(!password.matches(rgxNumbers) && !password.matches(upperCase) && !password.matches(lowerCase) && !password.matches(specialCase)) {
			System.out.println("Seu password n�o atendeu a todos os quesitos de seguran�a.");
			System.out.println("Ao menos: 1 d�gito | 1 Letra min�scula | 1 Letra mai�scula | 1 caracter especial");
		} else if (password.length() < 6) {
			int num = 6 - password.length();
			System.out.println("Para um tamanho ideal, adicionar: " + num + " caracter(es)");
		} else if (password.length() > 6 && !password.matches(rgxNumbers) || !password.matches(upperCase) || !password.matches(lowerCase) || !password.matches(specialCase)) {
			System.out.println("O password possui um tamanho ideal mas n�o passou em todos os quesitos de seguran�a.");
			System.out.println("Ao menos: 1 d�gito | 1 Letra min�scula | 1 Letra mai�scula | 1 caracter especial");
		} else {
			System.out.println("Password Ideal!");
		}
	}
}
