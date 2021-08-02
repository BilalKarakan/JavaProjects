
public class FindTheNumber {

	public static void main(String[] args) {
		int[] numbers = new int[] {1, 2, 5, 7, 9, 0};
		int findNumber = 6;
		boolean isThere = false;
		
		for(int number:numbers) {
			if(number==findNumber) {
				isThere = true;
				break;
			}
		}
		if(isThere==true) {
			System.out.println(findNumber+ " is available in the array.");
		}else {
			System.out.println(findNumber+ "is not available in the array.");

		}
	}	
	

}
