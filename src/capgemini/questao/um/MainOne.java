package capgemini.questao.um;

public class MainOne {

	public static void main(String[] args) {

		Integer steps = 6;
		String symbol = "*";
		String caracter = "";
		String quantity = "%" + steps + "s";
		
		try {
			for (int count = 1; count <= steps; count++) {
				caracter += symbol;
				System.out.println(String.format(quantity, caracter));
			}
		} catch (Exception e ) {
			System.out.println("Informar um valor inteiro para a entrada.");
		}
		
	}
}
