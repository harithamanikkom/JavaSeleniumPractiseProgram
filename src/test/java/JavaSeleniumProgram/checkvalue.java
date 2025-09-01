package JavaSeleniumProgram;

public class checkvalue {

	static int checkvalue = 15;

	public static void main(String[] args) {
		int number[] = new int[4];
		number[0] = 16;
		number[1] = 24;
		number[2] = 15;
		number[3] = 67;
		boolean found = false;
		for (int i = 0; i < 4; i++) {
			if (checkvalue == number[i]) {
				System.out.println("The number is present at index " + i);
				found = true;
				break;
			}

		}
		if (!found) { // if number not found
			System.out.println("number is not present");
		}
	}

}
