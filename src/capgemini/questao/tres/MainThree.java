package capgemini.questao.tres;

import java.util.ArrayList;

public class MainThree {

	public static void main(String[] args) {
		String expression = "ovo";
		ArrayList<String> intervals = new ArrayList<String>();
		ArrayList<String> words = new ArrayList<String>();
		
		try {
			for(int i = 0; i < expression.length(); i++) {
				for(int j = 1; j < expression.length(); j++) {
					//Procurando palavras individuais
					if(expression.charAt(i) == expression.charAt(j) && i != j && i < j) {
						String position = "[" + i + "," + j + "]";
						String anagram = "[" + expression.charAt(i) + "," + expression.charAt(j) + "]";
						intervals.add(position);
						words.add(anagram);
					} else {
						//Procurando palavras por pares
						if((j+1) < expression.length() && i != j && i < j) {					
							String a = expression.substring(i, j + 1);
							String b = expression.substring(i + 1, j + 2);
							b = new StringBuilder(b).reverse().toString();
							if(a.equalsIgnoreCase(b)) {
								String position = "[" + i + "," + j + "] | [" + j + ", " + i + "]";
								String anagram = "[" + a + "," + b + "] | [" + 
										b + "," + a + "]";
								intervals.add(position);
								words.add(anagram);
							}
						}
					}
				}
			}
			System.out.println(intervals.size());
			System.out.println(intervals.toString());
			System.out.println(words.toString());
		} catch (NullPointerException e) {
			System.out.println("Variável de entrada inválida - NULL");
		}	
	}
}
