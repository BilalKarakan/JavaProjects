
public class PrimeNumbers {

	public static void main(String[] args) {
		int number = -1;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println(number+ " is not a prime number");
			return;
		}
		
		if(number<1) {
			System.out.println("Invalid Number");
			return;
		}
		
		for(int i = 2; i<number; i++ ) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime == true) {
			System.out.println(number+ " is a prime number");
		}else {
			System.out.println(number+ " is not a prime number");
		}
	}	

}
