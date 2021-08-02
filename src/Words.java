
public class Words {

	public static void main(String[] args) {
		char letter = 'E';
		
		switch (letter) {
		
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(letter+ " kalýn sesli bir harftir.");
				break;
			case 'E':
			case 'Ý':
			case 'Ö':
			case 'Ü':
				System.out.println(letter+ " ince sesli bir harftir.");
				break;
			default:
				System.out.println("Geçersiz harf girdiniz.");
		}
	}

}
