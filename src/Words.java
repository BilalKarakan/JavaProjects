
public class Words {

	public static void main(String[] args) {
		char letter = 'E';
		
		switch (letter) {
		
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(letter+ " kal�n sesli bir harftir.");
				break;
			case 'E':
			case '�':
			case '�':
			case '�':
				System.out.println(letter+ " ince sesli bir harftir.");
				break;
			default:
				System.out.println("Ge�ersiz harf girdiniz.");
		}
	}

}
