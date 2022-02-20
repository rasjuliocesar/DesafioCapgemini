package capgemini.questao.dois;

public class MainTwo {

	public static void main(String[] args) {
		String name = "Débora";
		String password = "aY&op>";	
		String rgxNumbers = ".*[0-9].*";
		String lowerCase = ".*[a-z].*";
		String upperCase = ".*[A-Z].*";
		String specialCase = ".*[!@#$%^&*()-+].*";
				
		try {
			if(!password.matches(rgxNumbers) && !password.matches(upperCase) && !password.matches(lowerCase) && !password.matches(specialCase)) {
				System.out.println("Seu password não atendeu a todos os quesitos de segurança.");
				System.out.println("Ao menos: 1 dígito | 1 Letra minúscula | 1 Letra maiúscula | 1 caracter especial");
			} else if (password.length() < 6) {
				int num = 6 - password.length();
				System.out.println("Para um tamanho ideal, adicionar: " + num + " caracter(es)");
			} else if (password.length() > 6 && !password.matches(rgxNumbers) || !password.matches(upperCase) || !password.matches(lowerCase) || !password.matches(specialCase)) {
				System.out.println("O password possui um tamanho ideal mas não passou em todos os quesitos de segurança.");
				System.out.println("Ao menos: 1 dígito | 1 Letra minúscula | 1 Letra maiúscula | 1 caracter especial");
			} else {
				System.out.println("Password Ideal!");
			}
		} catch(NullPointerException e) {
			System.out.println("Password Inválido - NULL");
		}
	}
}
